package net.paavan.recipesskill.speechlet;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.json.SpeechletRequestModule;
import com.amazon.speech.speechlet.*;
import com.amazon.speech.speechlet.interfaces.display.Display;
import com.amazon.speech.speechlet.interfaces.display.directive.RenderTemplateDirective;
import com.amazon.speech.speechlet.interfaces.display.request.ElementSelectedRequest;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

import static net.paavan.recipesskill.RenderTemplateDirectiveFactory.*;

@Slf4j
public class RecipesSpeechlet implements SpeechletV2, Display {
    private static final ObjectMapper MAPPER = new ObjectMapper() {{
        configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        // For context object
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
        registerModule(new SpeechletRequestModule());
    }};

    @Override
    public void onSessionStarted(SpeechletRequestEnvelope<SessionStartedRequest> speechletRequestEnvelope) {
        logSpeechletRequest("onSessionStarted", speechletRequestEnvelope);
    }

    @Override
    public SpeechletResponse onLaunch(SpeechletRequestEnvelope<LaunchRequest> speechletRequestEnvelope) {
        logSpeechletRequest("onLaunch", speechletRequestEnvelope);

        SpeechletResponse response = new SpeechletResponse();

        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText("Hello! This is the recipes skill which renders some or the other display templates on the Echo screen.");
        response.setOutputSpeech(outputSpeech);
        response.setDirectives(Arrays.asList(getListTemplate2Directive()));

        logSpeechletResponse(response);
        return response;
    }

    @Override
    public SpeechletResponse onIntent(SpeechletRequestEnvelope<IntentRequest> speechletRequestEnvelope) {
        logSpeechletRequest("onIntent", speechletRequestEnvelope);

        SpeechletResponse response = new SpeechletResponse();

        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText("Hello! This is the recipes skill which renders some or the other display templates on the Echo screen.");
        response.setOutputSpeech(outputSpeech);
        response.setShouldEndSession(false);

        RenderTemplateDirective directive;
        switch (speechletRequestEnvelope.getRequest().getIntent().getName()) {
            case "GetBodyTemplateOne":
                directive = getBodyTemplate1Directive();
                break;
            case "GetBodyTemplateThree":
                directive = getBodyTemplate3Directive();
                break;
            case "GetListTemplateOne":
                directive = getListTemplate1Directive();
                break;
            case "GetListTemplateTwo":
            default:
                directive = getListTemplate2Directive();
                break;
        }

        response.setDirectives(Arrays.asList(directive));

        logSpeechletResponse(response);
        return response;
    }

    @Override
    public void onSessionEnded(SpeechletRequestEnvelope<SessionEndedRequest> speechletRequestEnvelope) {
        logSpeechletRequest("onSessionEnded", speechletRequestEnvelope);
    }

    @Override
    public SpeechletResponse onElementSelected(SpeechletRequestEnvelope<ElementSelectedRequest> speechletRequestEnvelope) {
        logSpeechletRequest("onElementSelected", speechletRequestEnvelope);
        SpeechletResponse response = new SpeechletResponse();
        response.setShouldEndSession(false);

        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText("Selected something.");
        response.setOutputSpeech(outputSpeech);
//        response.setDirectives(Arrays.asList(getListTemplate2Directive()));

        logSpeechletResponse(response);
        return response;
    }

    private void logSpeechletRequest(final String tag, final SpeechletRequestEnvelope<?> requestEnvelope) {
        try {
            log.info(tag + " SpeechletRequestEnvelope: " + MAPPER.writeValueAsString(requestEnvelope));
        } catch (final JsonProcessingException e) {
            log.error("Error serializing speechlet request", e);
        }
    }

    private void logSpeechletResponse(final SpeechletResponse response) {
        try {
            log.info("SpeechletResponse: " + MAPPER.writeValueAsString(response));
        } catch (final JsonProcessingException e) {
            log.error("Error serializing speechlet response", e);
        }
    }
}

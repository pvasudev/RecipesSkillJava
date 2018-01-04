package net.paavan.recipesskill.speechlet;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.HashSet;
import java.util.Set;

public class RecipesSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> SUPPORTED_APPLICATION_IDS = new HashSet<String>() {{
        add("amzn1.ask.skill.2b03ce91-c470-4310-bd20-fd2ea28f5319");
    }};

    public RecipesSpeechletRequestStreamHandler() {
        super(new RecipesSpeechlet(), SUPPORTED_APPLICATION_IDS);
    }
}

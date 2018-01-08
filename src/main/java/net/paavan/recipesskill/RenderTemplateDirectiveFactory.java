package net.paavan.recipesskill;

import com.amazon.speech.speechlet.interfaces.display.directive.RenderTemplateDirective;
import com.amazon.speech.speechlet.interfaces.display.element.Image;
import com.amazon.speech.speechlet.interfaces.display.element.ImageInstance;
import com.amazon.speech.speechlet.interfaces.display.element.PlainText;
import com.amazon.speech.speechlet.interfaces.display.template.*;

import java.util.Arrays;

public class RenderTemplateDirectiveFactory {
    public static RenderTemplateDirective getBodyTemplate1Directive() {
        BodyTemplate1 bodyTemplate1 = new BodyTemplate1();
        bodyTemplate1.setToken("SomeToken");
        bodyTemplate1.setTitle("This is the body template 1");

        // Text Content
        BodyTemplate1.TextContent textContent = new BodyTemplate1.TextContent();

        PlainText primaryText = new PlainText();
        primaryText.setText("This is primary text");
        textContent.setPrimaryText(primaryText);

        PlainText secondaryText = new PlainText();
        secondaryText.setText("This is secondary text");
        textContent.setSecondaryText(secondaryText);

        PlainText tertiaryText = new PlainText();
        tertiaryText.setText("This is tertiary text");
        textContent.setTertiaryText(tertiaryText);

        bodyTemplate1.setTextContent(textContent);

        // Background Image
        Image backgroundImage = new Image();

        backgroundImage.setContentDescription("This is the content description");

        ImageInstance imageInstance = new ImageInstance();
        imageInstance.setWidthPixels(1107);
        imageInstance.setHeightPixels(474);
        imageInstance.setUrl("https://s3.amazonaws.com/audioplayerskill/CosyVehicleImage-4.jpg");
        // This caused problems rendering the response
//        imageInstance.setSize(ImageSize.LARGE);

        backgroundImage.setSources(Arrays.asList(imageInstance));

        bodyTemplate1.setBackgroundImage(backgroundImage);
        bodyTemplate1.setBackButtonBehavior(Template.BackButtonBehavior.HIDDEN);

        RenderTemplateDirective directive = new RenderTemplateDirective();
        directive.setTemplate(bodyTemplate1);
        return directive;
    }

    public static RenderTemplateDirective getBodyTemplate3Directive() {
        BodyTemplate3 bodyTemplate3 = new BodyTemplate3();
        bodyTemplate3.setToken("SomeToken");
        bodyTemplate3.setTitle("This is the body template 3");
        bodyTemplate3.setBackButtonBehavior(Template.BackButtonBehavior.HIDDEN);

        // Text Content
        BodyTemplate3.TextContent textContent = new BodyTemplate3.TextContent();

        PlainText primaryText = new PlainText();
        primaryText.setText("A recipe is a set of instructions that describes how to prepare or make something, especially a culinary dish. It is " +
                "also used in medicine or in information technology (user acceptance).");
        textContent.setPrimaryText(primaryText);

        PlainText secondaryText = new PlainText();
        secondaryText.setText("The earliest known written recipes date from approximately 1600 BC and come from an Akkadian tablet from southern " +
                "Babylonia. There are also ancient Egyptian hieroglyphics depicting the preparation of food.");
        textContent.setSecondaryText(secondaryText);

        PlainText tertiaryText = new PlainText();
        tertiaryText.setText("Many ancient Greek recipes are known. Mithaecus's cookbook was an early one, but most of it has been lost; Athenaeus " +
                "quotes one short recipe in his Deipnosophistae. Athenaeus mentions many other cookbooks, all of them lost.");
        textContent.setTertiaryText(tertiaryText);

        bodyTemplate3.setTextContent(textContent);

        // Background Image
        Image backgroundImage = new Image();

        backgroundImage.setContentDescription("This is the content description");

        ImageInstance imageInstance = new ImageInstance();
        imageInstance.setWidthPixels(1024);
        imageInstance.setHeightPixels(600);
        imageInstance.setUrl("https://s3.amazonaws.com/mkusters-images/road_background.png");
        // This caused problems rendering the response
//        imageInstance.setSize(ImageSize.LARGE);

        backgroundImage.setSources(Arrays.asList(imageInstance));

        bodyTemplate3.setBackgroundImage(backgroundImage);

        // Image
        Image frontImage = new Image();
        ImageInstance frontImageInstance = new ImageInstance();
        frontImageInstance.setWidthPixels(1107);
        frontImageInstance.setHeightPixels(474);
        frontImageInstance.setUrl("https://s3.amazonaws.com/audioplayerskill/CosyVehicleImage-4.jpg");
        frontImage.setSources(Arrays.asList(frontImageInstance));
        frontImage.setContentDescription("This is the front image content description");

        bodyTemplate3.setImage(frontImage);

        RenderTemplateDirective directive = new RenderTemplateDirective();
        directive.setTemplate(bodyTemplate3);
        return directive;
    }

    public static RenderTemplateDirective getListTemplate1Directive() {
        ListTemplate1 listTemplate1 = new ListTemplate1();
        listTemplate1.setTitle("This is the list template 1");
        listTemplate1.setToken("SomeToken");
        listTemplate1.setBackButtonBehavior(Template.BackButtonBehavior.VISIBLE);

        // Background Image
        Image backgroundImage = new Image();

        backgroundImage.setContentDescription("This is the content description");

        ImageInstance imageInstance = new ImageInstance();
        imageInstance.setWidthPixels(1024);
        imageInstance.setHeightPixels(600);
        imageInstance.setUrl("https://s3.amazonaws.com/mkusters-images/road_background.png");
        // This caused problems rendering the response
//        imageInstance.setSize(ImageSize.LARGE);

        backgroundImage.setSources(Arrays.asList(imageInstance));

        listTemplate1.setBackgroundImage(backgroundImage);

        // List Items
        ListTemplate1.ListItem listItem1 = new ListTemplate1.ListItem();
        listItem1.setToken("ListItem1");
        Image frontImage = new Image();
        ImageInstance frontImageInstance = new ImageInstance();
        frontImageInstance.setWidthPixels(1107);
        frontImageInstance.setHeightPixels(474);
        frontImageInstance.setUrl("https://s3.amazonaws.com/audioplayerskill/CosyVehicleImage-4.jpg");
        frontImage.setSources(Arrays.asList(frontImageInstance));
        frontImage.setContentDescription("This is the front image content description");
        listItem1.setImage(frontImage);
        ListTemplate1.ListItem.TextContent textContent = new ListTemplate1.ListItem.TextContent();

        PlainText primaryText = new PlainText();
        primaryText.setText("A recipe is a set of instructions that describes how to prepare or make something, especially a culinary dish. It is " +
                "also used in medicine or in information technology (user acceptance).");
        textContent.setPrimaryText(primaryText);

        PlainText secondaryText = new PlainText();
        secondaryText.setText("The earliest known written recipes date from approximately 1600 BC and come from an Akkadian tablet from southern " +
                "Babylonia. There are also ancient Egyptian hieroglyphics depicting the preparation of food.");
        textContent.setSecondaryText(secondaryText);

        PlainText tertiaryText = new PlainText();
        tertiaryText.setText("Many ancient Greek recipes are known. Mithaecus's cookbook was an early one, but most of it has been lost; Athenaeus " +
                "quotes one short recipe in his Deipnosophistae. Athenaeus mentions many other cookbooks, all of them lost.");
        textContent.setTertiaryText(tertiaryText);

        listItem1.setTextContent(textContent);

        ListTemplate1.ListItem listItem2 = new ListTemplate1.ListItem();
        listItem2.setToken("ListItem2");
        listItem2.setImage(frontImage);
        listItem2.setTextContent(textContent);

        ListTemplate1.ListItem listItem3 = new ListTemplate1.ListItem();
        listItem3.setToken("ListItem3");
        listItem3.setImage(frontImage);
        listItem3.setTextContent(textContent);

        ListTemplate1.ListItem listItem4 = new ListTemplate1.ListItem();
        listItem4.setToken("ListItem4");
        listItem4.setImage(frontImage);
        listItem4.setTextContent(textContent);

        listTemplate1.setListItems(Arrays.asList(listItem1, listItem2, listItem3, listItem4));

        RenderTemplateDirective directive = new RenderTemplateDirective();
        directive.setTemplate(listTemplate1);
        return directive;
    }

    public static RenderTemplateDirective getListTemplate2Directive() {
        ListTemplate2 listTemplate2 = new ListTemplate2();
        listTemplate2.setTitle("This is the list template 2");
        listTemplate2.setToken("SomeToken");
        listTemplate2.setBackButtonBehavior(Template.BackButtonBehavior.VISIBLE);

        // Background Image
        Image backgroundImage = new Image();

        backgroundImage.setContentDescription("This is the content description");

        ImageInstance imageInstance = new ImageInstance();
        imageInstance.setWidthPixels(1024);
        imageInstance.setHeightPixels(600);
        imageInstance.setUrl("https://s3.amazonaws.com/mkusters-images/road_background.png");
        // This caused problems rendering the response
//        imageInstance.setSize(ImageSize.LARGE);

        backgroundImage.setSources(Arrays.asList(imageInstance));

        listTemplate2.setBackgroundImage(backgroundImage);

        // List Items
        ListTemplate2.ListItem listItem1 = new ListTemplate2.ListItem();
        listItem1.setToken("ListItem1");
        Image frontImage = new Image();
        ImageInstance frontImageInstance = new ImageInstance();
        frontImageInstance.setWidthPixels(1107);
        frontImageInstance.setHeightPixels(474);
        frontImageInstance.setUrl("https://s3.amazonaws.com/audioplayerskill/CosyVehicleImage-4.jpg");
        frontImage.setSources(Arrays.asList(frontImageInstance));
        frontImage.setContentDescription("This is the front image content description");
        listItem1.setImage(frontImage);
        ListTemplate2.ListItem.TextContent textContent = new ListTemplate2.ListItem.TextContent();

        PlainText primaryText = new PlainText();
        primaryText.setText("A recipe is a set of instructions that describes how to prepare or make something, especially a culinary dish. It is " +
                "also used in medicine or in information technology (user acceptance).");
        textContent.setPrimaryText(primaryText);

        PlainText secondaryText = new PlainText();
        secondaryText.setText("The earliest known written recipes date from approximately 1600 BC and come from an Akkadian tablet from southern " +
                "Babylonia. There are also ancient Egyptian hieroglyphics depicting the preparation of food.");
        textContent.setSecondaryText(secondaryText);

        PlainText tertiaryText = new PlainText();
        tertiaryText.setText("Many ancient Greek recipes are known. Mithaecus's cookbook was an early one, but most of it has been lost; Athenaeus " +
                "quotes one short recipe in his Deipnosophistae. Athenaeus mentions many other cookbooks, all of them lost.");
        textContent.setTertiaryText(tertiaryText);

        listItem1.setTextContent(textContent);

        ListTemplate2.ListItem listItem2 = new ListTemplate2.ListItem();
        listItem2.setToken("ListItem2");
        listItem2.setImage(frontImage);
        listItem2.setTextContent(textContent);

        ListTemplate2.ListItem listItem3 = new ListTemplate2.ListItem();
        listItem3.setToken("ListItem3");
        listItem3.setImage(frontImage);
        listItem3.setTextContent(textContent);

        ListTemplate2.ListItem listItem4 = new ListTemplate2.ListItem();
        listItem4.setToken("ListItem4");
        listItem4.setImage(frontImage);
        listItem4.setTextContent(textContent);

        listTemplate2.setListItems(Arrays.asList(listItem1, listItem2, listItem3, listItem4));

        RenderTemplateDirective directive = new RenderTemplateDirective();
        directive.setTemplate(listTemplate2);
        return directive;
    }
}

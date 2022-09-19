package com.bcs.certification.digitalloan.questions;

import com.bcs.certification.digitalloan.UI.offerUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class offerQuestion implements Question {

    private final String validationText;

    public offerQuestion(String validation) {
        this.validationText = validation;
    }

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(offerUI.TEXT_VALIDATE_OFFER, WebElementStateMatchers.isVisible())
                .forNoMoreThan(15)
                .seconds();

        if(Text.of(offerUI.TEXT_VALIDATE_OFFER)
                .viewedBy(actor)
                .asString()
                .equals(validationText.toString()
                )
        )
            return true;
        else
            return false;
    }
    public static offerQuestion offerQuestion(String validationText){
        return new offerQuestion(validationText);
    }
}
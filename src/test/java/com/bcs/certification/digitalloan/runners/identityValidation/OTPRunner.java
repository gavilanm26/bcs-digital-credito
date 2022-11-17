package com.bcs.certification.digitalloan.runners.identityValidation;

import com.bcs.certification.digitalloan.utils.customrunner.customRunner;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(customRunner.class)
@CucumberOptions(
        features = {"src/test/resources/features/identityValidation/OTP.feature"},
        glue = {"com.bcs.certification.digitalloan.stepdefinitions"},
        monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@successfulOTP"
)
public class OTPRunner {
}
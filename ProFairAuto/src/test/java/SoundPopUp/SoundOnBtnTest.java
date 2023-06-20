package SoundPopUp;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class SoundOnBtnTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();


    @Test
    @Description("Sound On Functionality Test")
    @Severity(SeverityLevel.CRITICAL)
    public void SoundOn() {

        sleep(10000);

        actionSteps.soundOnHover();
        actionSteps.soundOnClick();

    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}


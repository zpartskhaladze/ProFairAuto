package Autoplay;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class Autoplay25RoundsTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Autoplay 25 Rounds Test")
    @Severity(SeverityLevel.NORMAL)
    public void autoplay25RoundsTest() {
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.clickBetButton();
        actionSteps.click1USD();
        actionSteps.clickAutoplayBtn();
        actionSteps.hoverAutoplay25Rounds();
        actionSteps.clickAutoplay25Rounds();


    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}


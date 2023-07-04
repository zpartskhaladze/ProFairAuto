package Autoplay;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class Autoplay50RoundsTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Autoplay 50 Rounds Test")
    @Severity(SeverityLevel.NORMAL)
    public void autoplay50RoundsTest() {
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.clickBetButton();
        actionSteps.click1USD();
        actionSteps.clickAutoplayBtn();
        actionSteps.hoverAutoplay50Rounds();
        actionSteps.clickAutoplay50Rounds();


    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}


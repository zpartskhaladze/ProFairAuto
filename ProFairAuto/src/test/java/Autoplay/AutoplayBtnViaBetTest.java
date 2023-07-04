package Autoplay;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class AutoplayBtnViaBetTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Autoplay Button Test via Bet")
    @Severity(SeverityLevel.NORMAL)
    public void betButtonTest() {
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.clickBetButton();
        actionSteps.click1USD();
        actionSteps.hoverAutoplayBtn();
        actionSteps.clickAutoplayBtn();


    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}


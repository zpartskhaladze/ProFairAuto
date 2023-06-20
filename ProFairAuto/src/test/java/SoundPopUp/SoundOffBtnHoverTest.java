package SoundPopUp;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class SoundOffBtnHoverTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Sound Off Highlight Animation Test")
    @Severity(SeverityLevel.NORMAL)
    public void soundOff() {
        sleep(10000);
        actionSteps.soundOffHover();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}

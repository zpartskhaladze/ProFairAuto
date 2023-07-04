package Sound;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class SoundButtonTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Sound Button Test")
    @Severity(SeverityLevel.CRITICAL)
    public void soundOff() {
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.clickSoundOnBTN();
        actionSteps.clickSoundOffBTN();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}

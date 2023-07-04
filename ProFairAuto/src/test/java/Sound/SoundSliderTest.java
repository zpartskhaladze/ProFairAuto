package Sound;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class SoundSliderTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Sound Slider Test")
    @Severity(SeverityLevel.CRITICAL)
    public void soundOff() {
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.hoverSoundBTN();
        actionSteps.clickSoundSlider1();
        actionSteps.clickSoundSlider2();
        actionSteps.clickSoundSlider3();

    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}

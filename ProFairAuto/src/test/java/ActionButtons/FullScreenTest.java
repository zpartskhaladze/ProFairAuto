package ActionButtons;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class FullScreenTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Enter/Exit Full Screen")
    @Severity(SeverityLevel.NORMAL)
    public void fullScreenTest(){
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.EnterFullScreen();
        sleep(500);
        actionSteps.ExitFullScreen();


    }
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}


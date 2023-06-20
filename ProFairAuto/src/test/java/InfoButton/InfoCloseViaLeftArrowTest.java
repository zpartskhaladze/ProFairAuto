package InfoButton;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class InfoCloseViaLeftArrowTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();


    @Test
    @Description("Close Info Button Via Left Arrow")
    @Severity(SeverityLevel.NORMAL)
    public void testInfoButton() {
        sleep(10000);
        actionSteps.soundOffHover();
        actionSteps.soundOffClick();
        actionSteps.infoBtnClick();
        actionSteps.infoLeftArrowHover();
        actionSteps.infoLeftArrowClick();

    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}
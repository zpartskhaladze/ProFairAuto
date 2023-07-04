package Info;

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
    @Description("Close Info Button Via Right Arrow")
    @Severity(SeverityLevel.NORMAL)
    public void testLeftArrow() {
        sleep(10000);
        actionSteps.soundOffHover();
        actionSteps.soundOffClick();
        actionSteps.infoBtnClick();
        actionSteps.infoRightArrowHover();
        for (int i = 0; i < 3; i++) {
            actionSteps.infoRightArrowClick();
        }
        actionSteps.infoLeftArrowHover();
        for (int j = 0; j < 4; j++) {
            actionSteps.infoLeftArrowClick();
        }
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}

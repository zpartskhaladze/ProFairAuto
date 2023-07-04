package Info;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class InfoScrollBarTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Scrolling via Paginator")
    @Severity(SeverityLevel.NORMAL)
    public void scrollBarTest() {
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.infoBtnClick();
        actionSteps.clickTrack1();
        actionSteps.clickTrack2();
        actionSteps.clickTrack3();


    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}


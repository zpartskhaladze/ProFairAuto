package ActionButtons;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class BetTableTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Enter/Exit Full Screen")
    @Severity(SeverityLevel.NORMAL)
    public void betTableTest() {
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.clickBetButton();
        actionSteps.hover1USD();
        actionSteps.click1USD();
        actionSteps.clickBetButton();
        actionSteps.hover60USD();
        actionSteps.click60USD();
        actionSteps.clickBetButton();
        actionSteps.hover10USD();
        actionSteps.click10USD();


    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}


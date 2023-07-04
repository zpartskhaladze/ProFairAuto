package Info;

import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class PaginatorTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Scrolling via Paginator")
    @Severity(SeverityLevel.NORMAL)
    public void paginatorTest(){
        sleep(10000);
        actionSteps.soundOffClick();
        actionSteps.infoBtnClick();
        actionSteps.paginator2Hover();
        actionSteps.paginator2Click();
        actionSteps.paginator1Hover();
        actionSteps.paginator1Click();
        actionSteps.paginator3Hover();
        actionSteps.paginator3Click();
        actionSteps.paginator4Hover();
        actionSteps.paginator4Click();
        sleep(1000);

    }
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshotBytes) {
        return screenshotBytes;
    }
}


package Utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ScreenshotUtils {
    private static final int SHORT_DELAY = 30; // Short delay in milliseconds

    @Attachment(value = "{screenshotName}", type = "image/png")
    public static byte[] takeScreenshot(String screenshotName) {
        // Delay before taking the screenshot
        delay();

        // Capture screenshot using Selenium WebDriver
        TakesScreenshot screenshot = (TakesScreenshot) getWebDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }

    private static void delay() {
        try {
            Thread.sleep(ScreenshotUtils.SHORT_DELAY);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            // Handle the exception if needed
        }
    }
}

package Utils;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ChromeRunner {
    @BeforeMethod(description = "Set up browser settings")
    public static void setUp() {

        open("https://qa-dev.games.profairgames.com/slot/the_bank_heist/");
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure",new AllureSelenide().screenshots(true)
                .savePageSource(false));
    }




    @AfterMethod(description = "Clear cache and cookies")
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
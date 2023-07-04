package StepObjects;

import PageObject.Elements;
import Utils.ScreenshotUtils;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.actions;


public class ActionSteps {
    @Step("Hover Sound Off Popup")
    public void soundOffHover() {
        actions().moveToElement(Elements.soundOffPopup, Elements.xOffset, Elements.yOffset).perform();
        ScreenshotUtils.takeScreenshot("Hover Sound Off Popup");
    }

    @Step("Click on Sound Off Popup")
    public void soundOffClick() {
        actions().moveToElement(Elements.soundOffPopup, Elements.xOffset, Elements.yOffset).click().perform();
        ScreenshotUtils.takeScreenshot("Click Sound Off Popup");
    }

    @Step("Hover Sound On Popup")
    public void soundOnHover() {
        actions().moveToElement(Elements.soundOnPopup, Elements.xOffset2, Elements.yOffset2).perform();
        ScreenshotUtils.takeScreenshot("Hover Sound On Popup");
    }

    @Step("Click on Sound On Popup")
    public void soundOnClick() {
        actions().moveToElement(Elements.soundOnPopup, Elements.xOffset2, Elements.yOffset2).click().perform();
        ScreenshotUtils.takeScreenshot(("Click Sound On Popup"));
    }

    @Step("Click Sound On Button")
    public void clickSoundOnBTN() {
        actions().moveToElement(Elements.SoundButton, Elements.getxOffset27, Elements.getyOffset27)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Sound On Button"));
    }

    @Step("Click Sound Off Button")
    public void clickSoundOffBTN() {
        actions().moveToElement(Elements.SoundButton, Elements.getxOffset27, Elements.getyOffset27)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Sound Off Button"));
    }

    @Step("Hover Sound Button")
    public void hoverSoundBTN() {
        actions().moveToElement(Elements.SoundButton, Elements.getxOffset27, Elements.getyOffset27).perform();
        ScreenshotUtils.takeScreenshot(("Hover Sound Button"));
    }

    @Step("Click on Sound Slider 1")
    public void clickSoundSlider1() {
        actions().moveToElement(Elements.SoundSliderPoint1, Elements.getxOffset28, Elements.getyOffset28)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click on Sound Slider 1"));
    }

    @Step("Click on Sound Slider 2")
    public void clickSoundSlider2() {
        actions().moveToElement(Elements.SoundSliderPoint2, Elements.getxOffset29, Elements.getyOffset29)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click on Sound Slider 2"));

    }

    @Step("Click on Sound Slider 3")
    public void clickSoundSlider3() {
        actions().moveToElement(Elements.SoundSliderPoint3, Elements.getxOffset30, Elements.getyOffset30)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click on Sound Slider 3"));
    }

    @Step("Click on Info Button")
    public void infoBtnClick() {
        actions().moveToElement(Elements.infoBTN, Elements.getxOffset3, Elements.getyOffset3).click().perform();
        ScreenshotUtils.takeScreenshot(("Click Info Button"));
    }

    @Step("Hover Info Close Button")
    public void infoCloseBTNHover() {
        actions().moveToElement(Elements.InfoCloseBTN, Elements.getxOffset4, Elements.getyOffset4).perform();
        ScreenshotUtils.takeScreenshot(("Hover Info Close Button"));
    }

    @Step("Click on Info Close Button")
    public void infoCloseBTNClick() {
        actions().moveToElement(Elements.InfoCloseBTN, Elements.getxOffset4, Elements.getyOffset4)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Info Close Button"));
    }

    @Step("Hover Left Info Arrow")
    public void infoLeftArrowHover() {
        actions().moveToElement(Elements.InfoLeftArrow, Elements.getxOffset5, Elements.getyOffset5).perform();
        ScreenshotUtils.takeScreenshot(("Hover Info Left Arrow"));
    }

    @Step("Click on Left Info Arrow")
    public void infoLeftArrowClick() {
        actions().moveToElement(Elements.InfoLeftArrow, Elements.getxOffset5, Elements.getyOffset5).
                click().perform();
        ScreenshotUtils.takeScreenshot(("Click Info Left Arrow"));
    }

    @Step("Hover Right Info Arrow")
    public void infoRightArrowHover() {
        actions().moveToElement(Elements.InfoRightArrow, Elements.getxOffset6, Elements.getyOffset6).perform();
        ScreenshotUtils.takeScreenshot(("Hover Info Right Arrow"));
    }

    @Step("Click on Right Info Arrow")
    public void infoRightArrowClick() {
        actions().moveToElement(Elements.InfoRightArrow, Elements.getxOffset6, Elements.getyOffset6)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Right Info Arrow"));

    }

    @Step("Hover Paginator1")
    public void paginator1Hover() {
        actions().moveToElement(Elements.InfoPaginator1, Elements.getxOffset7, Elements.getyOffset7).perform();
        ScreenshotUtils.takeScreenshot(("Hover Paginator1"));

    }

    @Step("Click on Paginator1")
    public void paginator1Click() {
        actions().moveToElement(Elements.InfoPaginator1, Elements.getxOffset7, Elements.getyOffset7)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Paginator1"));

    }

    @Step("Hover Paginator2")
    public void paginator2Hover() {
        actions().moveToElement(Elements.InfoPaginator2, Elements.getxOffset8, Elements.getyOffset8).perform();
        ScreenshotUtils.takeScreenshot(("Hover Paginator2"));

    }

    @Step("Click on Paginator2")
    public void paginator2Click() {
        actions().moveToElement(Elements.InfoPaginator2, Elements.getxOffset8, Elements.getyOffset8)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Paginator2"));

    }

    @Step("Hover Paginator3")
    public void paginator3Hover() {
        actions().moveToElement(Elements.InfoPaginator3, Elements.getxOffset9, Elements.getyOffset9).perform();
        ScreenshotUtils.takeScreenshot(("Hover Paginator3"));

    }

    @Step("Click on Paginator3")
    public void paginator3Click() {
        actions().moveToElement(Elements.InfoPaginator3, Elements.getxOffset9, Elements.getyOffset9)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Paginator3"));

    }

    @Step("Hover Paginator4")
    public void paginator4Hover() {
        actions().moveToElement(Elements.InfoPaginator4, Elements.getxOffset10, Elements.getyOffset10).perform();
        ScreenshotUtils.takeScreenshot(("Hover Paginator4"));

    }

    @Step("Click on Paginator4")
    public void paginator4Click() {
        actions().moveToElement(Elements.InfoPaginator4, Elements.getxOffset10, Elements.getyOffset10)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Paginator4"));

    }


    @Step("Click on Scroll Track1")
    public void clickTrack1() {
        actions().moveToElement(Elements.InfoScrollPoint1, Elements.getxOffset11, Elements.getyOffset11)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Clik Scroll Track1"));
    }


    @Step("Click on Scroll Track2")
    public void clickTrack2() {
        actions().moveToElement(Elements.InfoScrollPoint2, Elements.getxOffset12, Elements.getyOffset12).click()
                .perform();
        ScreenshotUtils.takeScreenshot(("Click Scroll Track2"));
    }


    @Step("Click on Scroll Track3")
    public void clickTrack3() {
        actions().moveToElement(Elements.InfoScrollPoint3, Elements.getxOffset13, Elements.getyOffset13).click()
                .perform();
        ScreenshotUtils.takeScreenshot(("Click Scroll Track3"));
    }

    @Step("Enter Full Screen")
    public void EnterFullScreen() {
        actions().moveToElement(Elements.EnterFullScreen, Elements.getxOffset14, Elements.getyOffset14).click()
                .perform();
        ScreenshotUtils.takeScreenshot(("Enter Full Screen"));
    }

    @Step("Exit Full Screen")
    public void ExitFullScreen() {
        actions().moveToElement(Elements.ExitFullScreen, Elements.getxOffset15, Elements.getyOffset15).click()
                .perform();
        ScreenshotUtils.takeScreenshot(("Exit Full Screen"));
    }


    @Step("Click Max Bet")
    public void clickMaxBet() {
        actions().moveToElement(Elements.MaxBet, Elements.getxOffset16, Elements.getyOffset16).click()
                .perform();
        ScreenshotUtils.takeScreenshot(("Click Max Bet"));
    }


    @Step("Hover Bet Button")
    public void hoverBetButton() {
        actions().moveToElement(Elements.BetButton, Elements.getxOffset17, Elements.getyOffset17).perform();
        ScreenshotUtils.takeScreenshot(("Hover Bet Button"));
    }

    @Step("Click Bet Button")
    public void clickBetButton() {
        actions().moveToElement(Elements.BetButton, Elements.getxOffset17, Elements.getyOffset17).click()
                .perform();
        ScreenshotUtils.takeScreenshot(("Click Bet Button"));
    }

    @Step("Hover 1 USD Bet")
    public void hover1USD() {
        actions().moveToElement(Elements.Bet1USD, Elements.getxOffset18, Elements.getyOffset18).perform();
        ScreenshotUtils.takeScreenshot(("Hover 1USD Bet"));

    }

    @Step("Place 1 USD Bet")
    public void click1USD() {
        actions().moveToElement(Elements.Bet1USD, Elements.getxOffset18, Elements.getyOffset18).click().perform();
        ScreenshotUtils.takeScreenshot(("Click 1USD Bet"));
    }

    @Step("Hover 60 USD Bet")
    public void hover60USD() {
        actions().moveToElement(Elements.Bet60USD, Elements.getxOffset19, Elements.getyOffset19).perform();
        ScreenshotUtils.takeScreenshot(("Hover 60USD Bet"));
    }

    @Step("Place 60 USD Bet")
    public void click60USD() {
        actions().moveToElement(Elements.Bet60USD, Elements.getxOffset19, Elements.getyOffset19).click().perform();
        ScreenshotUtils.takeScreenshot(("Click 60USD Bet"));
    }

    @Step("Hover 10 USD Bet")
    public void hover10USD() {
        actions().moveToElement(Elements.Bet10USD, Elements.getxOffset20, Elements.getyOffset20).perform();
        ScreenshotUtils.takeScreenshot(("Hover 10USD Bet"));
    }

    @Step("Place 10 USD Bet")
    public void click10USD() {
        actions().moveToElement(Elements.Bet10USD, Elements.getxOffset20, Elements.getyOffset20).click()
                .perform();
        ScreenshotUtils.takeScreenshot(("Click 10USD Bet"));
    }

    @Step("Hover Autoplay button")
    public void hoverAutoplayBtn() {
        actions().moveToElement(Elements.AutoplayBTN, Elements.getxOffset21, Elements.getyOffset21).perform();
        ScreenshotUtils.takeScreenshot(("Hover Autoplay Button"));
    }

    @Step("Click Autoplay button")
    public void clickAutoplayBtn() {
        actions().moveToElement(Elements.AutoplayBTN, Elements.getxOffset21, Elements.getyOffset21).click()
                .perform();
        ScreenshotUtils.takeScreenshot(("Click Autoplay Button"));
    }

    @Step("Hover Autoplay 25 Rounds")
    public void hoverAutoplay25Rounds() {
        actions().moveToElement(Elements.Autoplay25Rounds, Elements.getxOffset22, Elements.getyOffset22).perform();
        ScreenshotUtils.takeScreenshot(("Hover Autoplay 25 Rounds"));

    }

    @Step("Click Autoplay 25 Rounds")
    public void clickAutoplay25Rounds() {
        actions().moveToElement(Elements.Autoplay25Rounds, Elements.getxOffset22, Elements.getyOffset22)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Autoplay 25 Rounds"));
    }

    @Step("Hover Autoplay 50 Rounds")
    public void hoverAutoplay50Rounds() {
        actions().moveToElement(Elements.Autoplay50Rounds, Elements.getxOffset23, Elements.getyOffset23).perform();
        ScreenshotUtils.takeScreenshot(("Hover Autoplay 50 Rounds"));

    }

    @Step("Click Autoplay 50 Rounds")
    public void clickAutoplay50Rounds() {
        actions().moveToElement(Elements.Autoplay50Rounds, Elements.getxOffset23, Elements.getyOffset23)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Autoplay 50 Rounds"));
    }

    @Step("Hover Autoplay 100 Rounds")
    public void hoverAutoplay100Rounds() {
        actions().moveToElement(Elements.Autoplay100Rounds, Elements.getxOffset24, Elements.getyOffset24).perform();
        ScreenshotUtils.takeScreenshot(("Hover Autoplay 100 Rounds"));

    }

    @Step("Click Autoplay 100 Rounds")
    public void clickAutoplay100Rounds() {
        actions().moveToElement(Elements.Autoplay100Rounds, Elements.getxOffset24, Elements.getyOffset24)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Autoplay 100 Rounds"));
    }

    @Step("Hover Autoplay 200 Rounds")
    public void hoverAutoplay200Rounds() {
        actions().moveToElement(Elements.Autoplay200Rounds, Elements.getxOffset25, Elements.getyOffset25).perform();
        ScreenshotUtils.takeScreenshot(("Hover Autoplay 200 Rounds"));

    }

    @Step("Click Autoplay 200 Rounds")
    public void clickAutoplay200Rounds() {
        actions().moveToElement(Elements.Autoplay200Rounds, Elements.getxOffset25, Elements.getyOffset25)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Autoplay 200 Rounds"));
    }

    @Step("Click Stop Spin Button")
    public void clickStopSpinBTN() {
        actions().moveToElement(Elements.SpinButton, Elements.getxOffset26, Elements.getyOffset26)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click Stop Spin button"));
    }

    @Step("Click  Spin Button")
    public void clickSpinBTN() {
        actions().moveToElement(Elements.SpinButton, Elements.getxOffset26, Elements.getyOffset26)
                .click().perform();
        ScreenshotUtils.takeScreenshot(("Click  Spin button"));

    }


}

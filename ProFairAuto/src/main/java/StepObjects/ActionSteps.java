package StepObjects;

import PageObject.Elements;
import Utils.ScreenshotUtils;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.actions;


public class ActionSteps {
    @Step ("Hover Sound Off Button")
    public void soundOffHover() {
        actions().moveToElement(Elements.soundOFFBTN, Elements.xOffset, Elements.yOffset).perform();
        ScreenshotUtils.takeScreenshot("Hover Sound Off Button");
    }

    @Step("Click on Sound Off Button")
    public void soundOffClick() {
        actions().moveToElement(Elements.soundOFFBTN, Elements.xOffset, Elements.yOffset).click().perform();
        ScreenshotUtils.takeScreenshot("Click Sound Off Button");
    }

    @Step("Hover Sound On Button")
    public void soundOnHover() {
        actions().moveToElement(Elements.soundONBTN, Elements.xOffset2, Elements.yOffset2).perform();
        ScreenshotUtils.takeScreenshot("Hover Sound On Button");
    }

    @Step("Click on Sound On Button")
    public void soundOnClick() {
        actions().moveToElement(Elements.soundONBTN, Elements.xOffset2, Elements.yOffset2).click().perform();
        ScreenshotUtils.takeScreenshot(("Click Sound On Button"));
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
        actions().moveToElement(Elements.InfoCloseBTN, Elements.getxOffset4, Elements.getyOffset4).click().perform();
        ScreenshotUtils.takeScreenshot(("Click Info Close Button"));
    }

    @Step("Hover Left Info Arrow")
    public void infoLeftArrowHover() {
        actions().moveToElement(Elements.InfoLeftArrow, Elements.getxOffset5, Elements.getyOffset5).perform();
        ScreenshotUtils.takeScreenshot(("Hover Info Left Arrow"));
    }

    @Step("Click on Left Info Arrow")
    public void infoLeftArrowClick() {
        actions().moveToElement(Elements.InfoLeftArrow, Elements.getxOffset5, Elements.getyOffset5).click().perform();
        ScreenshotUtils.takeScreenshot(("Click Info Left Arrow"));
    }
}

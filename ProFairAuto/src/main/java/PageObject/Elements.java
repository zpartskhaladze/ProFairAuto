package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class Elements {
    public static SelenideElement soundOFFBTN = $(byTagName("canvas"));
    public static int xOffset = 100;
    public static int yOffset = 100;

    public static SelenideElement soundONBTN = $(byTagName("canvas"));
    public static int xOffset2 = -100;
    public static int yOffset2 = 100;

    public static SelenideElement infoBTN = $(byTagName("canvas"));
    public static int getxOffset3 = -560;
    public static int getyOffset3 = 300;

    public static SelenideElement InfoCloseBTN = $(byTagName("canvas"));
    public static int getxOffset4 = 365;
    public static int getyOffset4 = -240;

    public static SelenideElement InfoLeftArrow= $(byTagName("canvas"));
    public static int getxOffset5= -450;
    public static int getyOffset5= 0;

}

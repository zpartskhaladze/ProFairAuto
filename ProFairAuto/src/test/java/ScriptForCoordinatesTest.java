import StepObjects.ActionSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.sleep;

public class ScriptForCoordinatesTest extends ChromeRunner {
    ActionSteps actionSteps = new ActionSteps();

    @Test
    @Description("Autoplay Button Test via Bet")
    @Severity(SeverityLevel.NORMAL)
    public void experimentTest() {
        sleep(10000);

        // Add the JavaScript snippet to highlight clicks
        String jsSnippet = "var clicked = 0;"
                + "function onClick(event) {"
                + "  clicked++;"
                + "  var e = event || window.event;"
                + "  var dot = document.createElement('div');"
                + "  dot.style.position = 'absolute';"
                + "  dot.style.left = e.clientX + 'px';"
                + "  dot.style.top = e.clientY + 'px';"
                + "  dot.style.width = '7px';"  // Increased size by 2 pixels
                + "  dot.style.height = '7px';" // Increased size by 2 pixels
                + "  dot.style.borderRadius = '50%';"
                + "  dot.style.backgroundColor = 'red';" // Set the background color to red
                + "  document.body.appendChild(dot);"
                + "}"
                + "document.addEventListener('click', onClick);";


        // Execute the JavaScript snippet
        executeJavaScript(jsSnippet);





    }
}





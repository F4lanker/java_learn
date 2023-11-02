import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/*
*Main page of AppleInsider.ru
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@name='s']");
    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Searching carry out and press Enter
     * @param searchString is the Searching field on the page
     */
    public void search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
    }
    public void openWebSite(String url){
        Selenide.open(url);
    }
}

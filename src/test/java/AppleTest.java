import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest{
    private final static String Base_URL = "https://appleinsider.ru/";
    private final static String Search_String = "Чем отличается iPhone 13 от iPhone 12";

    @Test
    public void checkHref(){
        MainPage mainPage = new MainPage(Base_URL);
        //mainPage.openWebSite(Base_URL); simpliest way how to call the URL
        mainPage.search(Search_String);
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFrom1();
        Assert.assertTrue(href.contains("iphone-13"));

    }
}

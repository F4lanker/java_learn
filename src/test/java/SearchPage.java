import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;
public class SearchPage {
    public static Object getHrefFrom1;
    private final ElementsCollection firstArticle = $$x("//h2/a");

    //return href from the very first article on the opened page
    public String getHrefFrom1(){
        return firstArticle.first().getAttribute("href");

    }

}

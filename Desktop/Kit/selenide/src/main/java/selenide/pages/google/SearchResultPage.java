package selenide.pages.google;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    private ElementsCollection linkResult = $$("#rso > div:nth-child(1) > div .g");

    public ElementsCollection getLinkResult() {
        return linkResult;
    }
}

package com.test.pages;

import com.test.base.BasePage;
import com.test.locators.Name;
import com.test.util.Constants;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static com.test.base.BaseTest.driver;

public class SearchPage extends BasePage {

    public void openSearchPage() {
        driver.get(Constants.BASE_URL);
    }

    public void typeKeys() {
        type("typing message into search bar", Constants.SearchTerm, new Name("q"));
        AnyKey("Pressed ENTER key", Keys.ENTER, new Name("q"));
    }

    public void checkIfLoaded() {
        Assert.assertTrue(isElementPresent(new Name("q")));
    }
}

package net.test;

import com.test.base.BaseTest;
import com.test.pages.Pages;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void openGooglePage(){
        Pages.searchPage().openSearchPage();
        Pages.searchPage().typeKeys();
        Pages.searchPage().checkIfLoaded();
    }

}

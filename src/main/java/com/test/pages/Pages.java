package com.test.pages;

public class Pages {
    private static SearchPage searchPage;

    public static SearchPage searchPage() {
        if (searchPage == null) {
            searchPage = new SearchPage();
        }
        return searchPage;
    }

}

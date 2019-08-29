package com.test.actions;

public class Actions {

    private static MainActions mainActions;
    private static SearchActions searchActions;

    public static MainActions mainActions() {
        if (mainActions == null) {
            mainActions = new MainActions();
        }
        return mainActions;
    }

    public static SearchActions searchActions() {
        if (searchActions == null) {
            searchActions = new SearchActions();
        }
        return searchActions;
    }
}

package com.test.util;

import java.util.Properties;

public class Constants {
    Properties props;

    public static final String DEFAULT_BROWSER = System.getProperty("browser");
    //public static final String DEFAULT_BROWSER = "chrome";
    //public static String DEFAULT_LIB_DIR = ".\\lib\\driver";
    public static String DEFAULT_LIB_DIR = System.getProperty("lib.dir");

    public static final int ELEMENT_MEGA_EXTRALONG_TIMEOUT_SECONDS = 360;
    public static final int ELEMENT_EXTRALONG_TIMEOUT_SECONDS = 180;
    public static final int ELEMENT_LONG_TIMEOUT_SECONDS = 120;
    public static final int ELEMENT_TIMEOUT_SECONDS = 60;
    public static final int ELEMENT_SMALL_TIMEOUT_MILLISECONDS = 10;
    public static final int ELEMENT_EXTRASMALL_TIMEOUT_SECONDS = 5;
    public static final int ELEMENT_MICRO_TIMEOUT_SECONDS = 2;

    public static String BASE_URL = System.getProperty("baseurl");
    //public static String BASE_URL = "https://www.google.com";
    public static String SearchTerm = "google";


}

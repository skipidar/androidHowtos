package com.binaryme.helloWebViewExtended;

public class mUtils {
	
    /**
     * Generates a unique Id.
     */
    private static int uid = 1;

    public static int generateUniqueId() {
        return ++uid;
    }

}

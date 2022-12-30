package com.gradle;

public class LibraryUtils {
    static final String VERSION_CODE = "1.0.0";
    static final String FROM = "remote";

    public static void libraryVersion(){
        System.out.println("library version: " + VERSION_CODE);
        System.out.println("library from " + FROM);
        System.out.println("=================================");
    }
}

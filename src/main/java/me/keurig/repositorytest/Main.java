package me.keurig.repositorytest;

import me.keurig.repositorytest.version.Version;
import me.keurig.repositorytest.version.Version_1;
import me.keurig.repositorytest.version.Version_2;

public class Main {
    
    // patch 01
    private Version version;

    public static void main(String[] args) {

        // Run
        new Main().init();

        // Print
        System.out.println("Hello World");
    }

    private void init() {
        version = new Version_2();
        version.close();
    }
}
package me.keurig.repositorytest;

import me.keurig.repositorytest.version.Version;
import me.keurig.repositorytest.version.Version_1;
import me.keurig.repositorytest.version.Version_2;

public class Main {

    private Version version;

    public static void main(String[] args) {
        new Main().init();
        System.out.println("Hello World");
    }

    private void init() {
        version = new Version_1();
        version.close();
    }
}
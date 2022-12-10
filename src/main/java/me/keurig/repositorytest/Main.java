package me.keurig.repositorytest;

import me.keurig.repositorytest.version.Version;
import me.keurig.repositorytest.version.Version_1;
import me.keurig.repositorytest.version.Version_2;

public class Main {

    private Version v;

    public static void main(String[] args) {
        new Main().init();
    }

    private void init() {
        v = new Version_1();
        v.close();
    }
}
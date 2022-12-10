package me.keurig.repositorytest.version;

public class Version_2 implements Version {
    @Override
    public void print() {
        System.out.println("Version 2");
    }

    @Override
    public void close() {
        print();
        System.out.println("Closed 2");
    }
}

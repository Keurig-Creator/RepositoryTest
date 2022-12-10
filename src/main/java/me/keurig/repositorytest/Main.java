package me.keurig.repositorytest;

import me.keurig.repositorytest.version.Version;
import me.keurig.repositorytest.version.Version_1;
import me.keurig.repositorytest.version.Version_2;

import java.util.Scanner;

public class Main {
    
    // Version
    private Version version;

    public static void main(String[] args) {

        // Run
        new Main().init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a version, 1 or 2.");

        while (true) {
            String input = scanner.next();
            input = input.toLowerCase();

            if (input.equals("1")) {
                version = new Version_1();
                break;
            } else if (input.equals("2")) {
                version = new Version_2();
                break;
            } else {
                System.out.println("Invalid input! 1 or 2.");
            }
        }

        version.print();
    }
}
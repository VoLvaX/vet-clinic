package main.java.com.magicvet;

import main.java.com.magicvet.component.Application_Scanner;
import java.util.Scanner;

public class Main {

    public static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Application_Scanner runner = new Application_Scanner();
        runner.run();
    }

}

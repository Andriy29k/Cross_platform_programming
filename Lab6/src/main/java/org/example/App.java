package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        DatabaseHandler dbHandler = new DatabaseHandler();
        /**String name = scanner.nextLine();
        String type = scanner.nextLine();**/

        dbHandler.addProduct("Apple", 203, 34, "Fruits");
    }
}

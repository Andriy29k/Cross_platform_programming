package org.example;

public class Main {
    public static void main( String[] args ) {
    DatabaseHandler dbHandler = new DatabaseHandler();
    //dbHandler.addProduct("Shampoo","Hygienic","70","32");
    //dbHandler.outputInfo();
    //dbHandler.deleteProduct(13);
        dbHandler.outputInfo();
        dbHandler.updateProduct(3,300,455, 11);
        System.out.println("------------------------------------------Updated-------------------------------------");
        dbHandler.outputInfo();

    }
}

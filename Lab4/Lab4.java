package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab4 {

    //checked
    public static void saveToFullDisc()throws IOException{
        File file= new File("sddf");
        Scanner sc = new Scanner(file);
    }
    //unchecked
    public static void myMethod(){
        String nullVariable=null;
        nullVariable.length();
    }
    //unchecked
    public static float division(int x, int y){
        float result = x / y;
        return result;
    }
    public static void task4() throws ScannerExeption{
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x=Integer.parseInt(scanner.nextLine());
            if(x<=0){
                throw new ScannerExeption("Користувач ввів число більше нуля!");
            }
        }
    }
    public static void main(String[] args) {
        try {
            saveToFullDisc();
        } catch (IOException e){
            System.out.println("Запис на заповнений диск!");
        }
        System.out.println("Продовження роботи програми");

        try{
            myMethod();
        } catch (NullPointerException exception){
            System.out.println("Не працює з NULL!");
        }
        System.out.println("Продовження роботи програми");

        try{
            division(2,0);
        } catch (ArithmeticException arithmeticException){
            System.out.println("Арифметична помилка!");
        }
        System.out.println("Продовження роботи програми");

        try {
            System.out.println("Введіть число: ");
            task4();
        } catch (ScannerExeption ex){
            System.out.println("Мій створений виняток");
        }
        System.out.println("Продовження роботи програми");

    }
}

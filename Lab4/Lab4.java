package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Lab4 {

    //checked
    public static void saveToFullDisc(String fileName, String content) throws DiskFullException {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            throw new DiskFullException("Помилка запису на диск: заповнений диск");
        }
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
            saveToFullDisc("Test.txt","Empty");
        } catch (DiskFullException e){
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

        //add try-catch-finally
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\123\\Test.txt"), "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                System.out.println("FileReader.");
            } catch (IOException e) {
                System.err.println("Помилка сталась при закритті файлу: " + e.getMessage());
            }
        }

    }
}

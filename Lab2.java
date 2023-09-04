package org.example;
import java.util.Random;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (rand.nextInt(11) + 10);
            System.out.print(array[i] + "  ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number:");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; ++i) {
            if (num == array[i]) {
                count++;
                }
            }
            System.out.println("\nNum count in array: " + count);
        }
    }
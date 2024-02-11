package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tam Sayıyı Giriniz : ");
        a = scanner.nextInt();
        if(a%2==0)
            System.out.println("\nGirilen Sayı Çifttir.");
        else
            System.out.println("\nGirilen Sayı Tektir.");
        scanner.close();
    }
}
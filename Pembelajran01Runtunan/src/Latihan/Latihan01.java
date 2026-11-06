package Latihan;

import java.util.Scanner;

public class Latihan01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius, fahrenheit, reamur, kelvin;

        System.out.print("Masukkan suhu Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;
        reamur = celsius * 4 / 5;
        kelvin = celsius + 273.15;

        System.out.println("\n=== HASIL KONVERSI SUHU ===");
        System.out.println("Celsius    : " + celsius);
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Reamur     : " + reamur);
        System.out.println("Kelvin     : " + kelvin);

        input.close();
    }
}
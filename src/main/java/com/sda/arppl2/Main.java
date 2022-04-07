
package com.sda.arppl2;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 wykonane");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Jak masz na imie ");
        String name = scanner.nextLine();

        System.out.println("Jak się nazywasz? ");
        String surname = scanner.nextLine();

        Osoba osoba = new Osoba(name,surname);


        System.out.println("Twoja osoba ma na imie: "+osoba.imie+ " a nazywa się : "+ osoba.nazwisko);


    }


}

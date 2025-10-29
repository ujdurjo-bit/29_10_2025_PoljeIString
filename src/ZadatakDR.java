/*Zadatak 1: Domaće istraživanje ostalih metoda rada sa Stringom: https://www.w3schools.com/java/ref_string_replace.asp
Zadatak 2: Napišite program koji ispisuje je li uneseni broj savršen ili ne. Zatražite korisnika unos broja ili interval brojeva koji želi provjeriti.
Savršen broj je broj koji je jednak zbroju svojih djelitelja (bez njega samoga). Npr. 6 (1 + 2 + 3 = 6)
Zadatak 3: Napišite program koji traži unos godine i ispisuje je li ta godina prijestupna ili ne.
Godina je prijestupna ako je djeljiva sa 4, nije djeljiva sa 100, osim ako je djeljiva sa 400.*/

import java.util.Scanner;

public class ZadatakDR {


        public static void main(String[] args) {
//Zadatak 2: Napišite program koji ispisuje je li uneseni broj savršen ili ne. Zatražite korisnika unos broja ili interval brojeva koji želi provjeriti.
// Savršen broj je broj koji je jednak zbroju svojih djelitelja (bez njega samoga). Npr. 6 (1 + 2 + 3 = 6)

            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite broj koji želite provjeriti");

            int broj = Integer.parseInt(sc.nextLine());
            int suma = 0;


            for (int i = 1; i < broj; i++) {
                if (broj % i == 0) {
                    suma += i;
                }
            }
                if (suma == broj) {
                    System.out.print("Broj " + broj + " je savršen broj!");
                }
else {
                    System.out.print("Broj " + broj + " nije savršen broj!");
                }





            }
        }




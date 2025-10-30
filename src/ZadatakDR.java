/*Zadatak 1: Domaće istraživanje ostalih metoda rada sa Stringom: https://www.w3schools.com/java/ref_string_replace.asp
Zadatak 2: Napišite program koji ispisuje je li uneseni broj savršen ili ne. Zatražite korisnika unos broja ili interval brojeva koji želi provjeriti.
Savršen broj je broj koji je jednak zbroju svojih djelitelja (bez njega samoga). Npr. 6 (1 + 2 + 3 = 6)
Zadatak 3: Napišite program koji traži unos godine i ispisuje je li ta godina prijestupna ili ne.
Godina je prijestupna ako je djeljiva sa 4, nije djeljiva sa 100, osim ako je djeljiva sa 400.*/

import java.util.Scanner;

public class ZadatakDR {


        public static void main(String[] args) {

        //Zadatak 1: Domaće istraživanje ostalih metoda rada sa Stringom: https://www.w3schools.com/java/ref_string_replace.asp

                  String proba = "Danas je srijeda, na predavanju sam! ";

        System.out.println("Veličina: " + proba.length());
        System.out.println("Znak na indexu: " + proba.charAt(0));
        System.out.println("Znak na indexu: " + proba.charAt(1));
        System.out.println("Gdje se nalazi znak: " + proba.indexOf('n'));
        System.out.println("Ends with: " + proba.endsWith("eda"));
        System.out.println("Starts with: " + proba.endsWith("sri"));
        System.out.println(proba.replace('a', 'u'));
        System.out.println(proba.split("Danas"));
        System.out.println(proba.toLowerCase());
        System.out.println(proba.toUpperCase());



            //Zadatak 2: Napišite program koji ispisuje je li uneseni broj savršen ili ne. Zatražite korisnika unos broja ili interval brojeva koji želi provjeriti.
// Savršen broj je broj koji je jednak zbroju svojih djelitelja (bez njega samoga). Npr. 6 (1 + 2 + 3 = 6)

/*            Scanner sc = new Scanner(System.in);
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





            }*/

            //Zadatak 3: Napišite program koji traži unos godine i ispisuje je li ta godina prijestupna ili ne.
            //Godina je prijestupna ako je djeljiva sa 4, nije djeljiva sa 100, osim ako je djeljiva sa 400.*/
/*

            Scanner sc = new Scanner(System.in);
            System.out.print("Provjera godine?");

            int godina = sc.nextInt();

            if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
                System.out.print(godina + " godina je prijestupna godina.");
            } else {
                System.out.print(godina + " godina nije prijestupna godina.");
            }

*/

        }
}




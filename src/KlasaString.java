import java.util.Scanner;

public class KlasaString {
    public static void main(String[] args) {
/*
        String proba = "Danas je srijeda, na predavanju sam! ";

        System.out.println("Veličina: " + proba.length());
        System.out.println("Znak na indexu: " + proba.charAt(0));
        System.out.println("Znak na indexu: " + proba.charAt(1));
        System.out.println("Gdje se nalazi znak: " + proba.indexOf('n'));
        System.out.println("Ends with: " + proba.endsWith("eda"));
        System.out.println("Starts with: " + proba.endsWith("sri"));*/

/*        String rijec = "Perica";
        String rijec1 = new String ("Perica");
        System.out.println(rijec == rijec1);
        System.out.print(rijec.equals(rijec1)); // ako radimo sa više stringova ova metoda je bolja*/

       // Zadatak 3: Unijeti u program broj ocjena po želji, ispisati prosjek ocjena. (int brojOcjena = Integer.parseInt(sc.nextLine());)
        //1. korak -> tražiti od korisnika koliko ocjena želi unijeti ✔
        //2. korak -> kreirati polje na temelju unesenog broja ✔
        //3. korak -> pomoću petlje for proći kroz očekivani broj unosa ocjena ✔
        //4. korak -> pri svakoj vrtnji petlje for tražiti od korisnika da unese ocjenu po ocjenu
        //svaku ocjenu speramamo u određeni index polja
        //prilikom čega zbrajamo ocjenu po ocjenu u zasebnu varijablu
        //5. korak -> računamo i iispisujemo prosjek

        Scanner sc = new Scanner(System.in);
        System.out.print("Koliko ocjena želite unijeti?");

        int brojOcjena = Integer.parseInt(sc.nextLine());
        int zbroj = 0;

        for (int i = 0; i < brojOcjena; i++) {
            System.out.println("Unesite ocjenu " + (i + 1));

            int ocjena = Integer.parseInt(sc.nextLine());
            zbroj += ocjena;
        }

        double  prosjek = (double) zbroj / brojOcjena;
        System.out.println("Prosjek ocjena je: " + prosjek);


    }
}

//Margarita Matuļenko mm20266

import java.util.Arrays;
import java.math.BigInteger;

// ================ Klasi MD3 modificet aizliegts!
public class MD3 {

    public static void main(String[] args) {
        System.out.println("args " + Arrays.toString(args));
        LielsSkaitlis lielsSkaitlis1 = new LielsSkaitlis(args[0]);
        LielsSkaitlis lielsSkaitlis2 = new LielsSkaitlis(args[1]);

        lielsSkaitlis1.add(lielsSkaitlis2);
        lielsSkaitlis1.display();
        lielsSkaitlis1.reverse();
        lielsSkaitlis1.display();

        lielsSkaitlis2.sub(lielsSkaitlis1);
        lielsSkaitlis2.display();
        lielsSkaitlis2.reverse();
        lielsSkaitlis2.display();
    }
}
// ================ Klasi MD3 modificet aizliegts!

//Japapildina klase "LielsSkaitlis" ar nepieciesamo funcionalitati
class LielsSkaitlis {
    private String skaitlis;

    //Varat pievienot savus laukus, ja tas ir nepieciesams


    LielsSkaitlis(String str) {
        skaitlis = str;
    }

    public void add(LielsSkaitlis sk) {
        String mazs = "SKAITLIS PAR MAZU";
        String liels = "SKAITLIS PAR LIELU";
        String zime = String.valueOf(skaitlis.charAt(0));
        if (skaitlis.length() <= 20 && sk.skaitlis.length() <= 20 &&
                !skaitlis.equals(mazs) && !skaitlis.equals(liels) &&
                !sk.skaitlis.equals(mazs) && !sk.skaitlis.equals(liels)) {

            BigInteger pirmais = new BigInteger(skaitlis);
            BigInteger otrais = new BigInteger(sk.skaitlis);
            BigInteger rezultats = pirmais.add(otrais);

            if (rezultats.toString().length() <= 20) {
                skaitlis = rezultats.toString();

            } else if (zime.equals("-") || skaitlis.equals(mazs)) {
                skaitlis = mazs;
            } else {
                skaitlis = liels;
            }

        } else if (zime.equals("-") || skaitlis.equals(mazs)) {
            skaitlis = mazs;
        } else {
            skaitlis = liels;
        }
    }

    public void sub(LielsSkaitlis sk) {
        String mazs = "SKAITLIS PAR MAZU";
        String liels = "SKAITLIS PAR LIELU";

        String zime = String.valueOf(skaitlis.charAt(0));
        if (skaitlis.length() <= 20 && sk.skaitlis.length() <= 20 &&
                !skaitlis.equals(mazs) && !skaitlis.equals(liels) &&
                !sk.skaitlis.equals(mazs) && !sk.skaitlis.equals(liels)) {

            BigInteger pirmais = new BigInteger(skaitlis);
            BigInteger otrais = new BigInteger(sk.skaitlis);
            BigInteger rezultats = pirmais.subtract(otrais);

            if (rezultats.toString().length() <= 20) {
                skaitlis = rezultats.toString();

            } else if (zime.equals("-") || skaitlis.equals(mazs)) {
                skaitlis = mazs;
            } else {
                skaitlis = liels;
            }

        } else if (zime.equals("-") || skaitlis.equals(mazs)) {
            skaitlis = mazs;
        } else {
            skaitlis = liels;
        }

    }

    public void reverse() {
        String mazs = "SKAITLIS PAR MAZU";
        String liels = "SKAITLIS PAR LIELU";

        String zime = String.valueOf(skaitlis.charAt(0));
        if (skaitlis.length() <= 20 && !skaitlis.equals(mazs) && !skaitlis.equals(liels)) {
            String reversed = "";
            for (int i = skaitlis.length() - 1; i >= 0; i--) {
                String num = String.valueOf(skaitlis.charAt(i));
                if (!num.equals("0") && !num.equals("-")) {
                    reversed = reversed + skaitlis.charAt(i);
                }
            }
            if (String.valueOf(skaitlis.charAt(0)).equals("-")) {
                reversed = "-" + reversed;
            }
            skaitlis = reversed;
        } else if (zime.equals("-") || skaitlis.equals(mazs)) {
            skaitlis = mazs;
        } else {
            skaitlis = liels;
        }
    }


    //Varat pievienot savas metodes, ja tas ir nepieciesams


    // ================= Metodi display() modificet aizliegts!
    public void display() {
        System.out.println(skaitlis);

    }
}

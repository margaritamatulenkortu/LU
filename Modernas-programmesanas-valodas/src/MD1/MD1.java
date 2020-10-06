//Margarita Matuļenko mm20266
public class MD1 {
    public static void main(String[] args) {
        final String error = "DATI NAV KOREKTI!";
        final int Z = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        final String blank = " ";
        final String element = "+ ";
        final int rulerLength = 8;
        //tree
        if (Z > 0 && Z < 20 && N > 0 && N < 30) {
            for (int column = 0; column < Z; column++) {
                for (int row = 1; row < Z + N + 1; row++) {
                    if (row == Z + N) {
                        System.out.print(element);
                        for (int count = 0; count < column; count++) {
                            System.out.print(element);
                        }
                        System.out.println(blank);
                    } else {
                        System.out.print(blank);
                    }
                }
                N--;
            }
            //ruler
            for (int firstRuler = 1; firstRuler < 10; firstRuler++)
                System.out.print(firstRuler);
            for (int j = 1; j < rulerLength; j++) {
                for (int i = 0; i < 10; i++) {
                    System.out.print(i);
                }
            }
        } else {
            System.out.println(error);
        }
    }

}


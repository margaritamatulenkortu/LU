//Margarita Matuļenko mm20266
public class MD1 {
    public static void main(String[] args) {
        int Z, N;
        Z = Integer.parseInt(args[0]);
        N = Integer.parseInt(args[1]);

        if (Z < 1 || Z > 19 && N < 1 || N > 29) {
            System.out.println("DATI NAV KOREKTI!");

        } else {
            for (int column = 0; column < Z; column++) {

                for (int k = 1; k < Z + N + 1; k++) {
                    if (k == Z + N) {
                        System.out.print("+ ");
                        for (int count = 0; count < column; count++) {
                            System.out.print("+ ");
                        }
                        System.out.println(" ");
                    } else {
                        System.out.print(" ");
                    }
                }
                N--;
            }


            for (int m = 1; m < 10; m++)
                System.out.print(m);
            for (int j = 1; j < 4; j++) {
                for (int i = 0; i < 10; i++) {
                    System.out.print(i);
                }
            }
        }

    }
}

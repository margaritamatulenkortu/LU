public class DominoTest {
    public static void main(String[] args) {
        int players = Integer.parseInt(args[0]);
        final int NUMBER_OF_PIECES = 55;
        Domino myDomino = new Domino();
        myDomino.shuffle();

        for (int j=1; j<=players; j++) {
            System.out.print(j+".spēlētājam ir: ");
            int numberOfPieces = NUMBER_OF_PIECES/players;
            for (int i = 0; i < numberOfPieces; i++) {

                System.out.print(myDomino.dealCard());
            }
            System.out.println();
        }


    }
}

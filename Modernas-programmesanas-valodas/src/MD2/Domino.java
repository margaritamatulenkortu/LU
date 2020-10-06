import java.util.Random;
public class Domino {
    private final Tile[] tiles; // klase Tile tukša
    private int currentTile; //tagad ģenerējamais gabaliņš
    private final int NUMBER_OF_PIECES = 55; //kopējais skaits gabaliņiem
    private final Random randomNumbers; //sajaukšanas mainīagis

    public Domino() { //metode, kura ģenerē kauliņus
       String[] firstSide = {"0","1","2","3","4","5","6","7","8","9"}; //pirmās puses vērtības kauliņam
        String[] secondSide = {"0","1","2","3","4","5","6","7","8","9"};//otrās puses vērtības kauliņam
       tiles = new Tile[NUMBER_OF_PIECES]; //masīvs Tile, kur liek iekšā jaunās vērtības
        randomNumbers = new Random(); // koeficents ar kuru mainīt vietām gabaliņus

        int count = 0; //saskita kauliņus max 55
        int MAX_NUMBER_ON_TILE = 9;
        for (int i = 0; i<= MAX_NUMBER_ON_TILE; i++){
                for (int j = 0; j<= MAX_NUMBER_ON_TILE; j++){
                    if(j>=i){
                        tiles[count] = new Tile(firstSide[i], secondSide[j]); //tiles[count] katrs kauliņš
                       // System.out.print(tiles[count]);
                       // System.out.println(count);
                    count++;}
            }
        }
    }
    // RANDOMIZĒS KAULIŅUS
    public void shuffle(){
        currentTile = 0;//kaulins kuru izvelk

        for (int i = 0; i< tiles.length; i++){
            int switching = randomNumbers.nextInt(NUMBER_OF_PIECES); //randomaizers samiana ar kādu no 55 vietām
            Tile temp = tiles[i];
            tiles[i]= tiles[switching];
            tiles[switching] = temp;
        }
    }
    //IZVELK KAULINUS
    public Tile dealCard()
    {
        if (currentTile < tiles.length){

            return tiles[currentTile++];
        }
        else{
            return null;}
    }
}



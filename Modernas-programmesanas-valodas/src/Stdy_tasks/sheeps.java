public class sheeps {

        public static String countingSheep(int num) {
            String sheeps= "";
            for (int i=1; i<num+1; i++){
                sheeps = sheeps+ i + " sheep...";

            }
            System.out.println(sheeps);
            return sheeps;

        }
    public static void main(String[] args) {
        countingSheep(4);
    }
    }


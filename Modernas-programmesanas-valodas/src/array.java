public class array {
    public static void main(String[] args) {
       int[] arr = new int [10];

   for (int counter=0; counter < arr.length; counter++)
       arr[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s\n", "index", "value");


        for (int counter = 0; counter < arr.length; counter++)
       System.out.printf("%3d%8d\n", counter, arr[counter]);
   }

}

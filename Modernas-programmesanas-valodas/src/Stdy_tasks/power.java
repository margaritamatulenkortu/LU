import java.lang.Math;

public class power {
    public static int nthPower(int[] array, int n) {
        double result;
        if (n> array.length-1) {
        result =-1;
            return (int) result;
        } else{
            result =  Math.pow(array[n],n);
            return (int) result;
        }

    }

    public static void main(String[] args){
        int[] array = {1,2,4,4,5};
        int n = 4;
        System.out.println(nthPower(array, n));
    }
}

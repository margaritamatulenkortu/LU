import java.util.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("%sn \n sokds %d\n fsfsa");
        String[] cars = {"Volvo", "Audi"};
        cars[0] = "Opel";


        System.out.println(cars[0]);
        System.out.println(cars.length);
        for (int i=0; i<cars.length; i++){
            System.out.print(" " + cars[i]);
        }

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
    }

}

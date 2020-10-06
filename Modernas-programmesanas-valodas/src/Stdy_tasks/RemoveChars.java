public class RemoveChars {
    public static String remove(String str) {
       String newStr = str.substring(1, str.length()-1);
       System.out.println(newStr);
       return newStr;
    }
    public static void main(String[] args) {
        remove("Katrasdalas");;
    }
}


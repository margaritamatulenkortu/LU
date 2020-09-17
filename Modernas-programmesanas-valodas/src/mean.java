public class mean {

    public static int getAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println(sum / marks.length);
        return sum / marks.length;
    }

    public static void main(String[] args) {
        getAverage(new int[]{1, 4, 10,1});

    }
}

package JavaIII.InClassExamples;

public class recursion {
    public static void main(String[] args) {
       // count(0);
        System.out.println();
        count2(0);
    }
    public static void count(int index) {
        System.out.println(index);
        if (index < 2) {
            count(index + 1);
        }

    }
    public static void count2(int index) {

        if (index < 2) {
            count(index + 1);
        }
        System.out.println(index);
    }
}

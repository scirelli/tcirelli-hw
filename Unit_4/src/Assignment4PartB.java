import java.util.Arrays;
import java.util.Comparator;

public class Assignment4PartB {
    public static void main(String[] args) throws Exception {
        // *********************************************************
        // ****Assignment 4, Part B, Section 1
        // *********************************************************
        System.out.println("\n**********Section 1 - Bubble Sort **********\n");
        Integer[] grades = { 65, 95, 75, 55, 56, 90, 98, 88, 97, 78 };

        System.out.println("The unsorted list of grades is:");
        System.out.println(Arrays.toString(grades));

        BubbleSort b = new BubbleSort();
        b.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                    return a - b;
            }
        }, grades);
        System.out.println("The sorted list of grades is:");
        System.out.println(Arrays.toString(grades));

        b.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                    return  b-a;
            }
        }, grades);
        System.out.println("The sorted list of grades is:");
        System.out.println(Arrays.toString(grades));
    }
}

class BubbleSort {
    public void sort(Comparator<Integer> c, Integer[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0, t = 0; j < a.length - i - 1; j++) {
                if (c.compare(a[j], a[j + 1]) > 0) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = t;
                }
            }
        }
    }
}
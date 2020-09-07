//package JavaIII.Sort;
//
//import java.util.*;
//
///**
// * Created by dgebremichael on 3/2/17.
// */
//public class Example {
//
//    //Selection sort
//    public static void sort(Comparable[] a) {
//
//        int N = a.length; // array length
//        for (int i = 0; i < N; i++) { // Exchange a[i] with smallest entry in a[i+1...N).
//            int min = i; // index of minimal entr.
//            for (int j = i + 1; j < N; j++)
//                if (less(a[j], a[min]))
//                    min = j;
//            exch(a, i, min);
//        }
//    }
//
//    //Insertion sort
//    /*
//    Unlike that of selection sort, the running time of insertion sort depends on the initial
//order of the items in the input. For example, if the array is large and its entries are
//already in order (or nearly in order), then insertion sort is much, much faster than if
//the entries are randomly ordered or in reverse order.
//     */
//    public static void insertionSort(Comparable[] a)
//    { // Sort a[] into increasing order.
//        int N = a.length;
//        for (int i = 1; i < N; i++)
//        { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
//            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
//                exch(a, j, j-1);
//        }
//    }
//
//    private static boolean less(Comparable v, Comparable w) {
//        return v.compareTo(w) < 0;
//    }
//
//    private static void exch(Comparable[] a, int i, int j) {
//        Comparable t = a[i];
//        a[i] = a[j];
//        a[j] = t;
//    }
//
//    private static void show(Comparable[] a) { // Print the array, on a single line.
//        for (int i = 0; i < a.length; i++)
//            StdOut.print(a[i] + " ");
//        StdOut.println();
//    }
//
//    public static boolean isSorted(Comparable[] a) { // Test whether the array entries are in order.
//        for (int i = 1; i < a.length; i++)
//            if (less(a[i], a[i - 1])) return false;
//        return true;
//    }
//
//    public static void main(String[] args) { // Read strings from standard input, sort them, and print.
//        String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
//        insertionSort(a);
//        assert isSorted(a);
//        show(a);
//    }
//}
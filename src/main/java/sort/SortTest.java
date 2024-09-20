package sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {72, 60, 83, 47, 89, 95};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));//배열은 객체이긴 한데 스트림으로 바로는 못 만듦
        System.out.println();

        //int[] sortedArr = MySort.selectionSort(arr);
        MySort.insertionSort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

        MySort.insertionSort(arr);
    }
}

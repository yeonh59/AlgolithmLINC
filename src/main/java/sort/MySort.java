package sort;

import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int[] arr = {72, 60, 83, 47, 89, 95};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));//배열은 객체이긴 한데 스트림으로 바로는 못 만듦
        System.out.println();

        int[] sortedArr = selectionSort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i <arr.length -1 ; i++) {
            int min = i ;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }

            }//for문 끝
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        return arr;
    }


    public static void  insertionSort(int[] arr) {
        for (int i =1; i < arr.length; i++){
            int insertElement = arr[i]; //삽입할 요소 A[i]를 저장
            int j = i-1;
            // A[i]를 A[0 .. i-1]에 삽입할 위치를 찾는다
            while (j >= 0 && arr[j] > insertElement){
                arr[j + 1] = arr[j]; //A[j]를 오른쪽으로 한 자리 이동
                j = j-1;
            }
            arr[j+1] =insertElement;
        } //A[i]를 찾은 위치에 삽입

    }
}

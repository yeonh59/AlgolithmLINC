package search.max;

import search.binary.MySearch;
import sort.MySort;
import sum.MyCalc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) { //스태틱은 특정영역을 차지(메모리가 먼저 올라옴), 안붙은애들은 인스턴스 메소드
        int[] arr = {72, 60, 83, 47, 89, 95};

        int max = FindMax.findMaximum(arr); //최대값 찾는 함수 구현, 자바에서 함수는 소문자
        System.out.println("최대값:" + max);

        int[] CUME = MyCalc.calcCume(arr);
        for(int i = 0; i<CUME.length; i++){
            System.out.printf("%5d", CUME[i]);
        }
        System.out.println("정렬 전:");
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        System.out.println();

        int[] sorted = MySort.selectionSort(arr);
        Arrays.stream(sorted).forEach(x -> System.out.print(x+ " "));
        System.out.println();

        int pos = MySearch.binarySerch(sorted, 0, sorted.length-1, 89);
        System.out.println("검출 위치는: " + pos);
    }
}





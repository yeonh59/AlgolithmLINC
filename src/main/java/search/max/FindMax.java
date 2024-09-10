package search.max;

public class FindMax {


    public static int findMaximum(int[] arr) {// 세상에 모든 맥스는 스태틱이 안붙음
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

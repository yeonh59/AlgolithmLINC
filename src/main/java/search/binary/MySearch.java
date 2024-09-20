package search.binary;

public class MySearch {
    public static void main(String[] args) {
        int[] arr= {11,22,33,44,55,66,77};
        int x = 55;

        //이진 탐색으로 특정 값의 위치를 찾으세요
        int position = binarySerch(arr, 0, arr.length-1, x);
        System.out.println("위치는: " + position);

    }

    public static int binarySerch(int[] arr, int start, int end, int x) {
        if(start > end){
            return -1; //실패(못 찾은 경우)
        } else {
            int mid = (start + end)/2;
            if(x == arr[mid]){
                return mid;
            } else if(x < arr[mid]){
                return binarySerch(arr, start, mid -1, x);
            }else {
                return binarySerch(arr, mid +1, end, x);
            }
        }
    }

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

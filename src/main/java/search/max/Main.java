package search.max;

public class Main {
    public static void main(String[] args) { //스태틱은 특정영역을 차지(메모리가 먼저 올라옴), 안붙은애들은 인스턴스 메소드
        int[] arr = {72, 60, 83, 47, 89, 95};

        int max = FindMax.findMaximum(arr); //최대값 찾는 함수 구현, 자바에서 함수는 소문자
        System.out.println("최대값:" + max);

    }
}

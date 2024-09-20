package lambda.basic;

public class LambdaEx1 {

    // Object obj = (a, b) -> a > b ? a : b;
    Object obj = new Object(){ // 익명객체 안에서 메소드를 선언
        int max(int a, int b){
            return a > b ? a : b;
        }
    };

    // int result = obj.max(10, 20); //obj로 max가 접근이 안됨, Object안에 투스트링같은건 있는데 max가 없음
    // 람다 함수현 인터페이스
}

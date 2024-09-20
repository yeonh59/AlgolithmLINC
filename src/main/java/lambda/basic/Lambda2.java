package lambda.basic;

public class Lambda2 {
    public static void main(String[] args) {
        
        MyFunction mf = new MyFunction() { //인터페이스는 객체를 만들 수 없어서 직접 구현해서 생성?
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        }; //머 갑주고 해서 세미콜론 붙여줘야함

        
        int result = mf.max(10,20);
        System.out.println(result);

        MyFunction mf2 = (a, b) -> a > b ? a : b; //람다식! 요즘 많이 씀, MyFunction = 함수형 인터페이스
        result = mf2.max(11,22);
        System.out.println(result);

    }
}

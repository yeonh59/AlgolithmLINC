package lambda.basic;

@FunctionalInterface //추상 메소드가 1개인 인터페이스를 의미
public interface MyFunction { //인터페이스 안에
    // 1. 상수
    // 2. 추상 메소드
    // 3. default

    public static final
    int A = 3; //대문자 국룰..!
    public abstract
    int max(int a, int b); //추상 메소드 생성
    // int add(int a, int b); // 어노테이션 빨줄 뜸. 추상메소드 때문인듯

    public default void test(){ //인스턴스라서 default 적어줘야 에러 안뜸
        System.out.println("될까?");
    }
}

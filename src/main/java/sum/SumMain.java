package sum;

public class SumMain {
    public static void main(String[] args) {
        MyCalc cumeSum = new MyCalc();//참조변수?

        int[] FREQ = {1, 0, 7, 5, 4, 3};
        for (int i = 0; i < FREQ.length; i++) {
            //System.out.println(FREQ[i] +"\t"); //탭
            System.out.printf("%5d", FREQ[i]);
        }
        System.out.println();
        int[] CUME = cumeSum.calcCume(FREQ);
        for (int i = 0; i < CUME.length; i++) {
            //System.out.println(CUME[i] + "\t");
            System.out.printf("%5d", CUME[i]);
        }
    }

}




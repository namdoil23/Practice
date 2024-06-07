package chap99_homework.homework98;

public class ReturnInt {
    public static double IntMul(int i, double d){
        double result = i*d;

        double roundresult = Math.round(result*100.0)/100.0;

        return roundresult;
    }

}

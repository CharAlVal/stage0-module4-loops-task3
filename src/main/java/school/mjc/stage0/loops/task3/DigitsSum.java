package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String number = Integer.toString(t);
        int digit;
        int result = 0;

        for (int i = 0; i <= number.length(); ++i){
            digit = (t/10)*10;
            result += t-digit;
            t /= 10;
        }
        if(result < 0){
            result >>= result;
        }
        System.out.println(result);

    }
}

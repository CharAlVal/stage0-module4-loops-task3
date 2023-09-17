package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 9;
        int count = 9;
        for (int i = 1; i <= lengthOfLastNumber; ++i){
            count *= (10) + 9;
            result += count;
        }
        System.out.println(result);

    }
}

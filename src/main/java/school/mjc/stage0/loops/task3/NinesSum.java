package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int count = 9;
        for (int i = 1; i <= lengthOfLastNumber; ++i){
            result = count;
            count *= 10;
            count += 9;
            result += count;


        }
        System.out.println(result);

    }
}

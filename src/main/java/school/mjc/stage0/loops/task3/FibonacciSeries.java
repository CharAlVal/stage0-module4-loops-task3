package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int digit = 1;
        int count = 0;
        int result = 0;

        for (int i = 1; i <= lastFibonacci; ++i){
            System.out.println(result);
            digit += count;
            count = result;
            result = digit;

        }
    }
}

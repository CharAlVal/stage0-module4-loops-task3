package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int i;
        boolean status = false;
        for (i = Math.max(first,second); !status; --i){
            if (first % i == 0 && second % i == 0){
                status = true;

            }
        }
        System.out.println(i);
    }
}

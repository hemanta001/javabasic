package recursivefunction;

// 5! = 5*4*3*2*1
public class RecursiveExamples {
    private Long userNumber = 5L;

    public void printFactorialUsingLoop() {
        long factorial = 1;
        for (long i = 1; i <= userNumber; i++) {
            //factorial*=i;
            factorial = factorial * i;
        }
        System.out.println("The factorial is " + factorial);
    }

    public void printFactorialUsingRecursion() {
        System.out.println("The factorial is " + factorial(userNumber));
    }

    public Long factorial(Long n) {
        if (n == 0 || n == 1) {
            return 1L;
        }
        return n * factorial(n - 1);
        //5 * ...
        // 5 * factorial(4)
        // 5 * 4 * factorial(3)
        //5* 4 * 3 * factorial(2)
        // 5 * 4 * 3 * 2 * factorial(1)
        //5 * 4 * 3 * 2 * 1
    }

    public void sumOfNthNumbers() {
        long sum = 0;
        for (long i = 1; i <= userNumber; i++) {
            //sum += i;
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }

    public void sumOfNthNumberUsingRecursion() {
        System.out.println("The sum is " + sum(userNumber));
    }

    public long sum(Long n) {
        if (n == 0) {
            return 0L;
        }
        return n + sum(n - 1);
        // 5 + sum (4)
        //5 + 4 + sum(3)
        //5 + 4 + 3 + sum(2)
        //5 + 4 + 3 + 2 + sum(1)
        //5 + 4 + 3 + 2 + 1 + sum(0)
        // 5 + 4 + 3 + 2 + 1 + 0
    }

}

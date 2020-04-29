import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class Question1195 {
    private int n;
    private AtomicInteger atomicInteger;
    public Question1195(int n) {
        this.n = n;
        this.atomicInteger = new AtomicInteger(1);
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(atomicInteger.get() <= n){
            int num = atomicInteger.get();
            if(num > n){
                break;
            }
            if(num % 3 == 0 && num % 5 != 0){
                printFizz.run();
                atomicInteger.incrementAndGet();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(atomicInteger.get() <= n){
            int num = atomicInteger.get();
            if(num > n){
                break;
            }
            if(num % 5 == 0 && num % 3 != 0){
                printBuzz.run();
                atomicInteger.incrementAndGet();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(atomicInteger.get() <= n){
            int num = atomicInteger.get();
            if(num > n){
                break;
            }
            if(num % 3 == 0 && num % 5 == 0){
                printFizzBuzz.run();
                atomicInteger.incrementAndGet();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(atomicInteger.get() <= n){
            int num = atomicInteger.get();
            if(num > n){
                break;
            }
            if(num % 3 != 0 && num % 5 != 0){
                printNumber.accept(num);
                atomicInteger.incrementAndGet();
            }
        }
    }
}

package C04;
import java.util.Map;


class Multiplication extends Thread{
    public void run(){
        for(int i=1;i<=10;i++)                                           {
            System.out.println(i+" * 5 = "+(i*5));
        }
    }
}

class Prime extends Thread{
    public void run(){
        System.out.println("First 100 prime numbers: ");
        int n = 100;
        int count = 0;
        for (int i = 2; count < n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Multiplication mul = new Multiplication();
        Prime prime = new Prime();

        mul.start();
        prime.start();
    }
}

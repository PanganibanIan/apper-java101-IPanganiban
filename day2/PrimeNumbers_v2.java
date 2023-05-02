import java.util.Scanner;

class PrimeNumber_v2 {
    public static void main(String[] args) {
        System.out.println("Prime Number Reader");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Input Number (1-10,000,000) : ");
        int num = myScanner.nextInt();

        while (num > 10000000 || num == 0) {
            System.out.println("Invalid Range! Input Number (1 - 10,000,000) : ");
            num = myScanner.nextInt() ;
        }

        long startTime = System.nanoTime();

        boolean check = isPrime(num);

        long endTime = System.nanoTime();

        if (!check) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is a prime number");
        }

        System.out.println("Duration: " + (endTime - startTime));
    }
    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }else if(num > 3) {
            for (int n = 2; n < Math.sqrt(num); n++) {
                if (num%n == 0) {
                    return false;
                }
            }
        }
    return true;
    }

}

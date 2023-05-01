import java.util.Scanner;

class PrimeNumber {
    static boolean isPrime(int num) {
        boolean prime = true ; // boolean for prime ( 0 = FALSE, 1 = TRUE )
        double end = Math.ceil(Math.sqrt(num)) ; //end number for multiple checking


        if (num == 1 || num == 0) {
            prime = false;
        } else if ( num == 2 ) {
            prime = true;
        } else {
            for (int n = 2; n <= end; n++) {
                if (num%n == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return(prime);
    }

    public static void main(String[] args) {
        System.out.println("Prime Number Reader");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Input Number: ");
        int num = myScanner.nextInt();

        boolean check = isPrime(num);

        if (!check) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is a prime number");
        }
    }
}

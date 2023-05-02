public class OddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        System.out.println(isEven(6));
        System.out.println(isEven(7));

        int ctr = 0;
        while (ctr<10) {
            System.out.println(ctr);
            ctr ++;
        }

        do {
            System.out.println(ctr);
            ctr-- ;
        } while (ctr>=0) ;

        for (int ctr2 = 0; ctr2<=10; ctr2++) {
            System.out.println(ctr2);
        }
    }

//    public static boolean isEven(int num) {
//        boolean result = false ;
//
//        if (num%2 == 0) {
//            boolean result = true;
//        }
//        return result;
//    }
//
    public static boolean isEven(int num) {
        return num%2 == 0;
    }




}

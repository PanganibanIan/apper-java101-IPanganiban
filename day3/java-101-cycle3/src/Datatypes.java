public class Datatypes {

    static int age;

    static double salary;
    static boolean isHappy;
    static Integer wrapperAge = 67890;
    static String Name = "ABCDE" ;

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);

        System.out.println(age + " " + wrapperAge);


        System.out.println(age+10);
        System.out.println(wrapperAge);
        System.out.println(wrapperAge.toString().charAt(3));
        System.out.println(wrapperAge.toString().charAt(3) + 1);

        System.out.println("__________________________________________________________");
        System.out.println(Name);
        System.out.println(Name.charAt(3));
        System.out.println(Name.charAt(3) +2);

        System.out.println("__________________________________________________________");

        int a= 9;
        int b=10;
        int c= 78;


        System.out.println(a + b *c);
        System.out.println((a + b) *c);
        System.out.println(b%2*c+b);

        System.out.println(c++ + " " + ++c);
        System.out.println(c);


    }
}
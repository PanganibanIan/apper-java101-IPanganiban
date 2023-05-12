package ShareALoad;
import java.util.Scanner ;
import static ShareALoad.Users.*;

public class Main {
    static String getNumber() {
        System.out.print("Please Input 11 Digit Phone Number: ");
        Scanner myScanner = new Scanner(System.in);
        String number = myScanner.nextLine();
        while (number.isEmpty() || number.length() != 11 || !number.matches("[0-9]+")){
            if (number.isEmpty()) {
                System.out.print("Please Input 11 Digit Phone Number: ");
                number = myScanner.nextLine();
            } else {
                System.out.println("Invalid Phone Number!");
                System.out.print("Please Input 11 Digit Phone Number: ");
                number = myScanner.nextLine();
            }
        }
        return number;
    }

   static String registeredUser(String userKey) {
       Scanner myScanner = new Scanner(System.in);
       System.out.println("Number " + userKey + " already registered!");
       System.out.println("Please Enter Name for verification.");
       System.out.print("Name: ");
       String name = myScanner.nextLine();
       //check if name is empty
       while (name.isEmpty()){
               System.out.println("Name must not be empty.");
               System.out.print("Name: ");
               name = myScanner.nextLine();
           }
       if ( !getUser(userKey).equals(name)){
               System.out.println("Name and number does not match.");
               System.exit(0);
           }
       return name;
   }

   static String newUser() {
       Scanner myScanner = new Scanner(System.in);
       System.out.println("Welcome new user!");
       System.out.println("Please Enter Name for registration.");
       System.out.print("Name: ");
       String name = myScanner.nextLine();
       //check if name is empty
       while (name.isEmpty()){
           System.out.println("Name must not be empty.");
           System.out.print("Name: ");
           name = myScanner.nextLine();
       }
       return name;
   }

   static void userInfo(String userKey, String name){
       System.out.println("--------------------------------------------");
       System.out.println("**Account**");
       System.out.println("Name: " + name);
       System.out.println("Number: " + userKey);
       System.out.println("Balance: " + getBal(userKey));
       System.out.println("--------------------------------------------");
   }

   static String getRecepient(String userKey) {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Recipient Number: ");
       String receiverKey = myScanner.nextLine();

       while (!users.containsKey(receiverKey)) {
           System.out.println("Recipient Number not registered!");
           System.out.print("Please input registered recipient number: ");
           receiverKey = myScanner.nextLine();
       }

       while (userKey.equals(receiverKey)){
           System.out.println("Sender and recipient shouldn't be the same");
           System.out.print("Please input registered recipient number:");
           receiverKey = myScanner.nextLine();
       }
       return receiverKey;
   }

   static Double loadAmount (String userKey){
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter Amount: ");
       Double sendLoad = myScanner.nextDouble();

       while (getBal(userKey) < sendLoad){
           System.out.println("Insufficient Balance!");
           System.out.print("Enter Amount: ");
           sendLoad = myScanner.nextDouble();
       }
       return sendLoad;
   }

    public static void main(String[] args) {
        System.out.println("Welcome to Gshack");
        String userKey = getNumber();

        String name ;
        if (users.containsKey(userKey)){
            name = registeredUser(userKey) ;
        } else {
            name = newUser() ;
        }
        addUser(userKey, name);
        userInfo(userKey, name);

        System.out.println("**Share A Load**");
        String receiverKey = getRecepient(userKey) ;

        userInfo(userKey, name);
        System.out.println("Recepient: " + receiverKey);
        Double sendLoad = loadAmount(userKey);

        shareALoad(userKey, sendLoad, receiverKey);

        System.out.println(sendLoad + " was SUCCESSFULLY sent to " + receiverKey + " (" + getUser(receiverKey) + ")" + " from " + userKey + " (" + getUser(userKey) + ")");
        System.out.println("====================================================================================");
        currentBalances();
    }
}

package accessmodifiers.financial;

//import accessmodifiers.Person;

public class Record {

    void displayBalance() {
        Balance balance = new Balance();
//        balance.amount = 900;
//
//        balance.setAmount(1000);
//        System.out.println(balance.getBalance());
    }

    public static void main(String[] args) {
        Record record = new Record();
        record.displayBalance();

//        Person person = new Person() ; //cant access kasi not public and outside the pckage

    }
}

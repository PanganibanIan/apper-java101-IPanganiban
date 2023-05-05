package oop.app.blueprint;

public class Person {
    public String name;
    public int age;
    public double weight ;
    public String contactNumber ;
    public boolean isMale ;
    public double height ;
    public String birthDate ;
    public String citizenship;
    public String address;
    public String relationshipStatus ;
    public String eyeColor ;
    public String religion ;
    public String email ;
    public String birthPlace ;
    public String occupation ;
    public boolean hasSiblings ;
    public String ethnicity ;


    public String getNameWithPrefix() {
        String prefix = "MR." ;
        if(!isMale) {
            if (relationshipStatus.equals("Single")) {
                prefix = "MS.";
            } else {
                prefix = "MRS." ;
            }
        }

        return prefix + name ;
    }

    public void getJob() {
        System.out.println("Searching linkedIn...");
    }

}

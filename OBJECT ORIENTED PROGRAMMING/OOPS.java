public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();

        s1.name = "Abdullah Hashmi";
        s1.age = 20;
        s1.calculateCGPA(8, 7, 8);

        System.out.println(s1.name + "\n" + s1.age + "\n" + s1.CGPA);

        BankAccount myAccount = new BankAccount();

        myAccount.username = "hashmiabdullah";
        myAccount.setPassword("mypassword123");
    }
}


class Pen {
    String color;
    int tip;
    
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float CGPA;

    void calculateCGPA(int java, int maths, int dbms) {

        CGPA = (java + maths + dbms) / 3f;
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}



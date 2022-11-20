import java.util.Scanner;


import java.util.Scanner;

class Invalid extends Exception{
    public Invalid(String n){
        super(n);
    }

}
public class InvalidPanException {
    void isinvalid(String s1,String s2) throws  Invalid {
        if(s1.charAt(4)!=s2.charAt(0)){
            throw new Invalid("Invalid");
        }
        else {
            System.out.println("Valid");
        }
    }
    public static void main(String[] args) {
        InvalidPanException ob1=new InvalidPanException();
        System.out.println("Enter Pan card Number");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name");
        Scanner sc1=new Scanner(System.in);
        try {
            ob1.isinvalid(sc.next(),sc1.next());
        }catch (Invalid e){
            System.out.println(e.getMessage());
        }


    }
}

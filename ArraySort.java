import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("Enter Size of an Array...");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array_new=new int[n];
        Scanner a=new Scanner(System.in);
        String aa="";

        for (int i=0;i<n;i++){

            try{
                array_new[i]=a.nextInt();

                if ((array_new[i]>='a'&&array_new[i]<='z')||(array_new[i]>='A'&&array_new[i]<='Z')){
                    throw new InputMismatchException("Invalid");

                }
            }catch (InputMismatchException e){
                aa="Not Accept string";

            }



        }
        System.out.println(aa);
        System.out.println("enter a number from user");
        int b=sc.nextInt();
        try{
            if (b<0){
                throw new ArrayIndexOutOfBoundsException("negative value");
            }

        }catch (Exception e){
            System.out.println("Negative number not accepted");
        }

        int ncount=0;int count=0;
        for (int i=0;i<n;i++){
            if(array_new[i]==b){
                count+=1;
            }
            else {
                ncount+=1;
            }
        }
        if(count>=1){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
        //print sorted array
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if(array_new[i]>array_new[j]){
                    int t=0;
                    t=array_new[i];
                    array_new[i]=array_new[j];
                    array_new[j]=t;
                }
            }
        }

        for (int i=0;i<n;i++){
            System.out.println(array_new[i]);
        }
        System.out.println();


    }
}


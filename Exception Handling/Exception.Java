import java.util.*;

class JavaException{
    

    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value:");
        int val=input.nextInt();
        try{
            int data=val/0;
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        System.out.println("Hello Exeption Handling");
    }
}
package Applications;
import java.util.Scanner;

class application{
public static String oddeven(int b){
if(b%2==0){
return("The value is Even");
}
else{
return ("The value is Odd");
}


}


public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the value:");
int a=input.nextInt();
System.out.println("You entered value is:"+a);

for(int i=0;i<=a;i++){
System.out.println(i);
}
if(a==10){
for(int j=1;j<=5;j++){
System.out.println("Java darling !!");
}}
else{
System.out.println("Hi Java");
}
System.out.println("Type value to check odd or even:");
int c=input.nextInt();
System.out.println(oddeven(c));

String[] array=new String[5];

}
}




import java.util.*;

class NullPointer{
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

     
      String s=null;
      try{
        int res=s.length();
      }catch(NullPointerException n){
          System.out.println(n);
     }
     System.out.println("Null Pointer Exception!");
     
      

    }
}






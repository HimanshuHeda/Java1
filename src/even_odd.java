import java.util.Scanner;

public class even_odd {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
        int num;
        
        System.out.println("Enter Number : ");
        
        num = s.nextInt();
        
        if(num%2==0){
            System.out.println("Number is Even");
        }
        
        else{
            System.out.println("Number is Odd");
        }
    }
}

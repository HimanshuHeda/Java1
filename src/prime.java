import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        
        int n,i,f=0;
        
        System.out.println("Enter any Number : ");
        
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
        
        for(i=1; i<=n; i++){
            if(n%i==0){
                f = f + 1;
            }
        }
        if(f == 2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

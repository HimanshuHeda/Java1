class Rectangle{
    int l,b;
    
    // Default constructor
    Rectangle()
    {
        int l = 0;
        int b = 0;
    }
    
    // Parameterized constructor
    Rectangle(int x, int y)
    {
        l = x;
        b = y;
    }
    
    // Method to calculate and display the perimeter
    void parameter(){
        int p;
        p = 2*(l+b);
        System.out.println("Paremeter = " +p);
    }
    
    // Method to calculate and display the area
    void area(){
        int a;
        a = l*b;
        System.out.println("Area = " +a);
    }
}
public class Const {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(); 
        Rectangle R2 = new Rectangle(3, 2);
         
        R2.parameter();
        R2.area();
    }
}
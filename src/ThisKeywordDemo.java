import java.util.Scanner;
import java.util.*;

class ThisDemo {
    int value;

    // TODO: Define setValue(int value)
    // Use 'this.value = value' to resolve naming conflict
    
    // TODO: Define display() to print "Value: " + value

	 void setValue(int value)
   {
      this.value = value;
   }

   void display()
   {
      System.out.println("Value: " + value);
   }

}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the integer input
        
        // TODO: Create ThisDemo object
        // TODO: Call setValue() with the input
        // TODO: Call display()

	int value = sc.nextInt();  
        ThisDemo demo = new ThisDemo();
        demo.setValue(value);
        demo.display();

        sc.close(); 
    }
}


package question6;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Question6 {

    private static JFrame f;
    
    public static void main(String[] args) {
        
        int sum,num1,num2;
        String value;
        
        f=new JFrame();   
        value=JOptionPane.showInputDialog(f,"Enter first integer value");      
        num1 = Integer.parseInt(value);
        
       value = JOptionPane.showInputDialog(f,"Enter second integer value");
       num2 = Integer.parseInt(value);
        
        sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null,sum);
    }
    
}

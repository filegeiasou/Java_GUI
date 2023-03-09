package java_GUI1;
import javax.swing.*;
public class Main 
{
    public static void main(String []args)
    {
        //JOptionPane.showMessageDialog(null, "This is something", "FileBank", JOptionPane.INFORMATION_MESSAGE); // small frame PLAIN_MESSAGE , question,warning,error
        /*while(true)
        {
            JOptionPane.showMessageDialog(null, "THIS IS VIRUS", "FileBank", JOptionPane.WARNING_MESSAGE);
        }*/
        int answer = JOptionPane.showConfirmDialog(null, "Do you want to continue", "FileBank", JOptionPane.YES_NO_CANCEL_OPTION);
        if(answer==0)
        {
            String name = JOptionPane.showInputDialog("What is your name: ");
            System.out.println(name);
            new Frame_one(name);
        }
    }   
}

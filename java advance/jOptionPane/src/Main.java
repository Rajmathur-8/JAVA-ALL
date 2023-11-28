import javax.swing.*;

public class Main {
    public static void main(String[] args) {

      //  JOptionPane.showMessageDialog(null,"This is Useless info","Title",JOptionPane.PLAIN_MESSAGE);
      //  JOptionPane.showMessageDialog(null,"This is Useless info","Title",JOptionPane.INFORMATION_MESSAGE);
       //JOptionPane.showMessageDialog(null,"This is Useless info","Title",JOptionPane.QUESTION_MESSAGE);
       //JOptionPane.showMessageDialog(null,"This is Useless info","Title",JOptionPane.WARNING_MESSAGE);
    //  JOptionPane.showMessageDialog(null,"This is Useless info","Title",JOptionPane.ERROR_MESSAGE);

   JOptionPane.showConfirmDialog(null,"Bro, do you Even code?","This is my Title",JOptionPane.YES_NO_CANCEL_OPTION);
    String name = JOptionPane.showInputDialog("what's your name?  : ");
   System.out.println("My name is "+name);

    }
}
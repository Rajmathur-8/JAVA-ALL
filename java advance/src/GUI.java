import javax.swing.JOptionPane;
public class GUI {

            public static void main(String[] args) {
                String name = JOptionPane.showInputDialog("Enter your name:");
                String age = JOptionPane.showInputDialog("Enter your age:");
                JOptionPane.showMessageDialog(null,"Your name is "+ name );
                JOptionPane.showMessageDialog(null,"Your age is "+ age );
            }

        }
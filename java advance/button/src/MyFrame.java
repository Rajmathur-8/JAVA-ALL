import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame  {
    JButton button;
    JLabel label;
MyFrame(){

    ImageIcon icon = new ImageIcon("button.jpeg");


    label = new JLabel();

    button=new JButton();
    button.setBounds(100,100,100,100);
    button.addActionListener(e-> System.out.println("Yooooo!!!!!!"));
    button.setText("I'm Button!");
    button.setFocusable(false);
    button.setIcon(icon);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setVerticalTextPosition(JButton.BOTTOM);
    button.setFont(new Font("Comic Sans", Font.BOLD,25));
    button.setIconTextGap(-15);
    button.setForeground(Color.cyan);
    button.setBackground(Color.darkGray);
    button.setBorder(BorderFactory.createEtchedBorder());

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500,500);
    this.setVisible(true);
    this.add(button);

}
}

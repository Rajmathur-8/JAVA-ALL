import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static  void main(String[] args) {
            ImageIcon image = new ImageIcon("hgh.jpg");


            Border border = BorderFactory.createLineBorder(Color.green,3);


            JLabel label = new JLabel();
            label.setText("Bro, Do you even code??");
            label.setIcon(image);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setForeground(new Color(10,200,180));
            label.setFont(new Font("MV Boli",Font.PLAIN,30));
            label.setIconTextGap(0);
            label.setBackground(Color.black);
            label.setOpaque(true);
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
           // label.setBounds(250,250,250,250);


            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.setSize(420,420);
            //frame.setLayout(null);
            frame.setVisible(true);
            frame.add(label);
            frame.pack();
         }
}
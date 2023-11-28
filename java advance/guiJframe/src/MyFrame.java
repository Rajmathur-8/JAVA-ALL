import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
MyFrame(){
    this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("cn6.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(20,30,50));
}
}

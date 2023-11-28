import javax.swing.*;
import java.awt.*;

public class ProgressBar {
JFrame frame = new JFrame();
JProgressBar bar = new JProgressBar(0,500);
    ProgressBar(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.PLAIN,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420,420);
frame.setLayout(null);
frame.setVisible(true);

fill();
    }
public void fill(){
        int counter=500;
        while (counter>0){
            bar.setValue(counter);
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter -= 1;
        }
        bar.setString("Done!:)");
}
}

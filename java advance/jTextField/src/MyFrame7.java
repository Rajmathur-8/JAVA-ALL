import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame7 extends JFrame implements ActionListener {
JButton button;
JLabel label;
    MyFrame7(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Pick a color");
        button.addActionListener(this);

        label=new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==button){
    JColorChooser colorChooser=new JColorChooser();

    Color color=JColorChooser.showDialog(null,"pick a Color",Color.black);

  //  label.setForeground(color);
    label.setBackground(color);
}
    }
}

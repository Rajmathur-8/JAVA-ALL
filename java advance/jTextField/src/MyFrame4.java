import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame4 extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyFrame4() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals ={"cat","Dog","Bird"};
       comboBox= new JComboBox(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
       // System.out.println(comboBox.getItemCount());
        comboBox.addItem("Rabbit");
        comboBox.insertItemAt("Fish",1);
       // comboBox.setSelectedIndex(0);
        comboBox.removeItem("Fish");

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==comboBox){
    System.out.println(comboBox.getSelectedItem());
}
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame3 extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    MyFrame3() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton= new JRadioButton("Pizza");
        hamburgerButton= new JRadioButton("HamBurger");
        hotdogButton= new JRadioButton("HotDog");

       ButtonGroup group =new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

       pizzaButton.addActionListener(this);
       hamburgerButton.addActionListener(this);
       hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==pizzaButton){
    System.out.println("You orderd pizza :) ");
}
else if(e.getSource()==hamburgerButton){
            System.out.println("You orderd HumBurger :) ");
        }
       else if(e.getSource()==hotdogButton){
            System.out.println("You orderd HotDog :) ");
        }
    }
}

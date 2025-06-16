import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeColor {
    static int i  = 0;
    public static void main(String args[]){
        JFrame f = new JFrame("Change Color Example");
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel  label = new JLabel("");
        JButton b = new JButton("Change Color");
        JPanel p = new JPanel();

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 0){

                    p.setBackground(Color.BLUE);
                    label.setText("Color Changed to Blue.");
                    
                    i = 1;
                }
                else{
                    p.setBackground(Color.PINK);
                    label.setText("Color Changed to Pink.");
                    
                    i = 0;
                }
            }
        });

        p.add(b);
        p.add(label);

        f.add(p);
        f.setVisible(true);
    }
}

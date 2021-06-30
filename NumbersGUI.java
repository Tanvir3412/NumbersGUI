package project1;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class NumbersGUI extends JFrame{   // I inheritied NumberGUI to Jframe. this will allow the us to call method from jframe.

    public NumbersGUI(){ // this is my constructor without return anything
        JFrame frame = new JFrame("Project 01");
        JPanel panel = new JPanel(new GridLayout(3, 3, 3, 3));

        String info="";
        for (int i = 1; i <= 9; i++) {  // each of my cells contain each number from 1 to 9

            info="";

            for(int j=1;j<=100;j++){
                if(j%(i+1)==0){   // if my j is divisible by i +1 then i added a new line.
                    info += j+"\n";
                }
            }
            panel.add(new JTextArea((info)));
        }

        frame.add(panel);
        frame.setSize(600, 600); // i set the dimension. from width 600 and height 600
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // close the tap when you want then click on the 'x' on the upper right corner

    }

}

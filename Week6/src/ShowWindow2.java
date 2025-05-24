import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args){

        final int WINDOW_W = 400;
        final int WINDOW_H = 350;


        JFrame window = new JFrame();

        // JFrame layout
        window.setTitle("My Simple Window");

        window.setSize(WINDOW_W, WINDOW_H);

        window.setLayout(null);

        window.setLocation(600, 250);

        window.getContentPane().setBackground(Color.CYAN);

            // Labels and text fields
            JLabel myLabel = new JLabel("My First Big Label!");
            JLabel myLabel2= new JLabel("My Second Big Label!");
            JTextField myText = new JTextField();
            JTextField myText2 = new JTextField();

                myLabel.setFont(new Font("Arial", Font.PLAIN, 22));

                myLabel2.setFont(new Font("Arial", Font.BOLD, 18));

                myLabel.setLayout(null);
                myLabel.setBounds(30, 40, 320, 30);

                myText.setLayout(null);
                myText.setBounds(30, 70 ,320, 40);

                myLabel2.setLayout(null);
                myLabel2.setBounds(30, 150, 320, 30);

                myText2.setLayout(null);
                myText2.setBounds(30, 180, 320, 40);

    //add labels and text fields
        window.add(myLabel);
        window.add(myText);
        window.add(myLabel2);
        window.add(myText2);

    //close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //display
        window.setVisible(true);


    }
}

import javax.swing.*;

public class SimpleWindow extends JFrame {
    //no main method in this file
    //constructor - special method that displays our attributes

    public SimpleWindow(){
        final int WINDOW_W = 400;
        final int WINDOW_H = 300;

        setTitle("My Second Simple Window");
        setSize(WINDOW_W, WINDOW_H);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}

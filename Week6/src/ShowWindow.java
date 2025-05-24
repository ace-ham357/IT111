import javax.swing.*;

public class ShowWindow {

    public static void main(String[] args){
        //declare variables. make them constants

        final int WINDOW_W = 400;
        final int WINDOW_H = 350;

        //create a window

        JFrame window = new JFrame();

        window.setTitle("My Simple Window");

        window.setSize(WINDOW_W, WINDOW_H);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // you must display window. this is a boolean

        window.setVisible(true);

    }
}

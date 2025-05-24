import javax.swing.*;

public class KiloConverter extends JFrame {

    JPanel panel;
    JLabel messageLabel;
    JTextField kiloTextField;
    JButton calcButton;

    final int WINDOW_W = 400;
    final int WINDOW_H = 400;

    public KiloConverter() {

        setTitle("Kilometer Converter");
        setSize(WINDOW_W, WINDOW_H);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
        add(panel);
        setVisible(true);

    }
    public void buildPanel() {

        messageLabel = new JLabel("Enter a distance in Kilometers");
        kiloTextField = new JTextField(10);
        calcButton = new JButton("calculate");
        panel = new JPanel();

        //add above to JPanel

        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }
    public static void main(String[] args){
        new KiloConverter();

    }


}

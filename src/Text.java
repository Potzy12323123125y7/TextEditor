import javax.swing.*;import java.awt.event.KeyAdapter;

public class Text {
    public Text() { panel1.addKeyListener(new KeyAdapter() { } );}public static void main(String[] args) {
        JFrame frame = new JFrame("Text");
        frame.setContentPane(new Text().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JButton GREJER8Button;
    private JButton GREJER2Button;
    private JButton GREJER3Button;
    private JButton GREJER7Button;
    private JButton GREJER4Button;
    private JButton GREJER6Button;
    private JButton GREJERButton;
    private JButton GREJER5Button;
    private JSpinner spinner1;
    private JTextArea textArea1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

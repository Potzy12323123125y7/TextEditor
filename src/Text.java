import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class Text {


    public Text() { panel1.addKeyListener(new KeyAdapter() { } );
        DO_NOT_SPAMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for (int i = 0; i < 3; i ++ ){
                    String text = textArea1.getText();
                    textArea1.append(text);
                }
            }
        });
        GREJER2Button.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
                JFileChooser fc = new JFileChooser();
                int resultat = fc.showOpenDialog(null);
                if (resultat!= JFileChooser.APPROVE_OPTION) {
                    System.out.println("Ingen fil valdes");
                    System.exit(0);
                    String filnamn = fc.getSelectedFile() .getAbsolutePath();
                    BufferedReader inström = new BufferedReader(new FileReader(filnamn));
                    Scanner sc = new Scanner(fc.getSelectedFile());
                }
            }
        });
    }

    public static void main(String[] args) {
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
    private JButton DO_NOT_SPAMButton;
    private JButton GREJER5Button;
    private JSpinner spinner1;
    private JTextArea textArea1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class Text {


    public Text() {




        CLICKFORSAVEButton.addMouseWheelListener(new MouseWheelListener() {
                                                     @Override
                                                     public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {

                                                         String aktuellMapp = System.getProperty("user.dir");
                                                         JFileChooser fc = new JFileChooser((aktuellMapp));
                                                         int resultat = fc.showSaveDialog(null);
                                                         if (resultat != JFileChooser.APPROVE_OPTION) {
                                                             System.out.println("ingen fil valdes");
                                                             System.exit(0);
                                                         }
                                                         String filnamn = fc.getSelectedFile().getAbsolutePath();
                                                         try {
                                                             PrintWriter inström = new PrintWriter(new BufferedWriter(new FileWriter(filnamn)));
                                                             inström.print(textArea1.getText());
                                                             inström.close();




                                                         } catch (IOException e) {
                                                             e.printStackTrace();
                                                         }


                                                     }
        });

        CLICKFOROPENButton.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent actionEvent) {
                                                      JFileChooser fc = new JFileChooser();
                                                      int resultat = fc.showOpenDialog(null);
                                                      if (resultat != JFileChooser.APPROVE_OPTION) {
                                                          System.out.println("Ingen fil valdes");
                                                          System.exit(0);
                                                      }
                                                      String filnamn = fc.getSelectedFile().getAbsolutePath();
                                                      try {
                                                          BufferedReader inström = new BufferedReader(new FileReader(filnamn));
                                                          while (true) {
                                                              String rad = inström.readLine();
                                                              if (rad == null)
                                                                  break;
                                                              textArea1.append(rad);
                                                          }
                                                      } catch (FileNotFoundException e) {
                                                          e.printStackTrace();
                                                      } catch (IOException e) {
                                                          e.printStackTrace();
                                                      }

                                                  }
                                              }
        );
        CLICKFORCRASHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for (int i = 0; i < 3; i++) {
                    String text = textArea1.getText();
                    textArea1.append(text);
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
    private JButton SCROLLFORSAVE;
    private JButton SCROLLFOROPENButton;
    private JButton GREJER7Button;
    private JButton GREJER4Button;
    private JButton GREJER6Button;
    private JButton GREJER5Button;
    private JSpinner spinner1;
    private JTextArea textArea1;
    private JButton CLICKFORSAVEButton;
    private JButton CLICKFOROPENButton;
    private JButton CLICKFORCRASHButton;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

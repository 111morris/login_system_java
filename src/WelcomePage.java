import javax.swing.*;

public class WelcomePage {
  JFrame frame = new JFrame();
  JLabel welcomeLabel = new JLabel("Hello there ");

  WelcomePage(){
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}

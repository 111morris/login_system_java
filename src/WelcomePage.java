import javax.swing.*;
import java.awt.*;

public class WelcomePage {
  JFrame frame = new JFrame();
  JLabel welcomeLabel = new JLabel("Hello there ");

  WelcomePage(String userId){

    welcomeLabel.setBounds(0,0,200,35);
    welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
    welcomeLabel.setText("hello " + userId);

    frame.add(welcomeLabel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}

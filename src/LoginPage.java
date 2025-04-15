import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");

    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();

    JLabel userIdLabel = new JLabel("UserId: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    LoginPage(HashMap<String,String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50,100,70,25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(120,200,200, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC,20));

        userIdField.setBounds(120,100,200,25);
        userPasswordField.setBounds(120, 150, 200,25);




        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,400);
        frame.setLayout(null);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

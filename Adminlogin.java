
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Adminlogin extends JFrame {

    JLabel title, email, number, empty, signuplabel, image1;
    JPanel plleft;
    JTextField txtemail, txtnumber;
    JButton signup, login, productadder;
    private ImageIcon image;
    private JLabel lblimg, lblstorename;

    public Adminlogin() {

        super.setSize(500, 300);
        super.setVisible(true);
        super.setLayout(null);
        super.setDefaultCloseOperation(3);
        super.setLocationRelativeTo(null);
        title = new JLabel("Login");
        title.setBounds(370, 20, 100, 30);
        empty = new JLabel();

        email = new JLabel("Email");
        email.setBounds(290, 60, 100, 30);

        number = new JLabel("Number");
        number.setBounds(290, 120, 100, 30);

        lblstorename = new JLabel("Nouman's Mart");
        lblstorename.setBounds(56, 40, 250, 300);
        lblstorename.setForeground(Color.WHITE);
        Font font1 = new Font("Arial", 10, 21);
        lblstorename.setFont(font1);

        image = new ImageIcon("C:\\Users\\hp\\Desktop\\logo.png");
        Image img = image.getImage();
        Image size = img.getScaledInstance(100, 130, Image.SCALE_SMOOTH);
        image = new ImageIcon(size);
        lblimg = new JLabel(image);

        lblimg.setBounds(0, 0, 250, 190);

        plleft = new JPanel();
        plleft.setBounds(0, 0, 250, 300);
        plleft.setBackground(new Color(0, 0, 51));

        txtemail = new JTextField(15);
        txtemail.setBounds(290, 90, 180, 30);

        txtnumber = new JTextField(15);
        txtnumber.setBounds(290, 150, 180, 30);

        login = new JButton("Login");
        login.setBounds(290, 190, 100, 27);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = txtemail.getText();
                String number = txtnumber.getText();
                if (email.equals("admin") && number.equals("11")) {

                    dispose();
                    Admintools t1 = new Admintools();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Wrong Credentials");
                }
            }

        });
        super.add(lblimg);
        super.add(lblstorename);

        super.add(title);
        super.add(email);
        super.add(txtemail);
        super.add(number);
        super.add(txtnumber);
        super.add(login);
        super.add(plleft);

        super.add(empty);

    }


}

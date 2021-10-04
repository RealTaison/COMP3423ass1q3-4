import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HistoryWindow implements ActionListener {
    JFrame frame = new JFrame();
    JButton MenuButton;
    JButton Quiz1;
    JButton Quiz2;
    JButton Quiz3;


    HistoryWindow(){
        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("menu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg2 = img2.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
        ImageIcon MenuIcon = new ImageIcon(dimg2);
        MenuButton = new JButton();
        MenuButton.setIcon(MenuIcon);
        MenuButton.setBounds(0,30,82,69);
        MenuButton.setBackground(new Color(0xC4C4C4));
        MenuButton.addActionListener(this);

        JLabel title = new JLabel("Quiz History");
        title.setBounds(10,150,357,150);
        title.setFont(new Font("Cooper Black",Font.PLAIN,40));

        Quiz1 = new JButton("Result: 1/10");
        Quiz1.setHorizontalAlignment(SwingConstants.LEFT);
        Quiz1.setFocusable(false);
        Quiz1.setFont(new Font("Cooper Black",Font.PLAIN,30));
        Quiz1.setBounds(10,250,357,150);
        Quiz1.setBackground(new Color(0x636363));
        Quiz1.setForeground(Color.WHITE);
        Quiz1.addActionListener(this);

        Quiz2 = new JButton("Result: 9/10");
        Quiz2.setHorizontalAlignment(SwingConstants.LEFT);
        Quiz2.setFocusable(false);
        Quiz2.setBounds(10,425,357,150);
        Quiz2.setFont(new Font("Cooper Black",Font.PLAIN,30));
        Quiz2.setBackground(new Color(0x636363));
        Quiz2.setForeground(Color.WHITE);
        Quiz2.addActionListener(this);

        Quiz3 = new JButton("Result: 5/10");
        Quiz3.setHorizontalAlignment(SwingConstants.LEFT);
        Quiz3.setFocusable(false);
        Quiz3.setBounds(10,600,357,150);
        Quiz3.setFont(new Font("Cooper Black",Font.PLAIN,30));
        Quiz3.setBackground(new Color(0x636363));
        Quiz3.setForeground(Color.WHITE);
        Quiz3.addActionListener(this);

        frame.setTitle("Teach Window ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(393,852); //iphone 11 pro size
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x85E2FF));
        frame.add(MenuButton);
        frame.add(Quiz1);
        frame.add(Quiz2);
        frame.add(Quiz3);
        frame.add(title);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==MenuButton){
            MenuWindow menuWindow = new MenuWindow();
            frame.setVisible(false);
        }
    }
}

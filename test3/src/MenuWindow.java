import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MenuWindow implements ActionListener {
    JFrame frame = new JFrame();
    JButton MenuButton;
    JButton MainMenuButton;
    JButton HistoryButton;
    JButton TeachButton;


    MenuWindow(){

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel logoLabel = new JLabel();
        Image dimg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon LogoIcon = new ImageIcon(dimg);
        logoLabel.setBounds(88,226,200,200);
        logoLabel.setIcon(LogoIcon);

        JLabel circle =  new JLabel();
        ImageIcon circleimg = new ImageIcon("circle.png");
        circle.setBounds(97,237,200,199);
        circle.setIcon(circleimg);

        HistoryButton = new JButton();
        HistoryButton.setText("Quiz History");
        HistoryButton.setBounds(55,579,266,48);
        HistoryButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        HistoryButton.setForeground(Color.WHITE);
        HistoryButton.setBackground(new Color(0x636363));
        HistoryButton.setFocusable(false);
        HistoryButton.addActionListener(this);

        MainMenuButton = new JButton("Main Menu");
        MainMenuButton.setBounds(55,500,266,48);
        MainMenuButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        MainMenuButton.setForeground(Color.WHITE);
        MainMenuButton.setBackground(new Color(0x636363));
        MainMenuButton.setFocusable(false);
        MainMenuButton.addActionListener(this);

        TeachButton = new JButton("Teach");
        TeachButton.setBounds(55,658,266,48);
        TeachButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        TeachButton.setForeground(Color.WHITE);
        TeachButton.setBackground(new Color(0x636363));
        TeachButton.setFocusable(false);
        TeachButton.addActionListener(this);




        frame.setTitle("Menu Window ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(393,852); //iphone 11 pro size
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x85E2FF));
        frame.add(MainMenuButton);
        frame.add(HistoryButton);
        frame.add(TeachButton);
        frame.add(logoLabel);
        frame.add(circle);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==MainMenuButton){
            MyFrame myframe = new MyFrame();
            frame.setVisible(false);
        }
        if(e.getSource()==TeachButton){
            TeachWindow teachWindow = new TeachWindow();
            frame.setVisible(false);
        }
        if(e.getSource()==HistoryButton){
            HistoryWindow historyWindow = new HistoryWindow();
            frame.setVisible(false);
        }
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PracticeWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton back = new JButton();
    JButton A = new JButton("54");
    JButton B = new JButton("61");
    JButton C = new JButton("45");
    JButton D = new JButton("55");


    PracticeWindow(){

        ImageIcon image = new ImageIcon("logo.png");

        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("menu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel question = new JLabel("6 X 9 = ?");
        question.setBounds(69,328,238,78);
        question.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));

        JLabel Practice = new JLabel("Practice");
        Practice.setBounds(74,137,228,78);
        Practice.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,60));

        A.setBounds(13,519,161,112);
        A.setBackground(new Color(0x85E2FF));
        A.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));
        A.setFocusable(false);
        A.addActionListener(this);

        B.setBounds(201,519,161,112);
        B.setBackground(new Color(0x85E2FF));
        B.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));
        B.setFocusable(false);
        B.addActionListener(this);

        C.setBounds(13,645,161,112);
        C.setBackground(new Color(0x85E2FF));
        C.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));
        C.setFocusable(false);
        C.addActionListener(this);

        D.setBounds(201,645,161,112);
        D.setBackground(new Color(0x85E2FF));
        D.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));
        D.setFocusable(false);
        D.addActionListener(this);


        Image dimg2 = img2.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
        ImageIcon MenuIcon = new ImageIcon(dimg2);
        back.setIcon(MenuIcon);
        back.setBounds(0,30,82,69);
        back.setBackground(new Color(0xC4C4C4));
        back.addActionListener(this);

        frame.setTitle("Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(393,852); //iphone 11 pro size
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFFE76A));
        frame.add(back);
        frame.add(A);
        frame.add(B);
        frame.add(C);
        frame.add(D);
        frame.add(question);
        frame.add(Practice);
        frame.setIconImage(image.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            MenuWindow menuWindow = new MenuWindow();
            frame.setVisible(false);
        }
        if(e.getSource()==A){
            A.setBackground(new Color(0x4DFF0F));
        }else if(e.getSource()==B){
            B.setBackground(new Color(0xFF3D3D));
        }else if(e.getSource()==C){
            C.setBackground(new Color(0xFF3D3D));
        }else if(e.getSource()==D){
            D.setBackground(new Color(0xFF3D3D));
        }
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame implements ActionListener {

    JButton LearnButton;
    JButton PracticeButton;
    JButton QuizButton;
    JFrame MenuFrame;
    JButton MenuButton;


    MyFrame(){

        ImageIcon image = new ImageIcon("logo.png");

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("menu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //The Learn Table Button
        LearnButton = new JButton();
        LearnButton.setBounds(55,506,266,48);
        LearnButton.setText("Learn Table");
        LearnButton.setFocusable(false);
        LearnButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        LearnButton.setBackground(new Color(0xFD6666));
        LearnButton.setForeground(Color.WHITE);
        LearnButton.addActionListener(this);


        //The Practice Button
        PracticeButton = new JButton();
        PracticeButton.setBounds(55,583,266,48);
        PracticeButton.setText("Practice");
        PracticeButton.setFocusable(false);
        PracticeButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        PracticeButton.setBackground(new Color(0xFEAB5E));
        PracticeButton.setForeground(Color.WHITE);
        PracticeButton.addActionListener(this);

        //The Quiz Button
        QuizButton = new JButton();
        QuizButton.setBounds(55,660,266,48);
        QuizButton.setText("Quiz");
        QuizButton.setFocusable(false);
        QuizButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        QuizButton.setBackground(new Color(0x85E2FF));
        QuizButton.setForeground(Color.WHITE);
        QuizButton.addActionListener(this);

        //Menu Button
        Image dimg2 = img2.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
        ImageIcon MenuIcon = new ImageIcon(dimg2);
        MenuButton = new JButton();
        MenuButton.setBounds(0,30,82,69);
        MenuButton.setBackground(new Color(0xC4C4C4));
        MenuButton.setIcon(MenuIcon);
        MenuButton.addActionListener(this);

        JLabel logoLabel = new JLabel();
        Image dimg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon LogoIcon = new ImageIcon(dimg);
        logoLabel.setBounds(88,226,200,200);
        logoLabel.setIcon(LogoIcon);

        JLabel circle =  new JLabel();
        ImageIcon circleimg = new ImageIcon("circle.png");
        circle.setBounds(97,237,200,199);
        circle.setIcon(circleimg);

        JPanel MultiplicationPanel = new JPanel();
        MultiplicationPanel.setBackground(new Color(0xFFE76A));
        MultiplicationPanel.setBounds(28,153,319,44);

        JLabel MultiplicationLabel = new JLabel("Multiplication Table");
        MultiplicationLabel.setFont(new Font("Cooper Black",Font.PLAIN,31));
        MultiplicationLabel.setBackground(Color.BLACK);

        this.setTitle("Multiplication table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(393,852);  /*as the frame size will include the window bar on top, frame numbers in figma are not sutiable
                                             therefore the frame size has been modified and try to be as similar to the iphone 11 pro*/
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xFFE76A));
        this.add(LearnButton);
        this.add(QuizButton);
        this.add(PracticeButton);
        this.add(MenuButton);
        this.add(logoLabel);
        this.add(circle);
        this.add(MultiplicationPanel);
        this.setIconImage(image.getImage());
        MultiplicationPanel.add(MultiplicationLabel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==LearnButton){
            LearnWindow learnwindow = new LearnWindow();
            this.setVisible(false);
        }
        if(e.getSource()==PracticeButton){
            PracticeWindow practiceWindow = new PracticeWindow();
            this.setVisible(false);
        }
        if(e.getSource()==QuizButton){
            QuizWindow quizWindow = new QuizWindow();
            this.setVisible(false);
        }
        if(e.getSource()==MenuButton){
            MenuWindow menuWindow = new MenuWindow();
            this.setVisible(false);
        }
    }
}

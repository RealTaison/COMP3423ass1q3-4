import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class LearnWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton back = new JButton();
    JButton PracticeButton = new JButton();
    JButton QuizButton = new JButton();

    LearnWindow(){

        ImageIcon image = new ImageIcon("logo.png");

        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("menu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JPanel MultiplicationPanel = new JPanel();
        MultiplicationPanel.setBackground(new Color(0xFFE76A));
        MultiplicationPanel.setBounds(28,153,319,44);

        JLabel MultiplicationLabel = new JLabel("Multiplication Table");
        MultiplicationLabel.setFont(new Font("Cooper Black",Font.PLAIN,31));
        MultiplicationLabel.setBackground(Color.BLACK);

        JTextArea textArea = new JTextArea();
        textArea.setText(multiplication());
        textArea.setBackground(new Color(0xFFE76A));
        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Consolas",Font.BOLD,14));
        textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        textArea.setBounds(10,208,338,344);
        textArea.setEditable(false);


        //The Quiz Button
        QuizButton = new JButton();
        QuizButton.setBounds(55,660,266,48);
        QuizButton.setText("Quiz");
        QuizButton.setFocusable(false);
        QuizButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        QuizButton.setBackground(new Color(0x85E2FF));
        QuizButton.setForeground(Color.WHITE);
        QuizButton.addActionListener(this);

        //Practice button
        PracticeButton = new JButton();
        PracticeButton.setBounds(55,583,266,48);
        PracticeButton.setText("Practice");
        PracticeButton.setFocusable(false);
        PracticeButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        PracticeButton.setBackground(new Color(0xFEAB5E));
        PracticeButton.setForeground(Color.WHITE);
        PracticeButton.addActionListener(this);

        Image dimg2 = img2.getScaledInstance(69, 69, Image.SCALE_SMOOTH);
        ImageIcon MenuIcon = new ImageIcon(dimg2);
        back.setIcon(MenuIcon);
        back.setBounds(0,30,82,69);
        back.setBackground(new Color(0xC4C4C4));
        back.addActionListener(this);

        frame.setTitle("Learn Table ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(393,852); //iphone 11 pro size
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFFE76A));
        frame.add(back);
        frame.add(PracticeButton);
        frame.add(QuizButton);
        frame.add(textArea);
        frame.add(MultiplicationPanel);
        frame.setIconImage(image.getImage());
        MultiplicationPanel.add(MultiplicationLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            MenuWindow menuWindow = new MenuWindow();
            frame.setVisible(false);
        }
        if(e.getSource()==PracticeButton){
            PracticeWindow practiceWindow = new PracticeWindow();
            frame.setVisible(false);
        }
        if(e.getSource()==QuizButton){
            QuizWindow quizWindow = new QuizWindow();
            frame.setVisible(false);
        }
    }

    //the multiplication table itself
    public static String multiplication(){
        StringBuilder str = new StringBuilder();
        Formatter fm = new Formatter(str);

        int i,j;
        for (i = 1;i <= 10; i++){
            for (j = 1;j <= 10; j++){
                int x = j*i;
                fm.format("%4d",j*i);
                //System.out.printf("%4d",j*i);
            }
            str.append("\n\n");
            //System.out.printf("\n");
        }
        return str.toString();
    }
}

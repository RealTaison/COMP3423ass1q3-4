import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizWindow implements ActionListener {

    JFrame frame = new JFrame();
    JFrame resultFrame = new JFrame();
    JButton A = new JButton("54");
    JButton B = new JButton("61");
    JButton C = new JButton("45");
    JButton D = new JButton("55");
    JButton LearnButton;
    JButton PracticeButton;
    JButton QuizButton;
    JButton HomeButton;
    int grade = 0;
    JLabel result = new JLabel();

    QuizWindow(){

        ImageIcon image = new ImageIcon("logo.png");

        JLabel question = new JLabel("6 X 9 = ?");
        question.setBounds(75,327,238,78);
        question.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));

        JLabel number = new JLabel("1 / 10");
        number.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));
        number.setBounds(125,166,150,78);

        JLabel Quiz = new JLabel("Quiz");
        Quiz.setBounds(123,47,129,78);
        Quiz.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,60));

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


        frame.setTitle("Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(393,852); //iphone 11 pro size
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFFE76A));
        frame.add(A);
        frame.add(B);
        frame.add(C);
        frame.add(D);
        frame.add(question);
        frame.add(Quiz);
        frame.setIconImage(image.getImage());
        frame.add(number);


        JLabel Result = new JLabel("Result");
        Result.setBounds(98,136,180,78);
        Result.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,60));

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

        HomeButton = new JButton();
        HomeButton.setBounds(55,737,266,48);
        HomeButton.setText("Home");
        HomeButton.setFocusable(false);
        HomeButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        HomeButton.setBackground(new Color(0xAD78FF));
        HomeButton.setForeground(Color.WHITE);
        HomeButton.addActionListener(this);

        result = new JLabel();
        result.setText(grade + " / 1");
        result.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,40));
        result.setBounds(138,328,100,78);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==A){
            frame.setVisible(false);
            grade++;
            ResultWindow resultWindow = new ResultWindow(grade);
        }
        if(e.getSource()==B || e.getSource()==C || e.getSource()==D){
            frame.setVisible(false);
            ResultWindow resultWindow = new ResultWindow(grade);
        }

    }
}

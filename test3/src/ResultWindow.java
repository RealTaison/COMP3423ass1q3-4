import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultWindow extends JFrame implements ActionListener {

    JLabel result;
    JButton LearnButton;
    JButton PracticeButton;
    JButton QuizButton;
    JLabel Result;
    JButton HomeButton;

    public ResultWindow(int num){
        super();

        Result = new JLabel("Result");
        Result.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));
        Result.setBounds(106,136,180,78);


        result = new JLabel();
        result.setText(num +" / 10");
        result.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,55));
        result.setBounds(121,328,150,78);

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


        this.setTitle("Result");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(393,852);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xFFE76A));
        this.add(result);
        this.add(LearnButton);
        this.add(PracticeButton);
        this.add(QuizButton);
        this.add(Result);
        this.add(HomeButton);


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
        if(e.getSource()==HomeButton){
            MyFrame myframe = new MyFrame();
            this.setVisible(false);
        }
    }
}

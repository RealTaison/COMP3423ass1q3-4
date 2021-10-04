import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class TeachResultWindow implements ActionListener {

    JFrame frame = new JFrame();
    JButton HomeButton;
    JButton ChooseButton;

    TeachResultWindow(int num1, int num2){

        /*JPanel tfPanel = new JPanel();
        tfPanel.setBounds(63,38,160,96);
        tfPanel.setBackground(new Color(0x85E2FF));*/


        JLabel result = new JLabel();
        result.setText(num1 + " X " + num2);
        //result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,65));
        result.setForeground(Color.BLACK);
        result.setBounds(119,88,260,78);

        //ImageIcon image = new ImageIcon("yes.png");



        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("yes.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon LogoIcon = new ImageIcon(dimg);

        JTextArea logo = new JTextArea();
        //logo.setIcon(LogoIcon);
        logo.setBounds(15,200,500,300);
        logo.setBackground(new Color(0x85E2FF));
        logo.setText(multiplication(num1,num2));
        logo.setFont(new Font("Consolas",Font.PLAIN,20));
        logo.setEditable(false);


        ChooseButton = new JButton();
        ChooseButton.setBounds(55,660,266,48);
        ChooseButton.setText("Try Again");
        ChooseButton.setFocusable(false);
        ChooseButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        ChooseButton.setBackground(new Color(0xFF6464));
        ChooseButton.setForeground(Color.WHITE);
        ChooseButton.addActionListener(this);

        HomeButton = new JButton();
        HomeButton.setBounds(55,737,266,48);
        HomeButton.setText("Home");
        HomeButton.setFocusable(false);
        HomeButton.setFont(new Font("Cooper Black",Font.PLAIN,32));
        HomeButton.setBackground(new Color(0xAD78FF));
        HomeButton.setForeground(Color.WHITE);
        HomeButton.addActionListener(this);



        frame.setTitle("Teach Window ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(393,852); //iphone 11 pro size
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x85E2FF));
        //frame.add(tfPanel);
        //tfPanel.add(result);
        frame.add(result);
        frame.add(logo);
        frame.add(HomeButton);
        frame.add(ChooseButton);

    }

    public static String multiplication(int x, int y){
        StringBuilder str = new StringBuilder();
        Formatter fm = new Formatter(str);
        int total = 1;
        for (int i = 0;i < x; i++){
            for (int j = 0;j < y; j++){
                fm.format("%3d",total);
                total++;
            }
            str.append("\n");
        }
        return str.toString();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==HomeButton){
            MyFrame myFrame = new MyFrame();
            frame.setVisible(false);
        }
        if(e.getSource()==ChooseButton){
            TeachWindow teachWindow = new TeachWindow();
            frame.setVisible(false);
        }
    }
}

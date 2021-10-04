import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeachWindow implements ActionListener {
    JFrame frame = new JFrame();
    JTextField tf;
    JTextField tf2;
    JButton confirm;


    TeachWindow(){

        confirm = new JButton("Confirm");
        confirm.setBounds(61,464,266,48);
        confirm.setFocusable(false);
        confirm.setBackground(new Color(0x636363));
        confirm.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,45));
        confirm.setForeground(Color.WHITE);
        confirm.addActionListener(this);

        JPanel tfPanel = new JPanel();
        tfPanel.setBounds(63,338,77,96);
        tfPanel.setBackground(new Color(0x85E2FF));

        tf = new JTextField(2);
        tf.setPreferredSize(new Dimension(77,96));
        tf.setBackground(new Color(0x85E2FF));
        tf.setHorizontalAlignment(SwingConstants.CENTER);
        tf.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,60));

        JPanel tfPanel2 = new JPanel();
        tfPanel2.setBounds(251,338,77,96);
        tfPanel2.setBackground(new Color(0x85E2FF));

        tf2 = new JTextField(2);
        tf2.setPreferredSize(new Dimension(77,96));
        tf2.setBackground(new Color(0x85E2FF));
        tf2.setHorizontalAlignment(SwingConstants.CENTER);
        tf2.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,60));

        JLabel x = new JLabel("X");
        x.setFont(new Font("Berlin Sans FB Demi",Font.PLAIN,60));
        x.setBounds(170,338,77,96);



        frame.setTitle("Teach Window ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(393,852); //iphone 11 pro size
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x85E2FF));
        frame.add(tfPanel);
        tfPanel.add(tf);
        frame.add(tfPanel2);
        tfPanel2.add(tf2);
        frame.add(x);
        frame.add(confirm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==confirm){

            String t1 = tf.getText();
            int num1 = Integer.parseInt(t1);
            String t2 = tf2.getText();
            int num2 = Integer.parseInt(t2);
            TeachResultWindow teachResultWindow = new TeachResultWindow(num1,num2);
            System.out.println(num1+"  "+num2);
            frame.setVisible(false);
        }
    }
}

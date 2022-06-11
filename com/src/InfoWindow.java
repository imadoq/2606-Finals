package Finals.com.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class InfoWindow extends JFrame implements ActionListener {
    private JButton closeBtn;
    InfoWindow()
    {   
        
        JFrame frame1 = new JFrame();
        JLabel label1 = new JLabel("Software Information");
        JPanel p1 = new JPanel();
        JTextArea infoText = new JTextArea();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        Font f = new Font ("Arial",Font.BOLD,18);
        JButton seeImagebtn = new JButton("See Image");
        closeBtn = new JButton("Close");
        Color c = new Color(255,255,0);
        frame1.setBackground(c);
        p1.setBackground(c);
        p2.setBackground(c);
        label1.setFont(f);
        p3.setBackground(c);
        infoText.setEditable(false);
        infoText.setBackground(c);
        infoText.append("NBA 2K22 puts the entire basketball universe in your hands. \nPLAY NOW in real NBA and WNBA environments against authentic teams and players. \nBuild your own dream team in MyTEAM with today’s stars and yesterday’s legends. \nLive out your own pro journey in MyCAREER and experience your personal rise to the NBA. \nFlex your management skills as a powerful Executive in MyGM and MyLEAGUE. \nAnyone, anywhere can hoop in NBA 2K22.");
        closeBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(JOptionPane.showConfirmDialog(null, "Close Info", "Close Info", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                frame1.dispose();
            }
        });

        seeImagebtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                InfoWindowPic p = new InfoWindowPic();
            }
        });
        
        p1.setLayout(new GridLayout(2,2));
        p1.add(label1);
        p2.add(infoText);
        p3.add(closeBtn);
        p3.add(seeImagebtn);
        p1.add(p2);
        frame1.add(p1);
        frame1.add(p3, BorderLayout.SOUTH);
        frame1.pack();
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setTitle("GamesXSoftWare Information");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
package Finals.com.src;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FallGuysInfo extends JFrame {
    FallGuysInfo()
    {
        JFrame frame1 = new JFrame();
        JLabel label1 = new JLabel("Software Information");
        JPanel p1 = new JPanel();
        JTextArea infoText = new JTextArea();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        Font f = new Font ("Arial",Font.BOLD,18);
        JButton closeBtn = new JButton("Close"), seeImagebtn = new JButton("See Image");
        Color c = new Color(255,255,0);
        frame1.setBackground(c);
        p1.setBackground(c);
        p2.setBackground(c);
        label1.setFont(f);
        p3.setBackground(c);
        infoText.setEditable(false);
        infoText.setBackground(c);
        infoText.append("Fall Guys: Ultimate Knockout flings hordes of contestants together online in a wild dash through round after round of escalating chaos until one victor remains! \nBattle bizarre obstacles, shove through unruly competitors, and overcome the unbending laws of physics as you stumble towards greatness. \nLeave your dignity at the door and prepare for hilarious failure in your quest to claim the crown!");
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
                FallGuysPic f = new FallGuysPic();
                
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
}

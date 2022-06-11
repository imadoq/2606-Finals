package Finals.com.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GTA extends JFrame {
    GTA()
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
        infoText.append("When a young street hustler, a retired bank robber and a terrifying psychopath find themselves entangled with some of the most frightening\n and deranged elements of the criminal underworld, the U.S. government and the entertainment industry, they must pull off a series of \ndangerous heists to survive in a ruthless city in which they can trust nobody, least of all each other.");
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
                GrandTheftAutoPic gta = new GrandTheftAutoPic();
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
        
        frame1.setVisible(true);
        frame1.setTitle("GamesXSoftWare Information");
    }
}

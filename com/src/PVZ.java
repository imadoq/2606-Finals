package Finals.com.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PVZ extends JFrame {
    PVZ()
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
        infoText.append("Zombies are invading your home, and the only defense is your arsenal of plants!\n Armed with an alien nursery-worth of zombie-zapping plants like peashooters and cherry bombs,\n you'll need to think fast and plant faster to stop dozens of types of zombies dead in their tracks.");
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
                Plantsvszombiespic pvz = new Plantsvszombiespic();
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

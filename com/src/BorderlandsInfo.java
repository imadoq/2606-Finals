package Finals.com.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BorderlandsInfo extends JFrame implements ActionListener {
    private JButton closeBtn, seeImagebtn;
    BorderlandsInfo()
    {   
        
        JFrame frame1 = new JFrame();
        JLabel label1 = new JLabel("Software Information");
        JPanel p1 = new JPanel();
        JTextArea infoText = new JTextArea();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        Font f = new Font ("Arial",Font.BOLD,18);
        closeBtn = new JButton("Close");
        seeImagebtn = new JButton("See Image");
        Color c = new Color(255,255,0);
        frame1.setBackground(c);
        p1.setBackground(c);
        p2.setBackground(c);
        label1.setFont(f);
        p3.setBackground(c);
        infoText.setEditable(false);
        infoText.setBackground(c);
        infoText.append("The original shooter-looter returns, packing bazillions of guns and an all-new mayhem-fueled adventure! \nBlast through new worlds and enemies as one of four brand new Vault Hunters – the ultimate treasure-seeking badasses of the Borderlands, \neach with deep skill trees, abilities, and customization. Play solo or join with friends to take on insane enemies,\n score loads of loot and save your home from the most ruthless cult leaders in the galaxy.");
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
                BorderLandsInfoPic  b = new BorderLandsInfoPic();
                
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

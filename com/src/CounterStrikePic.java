package Finals.com.src;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class CounterStrikePic extends JFrame implements ActionListener {
	CounterStrikePic() 
	{
		JFrame frame1 = new JFrame();
        JLabel label1 = new JLabel("Software Information");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JLabel label2 = new JLabel("Info here");
        JButton closeBtn = new JButton("Close");
        
        //image
        p2.add(new JLabel(new ImageIcon("C:\\Users\\darre\\Documents\\Folder\\Finals\\com\\SeaOfThieves.jpg")));
        

        closeBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(JOptionPane.showConfirmDialog(null, "Close Info", "Close Info", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                frame1.dispose();
            }
        });
        
        p1.setLayout(new GridLayout(1,2));
        p1.add(label1);
        p1.add(label2);
        p1.add(closeBtn);
        frame1.add(p3, BorderLayout.EAST);
        frame1.add(p2, BorderLayout.SOUTH);
        frame1.add(p1);
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

package Finals.com.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class MainApp extends JFrame implements ActionListener  {
    public static void main(String args[])
    {
        new MainApp();
    }
    private JButton btnAddtoCart;
    private JButton btnInfo;
    private JButton btnCheckout;
    private JButton btnCheckCart;
    private JRadioButton game1, game2, game3, game4, game5, game6, sft1, sft2, sft3;
    public Stack<String> cartStackNames = new Stack<>();
    public Stack<Integer> cartStackPrice = new Stack<>();
    private int x;
    private JTextArea text;
    
    public MainApp()
    {
        super("SoftwareXGames");
        btnAddtoCart = new JButton("Add to cart");
        btnInfo = new JButton("Info");
        btnCheckout = new JButton("Checkout");
        btnCheckCart = new JButton("View Cart");
        JLabel label1 = new JLabel("Software Available");
        JFrame frame = new JFrame();
        JPanel p = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        //Font
        Font f = new Font ("Arial",Font.BOLD,18);
        label1.setFont(f);
        
        //bg colour
        Color c = new Color(255,255,0);
        frame.setBackground(c);
        p.setBackground(c);
        p2.setBackground(c);
        p3.setBackground(c);
        
        text = new JTextArea(10,1);
        text.setEditable(false);
        text.setText("CART: ");
        //software buttons
        game1 = new JRadioButton("NBA 2k22");
        game2 = new JRadioButton("Borderlands3");
        game3 = new JRadioButton("Fall Guys: Ultimate Knockout");
        game4 = new JRadioButton("Grand Theft Auto: V");
        game5 = new JRadioButton("Sea of Thieves");
        game6 = new JRadioButton("Plants vs Zombies GOTY");
        sft1 = new JRadioButton("Adobe premiere pro");
        sft2 = new JRadioButton("Adobe After Effects");
        sft3 = new JRadioButton("Windows 10 Pro");
        ButtonGroup g = new ButtonGroup();//group all radio buttons
        
        p.setLayout(new GridLayout(11,2));
        p2.setPreferredSize(new Dimension(250,100));
        p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        g.add(game1);g.add(game2);g.add(game3);g.add(game4);g.add(game5);g.add(game6);
        g.add(sft1);g.add(sft2);g.add(sft3);
        
        p.add(label1);
        p.add(game1);
        p.add(game2);
        p.add(game3);
        p.add(game4);
        p.add(game5);
        p.add(game6);
        p.add(sft1);
        p.add(sft2);
        p.add(sft3);
        
        p2.add(text);
        p.add(p3,BorderLayout.SOUTH);
        p3.add(btnAddtoCart);
        p3.add(btnCheckCart);
        p3.add(btnInfo);
        p3.add(btnCheckout);
        
        //bg colour
        game1.setBackground(c);
        game2.setBackground(c);
        game3.setBackground(c);
        game4.setBackground(c);
        game5.setBackground(c);
        game6.setBackground(c);
        sft1.setBackground(c);
        sft2.setBackground(c);
        sft3.setBackground(c);
        text.setBackground(c);
        btnAddtoCart.addActionListener(this);
        btnCheckCart.addActionListener(this);
        btnCheckout.addActionListener(this);
        btnInfo.addActionListener(this);
        game1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 1 ;
            }
        });
        game2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 2 ;
            }
        });
        game3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 3 ;
            }
        });
        game4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 4 ;
            }
        });
        game5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 5 ;
            }
        });
        game6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 6 ;
            }
        });
        sft1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 7 ;
            }
        });
        sft2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 8 ; 
            }
        });
        sft3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                x = 9 ; 
            }
        });
        
        frame.add(p, BorderLayout.CENTER);
        frame.add(p2, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("GamesXSoftware");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       if(e.getSource()==btnInfo)
       {
           if(x==1)
           {
            InfoWindow NBA2k = new InfoWindow();
           }
           if(x==2)
           {
            BorderlandsInfo borderlands = new BorderlandsInfo();
           }
           if(x==3)
           {
            FallGuysInfo f = new FallGuysInfo();
           }
           if(x==4)
           {
            GTA g= new GTA();
           }
           if(x==5)
           {
            SeaOfThieves s = new SeaOfThieves();
           }
           if(x==6)
           {
            PVZ p = new PVZ();
           }
           if(x==7)
           {
            PremierePro pp = new PremierePro();
           }
           if(x==8)
           {
            AfterEffects ae = new AfterEffects();
           }
           if(x==9)
           {
            WinTen w = new WinTen();
           }
       }
       else if(e.getSource()==btnCheckout)
       {
           int elem=JOptionPane.showConfirmDialog(null, "Are you sure you want to checkout?", "Checkout", JOptionPane.YES_NO_OPTION);
           if(elem==0)
           {
                JOptionPane.showMessageDialog(null, "Items Checked Out!", "Checkout Confirm", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.clear();
                cartStackPrice.clear();
                text.setText("CART: ");
           }
       }
       else if(e.getSource()==btnAddtoCart)
       {
        if(x == 1)
        {
        int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
        if(elem==0)
        {
            JOptionPane.showMessageDialog(null, "NBA2k22 Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
            cartStackNames.push("NBA 2k22");
            cartStackPrice.push(3590);
        }
        }
        else if(x == 2)
        {
            int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
            if(elem==0)
            {
                JOptionPane.showMessageDialog(null, "Borderlands3 Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.push("Borderlands3");
                cartStackPrice.push(2399);
            }   
        }
        else if(x == 3)
        {
            int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
            if(elem==0)
            {
                JOptionPane.showMessageDialog(null, "Fall Guys: Ultimate Knockout Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.push("Fall Guys: Ultimate Knockout");
                cartStackPrice.push(450);
            }   
        }
        else if(x == 4)
        {
            int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
            if(elem==0)
            {
                JOptionPane.showMessageDialog(null, "Grand Theft Auto: V Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.push("Grand Theft Auto: V");
                cartStackPrice.push(1328);
            }   
        }
        else if(x == 5)
        {
            int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
            if(elem==0)
            {
                JOptionPane.showMessageDialog(null, "Sea of Thieves Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.push("Sea of Thieves");
                cartStackPrice.push(830);
            }   
        }
        else if(x == 6)
        {
            int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
            if(elem==0)
            {
                JOptionPane.showMessageDialog(null, "Plants vs Zombies GOTY Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.push("Plants vs Zombies GOTY");
                cartStackPrice.push(166);
            }   
        }
        else if(x == 7)
        {
            int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
            if(elem==0)
            {
                JOptionPane.showMessageDialog(null, "Adobe Premiere Pro Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.push("Adobe Premiere Pro");
                cartStackPrice.push(1100);
            }   
        }
        else if(x == 8)
        {
            int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
            if(elem==0)
            {
                JOptionPane.showMessageDialog(null, "Adobe After Effects Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.push("Adobe After Effects");
                cartStackPrice.push(800);
            }   
        }
        else if(x == 9)
        {
            int elem=JOptionPane.showConfirmDialog(null, "Add item to Cart?", "Add to Cart", JOptionPane.YES_NO_OPTION);
            if(elem==0)
            {
                JOptionPane.showMessageDialog(null, "Windows 10 Pro Successfully Added to Cart!", "Add to Cart", JOptionPane.INFORMATION_MESSAGE);
                cartStackNames.push("Windows 10 pro");
                cartStackPrice.push(10500);
            }   
        }
        


       }
       else if(e.getSource()==btnCheckCart)
       {
           text.setText("CART: \n");
        for(int z = 0;z<cartStackNames.size();z++)
        {
            text.append(cartStackNames.get(z)+" "+cartStackPrice.get(z)+"Php\n");
        }
       }
    
    }

    

    
}

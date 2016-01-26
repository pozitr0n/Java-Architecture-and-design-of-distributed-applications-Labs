/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonapp;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author IEUser
 */
public class ButtonApp extends Frame implements ActionListener 
{
    Button mainButton = new Button("Exit!");
    public ButtonApp()
    {
        super("mypanel");
        setSize(300,300);
        setBackground(Color.ORANGE);
        add(mainButton);
        mainButton.setBounds(180,250,100,20);
        mainButton.addActionListener(this);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ButtonApp input = new ButtonApp();
        input.setVisible(true);
    }    
    public void actionPerformed( ActionEvent argument )
    {
        if (argument.getSource() == mainButton)
            System.exit(0);
    }
}

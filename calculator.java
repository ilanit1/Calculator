package Calculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class calculator extends JPanel implements ActionListener {


	public void actionPerformed(ActionEvent e) {
		
	}


	public void paint(Graphics g){



		g.setColor(Color.GRAY);
		g.drawRect(24, 10, 430, 90);
		g.setColor(Color.black);
		g.fillRect(25, 11, 429, 89);
	}




}

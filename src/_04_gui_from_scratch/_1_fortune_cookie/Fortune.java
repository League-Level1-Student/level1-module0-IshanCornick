package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		System.out.println("Button Clicked");
		JButton button = new JButton();
		button.setText("<html><body style='font-family: monospaced; text-align: center; '>"
				+ "                                       -----<br>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>----- \n"
				+ "                                      	</body></html>\"");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(2);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null,"You will eat today");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You won't eat today");
		}
	}
}

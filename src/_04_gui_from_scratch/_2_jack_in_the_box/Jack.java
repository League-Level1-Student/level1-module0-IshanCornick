package _04_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import game_tools.Sound;

public class Jack implements ActionListener {
	int i=0;
	static boolean canPlaySounds = true;
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JButton button = new JButton();
		button.setText("<html><body style='font-family: monospaced; text-align: center; '>"
				+ "                                       -----<br>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br>----- \n"
				+ "                                      	</body></html>\"");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
}
	@SuppressWarnings("unused")
	private void showPicture(String jackInTheBox) {
	     try {
	          JLabel imageLabel = createLabelImage(jackInTheBox);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String jackInTheBox) {
	     try {
	          URL imageURL = getClass().getResource(jackInTheBox);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + jackInTheBox);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + jackInTheBox);
	          return new JLabel();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Button Clicked");
		i+=1;
		if (i>=5) {
			playSound("homer-woohoo.wav");
		}
		}
	 public static synchronized void playSound(String fileName) {
	        if (canPlaySounds) {
	            Sound s = new Sound("_04_gui_from_scratch/_2_jack_in_the_box/" + fileName);
	            s.play();
	        } else {
	            JOptionPane.showMessageDialog(null, "Cannot play "+fileName, "No Sound", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}



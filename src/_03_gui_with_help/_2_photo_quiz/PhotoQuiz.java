package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String address= "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8wKIZSLLVMvyjKRDAYs_JdwKN6rDlhsrG0A&s";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(address);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("What color is it");
		// 7. print "CORRECT" if the user gave the right answer
		if (question.equalsIgnoreCase("black") || question.equalsIgnoreCase("red")) {
			JOptionPane.showMessageDialog(quizWindow, "correct");
		}
		else {
			JOptionPane.showMessageDialog(quizWindow, "wrong");
		}
		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);

		// 10. find another image and create it (might take more than one line
		// of code)
		String address1 = "https://media.istockphoto.com/id/183412466/photo/eastern-bluebirds-male-and-female.jpg?s=612x612&w=0&k=20&c=6_EQHnGedwdjM9QTUF2c1ce7cC3XtlxvMPpU5HAouhc=";
		// 11. add the second image to the quiz window
		Component image1;
		image1 = createImage(address1);
		quizWindow.add(image1);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question1 = JOptionPane.showInputDialog("How many birds are there?");
		int questions = Integer.parseInt(question1);
		// 14+ check answer, say if correct or incorrect, etc.
		if (questions == 2) {
			JOptionPane.showMessageDialog(null, "correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

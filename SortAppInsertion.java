package Algorithm_Efficiency;

import java.awt.*;
import javax.swing.*;

public class SortAppInsertion {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new SortControllInsertion());
		frame.setTitle("Sorty");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

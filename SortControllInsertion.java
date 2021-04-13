package Algorithm_Efficiency;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SortControllInsertion extends JPanel {
	private SortingPanelInsertion sortingPanel = new SortingPanelInsertion();

	private JButton nextStepBtn = new JButton("NextStep");

	public SortControllInsertion() {

		setLayout(new BorderLayout());
		add(sortingPanel, BorderLayout.CENTER);
		add(nextStepBtn, BorderLayout.SOUTH);
		
		nextStepBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				sortingPanel.nextStepInSorting();
			}
		});

	}

}
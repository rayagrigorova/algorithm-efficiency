package Algorithm_Efficiency;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JPanel;

class SortingPanelInsertion extends JPanel {
//	3 2 1
//	3| 2 1
//	3 3| 1
//	2 3 | 1
//	2 3 3|
//	2 2 3|
//	1 2 3|
	
	//5, 4, 3, 2, 1
	//-23, 36, 6, 37, 237, 84, 4, -34, 4, 0
	private ArrayList<Integer> numbers = new ArrayList(Arrays.asList(-23, 36, 6, 37, 237, 84, 4, -34, 4, 0));

	private static int noSortingStage = -1;
	private static int incrementIStage = 0; 
	private static int reduceJStage = 1;
	private static int moveStage = 2; //move element one place to the right
	private static int insertElementStage = 3;//insert an element in the sorted part where it is supposed to be 
	private static int isSortedStage = 4;

	private int stage = noSortingStage;
	private int currentElement;
	//i should start from 1 (the value zero will be increased by one in the first incrementIStage
	int currentI = 0;
	//j should start from 0 (the value 1 will be decreased in the first reduceJStage)
	int currentJ = 1;

	public SortingPanelInsertion() {

	}

	public void nextStepInSorting() {
		if (stage == isSortedStage) {
			return;
		}

		if (stage == noSortingStage) {
			stage = incrementIStage; // Initializing stage, continue directly to next stage
		}

		if (stage == incrementIStage) {
			currentI++;
			currentElement = numbers.get(currentI);
			stage = reduceJStage; // Initializing stage, continue directly to next stage
		}

		if (stage == reduceJStage) {
			currentJ--;
		}
		else if (stage == moveStage) {
			numbers.set(currentJ + 1, numbers.get(currentJ));
		}
		else if (stage == insertElementStage) {
			numbers.set(currentJ + 1, currentElement);
		}

		repaint();
		printArray();

	}

	private void nextStage() {
		if (stage == reduceJStage) {
			if(currentJ == -1 ) {
				stage = insertElementStage;
			}
			else {
				stage = moveStage;
			}
		} 
		else if (stage == moveStage) {
			// Ще повторим намаляването само ако currentJ >= 0 и numbers[currentJ] > currentElement
			if (currentJ >= 0 && numbers.get(currentJ) > currentElement) { 
				stage = reduceJStage;
			} else {
				stage = insertElementStage;
			}
		}
		
		else if(stage == insertElementStage) {
			currentJ = currentI + 1; 
			System.out.println(currentI);
			if (currentI < numbers.size() - 1) {
				stage = incrementIStage; // next i

			} else {
				currentI = 0;
				stage = isSortedStage; // finished sorting
				repaint();
				printArray();
			}
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int towerWidth = ((getWidth() - 20) / numbers.size()) - 2;
		int towerHeghtIndex = (getHeight() - 20) / maxElement(numbers);
		int downY = getHeight() - 5;
		for (int j = 0; j < numbers.size(); j++) {

			// establish color
			if (stage == noSortingStage || stage == isSortedStage) {
				g.setColor(Color.BLACK);
			} else if (j == currentJ + 1 && stage == moveStage) {
				g.setColor(Color.RED);
			} else if (j == currentJ) {
				g.setColor(Color.RED);
			} else {
				g.setColor(Color.BLACK);
			}
			
			int leftX = j * towerWidth + 5 * (j + 1);
			int rightX = leftX + towerWidth;
			int upperY = downY - numbers.get(j) * towerHeghtIndex;
			g.drawLine(leftX, downY, leftX, upperY); // left side line
			g.drawLine(leftX, upperY, rightX, upperY); // top line
			g.drawLine(rightX, downY, rightX, upperY); // right line
			
			if(j <= currentI - 1 || stage == isSortedStage) {
				g.setColor(Color.GREEN);
				g.fillRect(leftX,upperY,towerWidth,downY - upperY);
			}
			
			g.setColor(Color.BLACK);
			g.drawString(numbers.get(j).toString(), leftX + towerWidth / 2, downY - 5);
		}

		if (stage != noSortingStage) {
			nextStage();
		}
	}

	public static Integer maxElement(ArrayList<Integer> numbers) {
		Integer max = numbers.get(0);
		for (Integer a : numbers) {
			if (a > max) {
				max = a;
			}
		}

		return max;
	}
	
	public void printArray() {
		System.out.print("Array:  ");
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
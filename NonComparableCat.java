package Algorithm_Efficiency;

import java.util.Comparator;

public class NonComparableCat{
	private String name; 
	private int age;
	private String color; 
	
	NonComparableCat(){
		this.name = "Ivan";
		this.age = 1;
		this.color = "Black";
	}
	NonComparableCat(String name, int age, String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public int getAge() {
		return this.age;
	}
	public void print() {
		System.out.println("Name: " + this.name + " Age: " + this.age + " Color: " + this.color);
	}

}
package Algorithm_Efficiency;

import java.util.Comparator;

public class Cat implements Comparable <Cat> {
	private String name; 
	private int age;
	private String color; 
	
	Cat(){
		this.name = "Ivan";
		this.age = 1;
		this.color = "Black";
	}
	Cat(String name, int age, String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	@Override
	public int compareTo(Cat o) {
		if (this.age > o.age) return 1;
		else if (this.age == o.age) return 0;
		return -1;
	}
	
	public int getAge() {
		return this.age;
	}
	public void print() {
		System.out.println("Name: " + this.name + " Age: " + this.age + " Color: " + this.color);
	}

}

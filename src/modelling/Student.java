package modelling;

import java.util.ArrayList;

public class Student {
 private int number;
 private String name;
 private Course enrollsOn; 
 
 public Student(String name, int number){
	 this.name = name;
	 this.number = number;
 }
 
 public Course getCourse(){
	return enrollsOn;	
}
 

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Course getEnrollsOn() {
	return enrollsOn;
}

public void setEnrollsOn(Course enrollsOn) {
	this.enrollsOn = enrollsOn;
}

}

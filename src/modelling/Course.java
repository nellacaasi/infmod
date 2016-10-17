package modelling;

import java.util.ArrayList;

public class Course {
 private String title;
 private ArrayList <Student> students;
 
 public Course(String title){
	 this.title = title;
 }

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}
}

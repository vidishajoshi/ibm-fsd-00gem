package serivalization;

import java.io.Serializable;

public class Student implements Serializable {
private int id;
private String name;

public Student() {
	super();
}

public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



}

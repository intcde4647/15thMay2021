package com.cts.demos.annotation;


@Author(name="Diptish",version=1.1f)
public class Employee {
private int id;
private String name;
private String desig;

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
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}


}

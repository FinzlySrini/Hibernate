package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

int id;
@Column(name = "name")
String name1;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Id
public String getName() {
	return name1;
}
public void setName(String name) {
	this.name1 = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name1 + "]";
}

}

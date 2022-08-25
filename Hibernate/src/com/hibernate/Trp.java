package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trp {
	@Id
int id;
String name;
String channel;
String branch;
int experience;
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
public String getChannel() {
	return channel;
}
public void setChannel(String channel) {
	this.channel = channel;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
@Override
public String toString() {
	return "trp [id=" + id + ", name=" + name + ", channel=" + channel + ", branch=" + branch + ", experience="
			+ experience + "]";
}

}

package com.main.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Annot2")
public class AnnotAssign {
	@Id
	@GenericGenerator(name="My_Gen" ,strategy="increment")
	@GeneratedValue(strategy=GenerationType.AUTO ,generator="My_Gen")
private int id;
	@Column(name="Name")
private String name;
	@Column(name="Place")
	private String place;
	public AnnotAssign() {
			super();
		}
	public int getId() {
			return id;
		}
	public String getName() {
		return name;
	}
	public String getPlace() {
		return place;
	}
	public void setId(int id) {
		this.id = id;
	}
public void setName(String name) {
	this.name = name;
}
public void setPlace(String place) {
	this.place = place;
}
@Override
public String toString() {
	return "AnnotAssign [id=" + id + ", name=" + name + ", place=" + place + "]";
}

}

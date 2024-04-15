package com.jspiders.springrest1.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="userrest")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false, unique = true)
	private long mobile;
	@Column(nullable = false)
	private String password;
	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private List<Car> cars;
	

}

package com.webupps.spring.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "springboilerplate")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name", length=256)
    private String name;
    @Column(name="username", unique=true, nullable=false, length=256)
    private String username;
    @Column(name="password", nullable=false, length=256)
    private String password;

    public Users() {
    }
    public Users(String name, String username, String password) {
    	this.name = name;
    	this.username = username;
    	this.password = password;
    }
   
    public Long getId() {
        return id;
    }

    public Users setId(Long id) {
        this.id = id;
        return this;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}



package com.microservices.servicediscovery.bean;

public class Course {
    String id;
    String name;
    String name_teacher;
    public String getName_teacher() {
		return name_teacher;
	}

	public void setName_teacher(String name_teacher) {
		this.name_teacher = name_teacher;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.entity;

public class XW {
	 private int id;
	  private String name;
	  private String clazz;
	  private String content;
	  private String time;
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
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public XW() {
		
	}
	public XW(int id, String clazz, String name, String content) {
		super();
		this.id = id;
		this.clazz = clazz;
		this.name = name;
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

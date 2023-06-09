package com.api.book.kitabrestkitab.entities;

public class KITAB {

	private int id;
	private String title;
	private String Author;

	public KITAB(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		Author = author;
	}

	public KITAB() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	@Override
	public String toString() {
		return "KITAB [id=" + id + ", title=" + title + ", Author=" + Author + "]";
	}

}

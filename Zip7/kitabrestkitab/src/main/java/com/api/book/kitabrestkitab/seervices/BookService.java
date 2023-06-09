package com.api.book.kitabrestkitab.seervices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.kitabrestkitab.entities.KITAB;

@Component
public class BookService {

	private static List<KITAB> list = new ArrayList();

	static {

		list.add(new KITAB(11, "Mind Your Own ", "Abhishek"));
		list.add(new KITAB(2, "Attitute", "megs"));
		list.add(new KITAB(1, "Bol", "Tanmay"));

	}

	// get all Kitabs
	public List<KITAB> getAllBooks() {
		return list;
	}

	// get Single book by ID

	
	
	tg1public KITAB getBookById(int id) {
		KITAB book = null;
		book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;
	}
}

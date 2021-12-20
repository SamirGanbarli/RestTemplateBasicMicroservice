package com.company.controller;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.models.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	ArrayList<Book> books = new ArrayList<>(Arrays.asList(
			new Book(1,"A","A.A","***"),
			new Book(2,"B","B.B","***"),
			new Book(3,"C","C.C","****")
			));

	

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Book giveBook(@PathVariable("id") String id) {
		
		for (int i = 0; i < books.size(); i++) {

			if (String.valueOf(books.get(i).getId()).equals(id)) {

				return books.get(i);

			} else {
				continue;
			}

		}

		return new Book("Need a Correct Id");

	}

}

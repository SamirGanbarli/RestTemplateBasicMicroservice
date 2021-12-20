package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.company.models.Book;
import com.company.models.BookAndUser;
import com.company.models.UserAndRating;

@RestController
@RequestMapping("/main")
public class BookUserController {

	@Autowired
	private RestTemplate restTemplate;
	
	UserAndRating userInfo;
	Book bookInfo;
	
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public BookAndUser getUserInfo(@PathVariable("userId") Integer userId){
		
		userInfo = restTemplate.getForObject("http://localhost:8081/ratings/"+userId, UserAndRating.class);
		//then sending request to book info using userInfo.getBookId() to get the book infos
		
		bookInfo = restTemplate.getForObject("http://localhost:8082/books/"+String.valueOf(userInfo.getBookId()),Book.class);
		
		return new BookAndUser(userInfo.getUserId(),bookInfo.getId(),bookInfo.getName(),Integer.valueOf(userInfo.getRatingOfBook()));
		
	}
}

package com.company.model;

public class UserAndRating {

	private Integer id;
	private Integer userId;
	private Integer bookId;
	private String ratingOfBook;
	
	public UserAndRating(Integer id, Integer userId, Integer bookId, String ratingOfBook) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.ratingOfBook = ratingOfBook;
	}
	
	public UserAndRating( Integer userId, Integer bookId, String ratingOfBook) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.ratingOfBook = ratingOfBook;
	}

	public UserAndRating() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getRatingOfBook() {
		return ratingOfBook;
	}

	public void setRatingOfBook(String ratingOfBook) {
		this.ratingOfBook = ratingOfBook;
	}
	
	
}

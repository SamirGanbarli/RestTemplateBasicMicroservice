package com.company.models;

public class BookAndUser {
	
	private Integer id;
	private Integer userId;
	private Integer bookId;
	private String bookName;
	private Integer userRating;
	
	public BookAndUser(Integer id, Integer userId, Integer bookId, String bookName,
			Integer userRating) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.userRating = userRating;
	}
	
	public BookAndUser(Integer userId,Integer bookId, String bookName,
			Integer userRating) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.userRating = userRating;
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

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getUserRating() {
		return userRating;
	}

	public void setUserRating(Integer userRating) {
		this.userRating = userRating;
	}

	public BookAndUser() {
		super();
	}

}

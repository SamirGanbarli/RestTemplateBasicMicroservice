package com.company.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.UserAndRating;

@RestController
@RequestMapping("/ratings")
public class UserRatingController {

	ArrayList<UserAndRating> userRating = new ArrayList<>(
			Arrays.asList(new UserAndRating(1, 1, "7"), new UserAndRating(2, 2, "9"), new UserAndRating(3, 3, "10")));

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public UserAndRating giveUserRating(@PathVariable("userId") String userId) {

		for (int i = 0; i < userRating.size(); i++) {

			if (String.valueOf(userRating.get(i).getUserId()).equals(userId)) {

				return userRating.get(i);

			} else {
				continue;
			}

		}

		return null;
	}
}

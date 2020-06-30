package com.lahsiv.mbfd.posts;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.lahsiv.mbfd.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Posts {

	@Id
	double postId;
	
	User user;
	
	String post;
	
	List<Comments> comments;
	
	List<User> likes;
	
}

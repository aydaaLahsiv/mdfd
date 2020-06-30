package com.lahsiv.mbfd.channel;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.lahsiv.mbfd.posts.Posts;
import com.lahsiv.mbfd.user.User;

import lombok.Data;

@Data
public class Channel {
	
	@Id
	public String channelId;
	
	public String channelName;
	
	public List<User> moderators;
	
	public boolean restricted;
	
	List<Posts> posts;
	
	

}

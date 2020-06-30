package com.lahsiv.mbfd;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lahsiv.mbfd.user.User;
import com.lahsiv.mbfd.user.UserRepository;

@SpringBootApplication
public class MbfdApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MbfdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		userRepository.save(new User("ravishav", "vish@abc.com", "VIsh", "Ravi", new Date(), "xE7sna!s"));
		userRepository.save(new User("ravisha2", "vish@abc.com", "VIsh", "Ravi", new Date(), "xE7sna!s"));
	
	System.out.println("Printing Repository");
	
	System.out.println(userRepository.count());
	}

}

package org.sid;



import java.util.stream.Stream;

import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeockerAppApplication {

	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(DeockerAppApplication.class, args);
	}
	@Bean
	CommandLineRunner start() {
		return  args->{
			Stream.of("Bassem","Firas","Bilel","Saif","Raed").forEach(u->{
				User user=new User();
				user.setNom(u);
				user.setAge("24");
				userRepository.save(user);
				
			});
		
	};
	}

}

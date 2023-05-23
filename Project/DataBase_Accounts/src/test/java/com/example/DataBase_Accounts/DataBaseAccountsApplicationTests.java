package com.example.DataBase_Accounts;

import com.example.myaplication.DataFile.Auth.entities.User;
import com.example.myaplication.DataFile.Auth.entities.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.myaplication.DataFile.Auth.entities.Role;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class UserRepositpryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
		User user = new User();
		user.setUsername("Luca");
		user.setPassword("admin");
		user.setFirstName("Nastasa");
		user.setLastName("admin");
		user.setEmail("admin");
		user.setPhone("admin");
		user.setRole(Role.class.cast("admin"));
		User saveduser =userRepository.save(user);

		Assertions.assertThat(saveduser).isNotNull();
		Assertions.assertThat(saveduser.getId()).isGreaterThan(0);
	}
	@Test
	public void printAll(){
		Iterable<User> users = userRepository.findAll();
		for(User user: users){
			System.out.println(user);
		}
	}
}

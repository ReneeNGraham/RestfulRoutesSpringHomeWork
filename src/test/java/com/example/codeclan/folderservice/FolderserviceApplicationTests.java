package com.example.codeclan.folderservice;

import com.example.codeclan.folderservice.models.File;
import com.example.codeclan.folderservice.models.Folder;
import com.example.codeclan.folderservice.models.User;
import com.example.codeclan.folderservice.repositories.FileRepository;
import com.example.codeclan.folderservice.repositories.FolderRepository;
import com.example.codeclan.folderservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FolderserviceApplicationTests {



	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createFile(){
		Folder folder1 = new Folder("Important documents", user1);
		folderRepository.save(folder1);

		File tech = new File("list of tech employees", "txt", 10, folder1);
		fileRepository.save(tech);

		User user1 = new User("Tina Turner");
		userRepository.save(user1);


	}

}

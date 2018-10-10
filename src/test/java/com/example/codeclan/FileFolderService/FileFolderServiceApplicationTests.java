package com.example.codeclan.FileFolderService;

import com.example.codeclan.FileFolderService.models.Folder;
import com.example.codeclan.FileFolderService.models.User;
import com.example.codeclan.FileFolderService.repositories.FileRepository;
import com.example.codeclan.FileFolderService.repositories.FolderRepository;
import com.example.codeclan.FileFolderService.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileFolderServiceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;



	@Test
	public void contextLoads() {
	}

	@Test
	public  void canCreateUserAndFolder(){
		User lenny = new User("Lenny");
		userRepository.save(lenny);

        Folder week4 = new Folder("Katas", lenny);
        folderRepository.save(week4);
	}


}

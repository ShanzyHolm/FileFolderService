package com.example.codeclan.FileFolderService.components;

import com.example.codeclan.FileFolderService.models.File;
import com.example.codeclan.FileFolderService.models.Folder;
import com.example.codeclan.FileFolderService.models.User;
import com.example.codeclan.FileFolderService.repositories.FileRepository;
import com.example.codeclan.FileFolderService.repositories.FolderRepository;
import com.example.codeclan.FileFolderService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User sherlock = new User("Sherlock Holmes");
        userRepository.save(sherlock);

        User watson = new User("Dr Watson");
        userRepository.save(watson);



        Folder week02 = new Folder("CodeClan Week_02", sherlock);
        folderRepository.save(week02);

        Folder week2 = new Folder("CodeClan_Week_2", watson);
        folderRepository.save(week2);

        Folder week03 = new Folder("CodeClanWeek_03", sherlock);
        folderRepository.save(week03);

        Folder week10 = new Folder("CodeClan_Week_10", watson);
        folderRepository.save(week10);

        Folder week13 = new Folder("CodeClan_Week_13", watson);
        folderRepository.save(week13);



        File file1 = new File("Bear River Fish", "rb", 1.2, week02);
        fileRepository.save(file1);

        File fileLab = new File("LabBear_River_Fish", "rb", 0.9, week2);
        fileRepository.save(fileLab);

        File file2 = new File("PDA Evidence", "pages", 5.1, week03);
        fileRepository.save(file2);

        File fileCV = new File("My CV", "doc", 0.6, week10);
        fileRepository.save(fileCV);

        File fileResearch = new File("Partner Research", "pdf", 2.2, week10);
        fileRepository.save(fileResearch);

        File file = new File("File", "java", 0.2, week13);
        fileRepository.save(file);

        File folder = new File("Folder", "java", 0.8, week13);
        fileRepository.save(folder);

        File user = new File("User", "java", 0.3, week13);
        fileRepository.save(user);

        File dataLoader = new File("DataLoader/Seeds", "java", 0.3, week13);
        fileRepository.save(dataLoader);


    }
}

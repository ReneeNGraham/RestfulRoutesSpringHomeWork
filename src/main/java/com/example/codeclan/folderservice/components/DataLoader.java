package com.example.codeclan.folderservice.components;

import com.example.codeclan.folderservice.models.File;
import com.example.codeclan.folderservice.models.Folder;
import com.example.codeclan.folderservice.models.User;
import com.example.codeclan.folderservice.repositories.FileRepository;
import com.example.codeclan.folderservice.repositories.FolderRepository;
import com.example.codeclan.folderservice.repositories.UserRepository;
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
        Folder important = new Folder("Important Documents", user1);
        folderRepository.save(important);
        Folder management = new Folder("Management documents", user2);
        folderRepository.save(management);
        Folder banking = new Folder("Banking documents", user3);
        folderRepository.save(banking);
        Folder tax = new Folder("Tax documents", user4);
        folderRepository.save(tax);
        Folder idea = new Folder("Expansion Ideas", user5);
        folderRepository.save(idea);
        Folder best = new Folder("Best practices", user6);
        folderRepository.save(best);
        File clients = new File("Client list", "txt", 10, important);
        fileRepository.save(clients);
        File managers = new File("Manager list", "txt", 10, management);
        fileRepository.save(managers);
        File payments = new File("Payment list", "txt", 10, banking);
        fileRepository.save(payments);
        File vat = new File("Tax informatiom", "txt", 10, tax);
        fileRepository.save(vat);
        File latest = new File("Ideas for the business", "txt", 10, idea);
        fileRepository.save(latest);
        File sales = new File("Best practices for the business", "txt", 10, best);

        User user1 = new User("Dennis");
        userRepository.save(user1);
        User user2 = new User("Tandy");
        userRepository.save(user2);
        User user3 = new User("Lara");
        userRepository.save(user3);
        User user4 = new User("Yussuf");
        userRepository.save(user4);
        User user5 = new User("Daniella");
        userRepository.save(user5);
        User user6 = new User("Martin");
        userRepository.save(user6);
    }

}

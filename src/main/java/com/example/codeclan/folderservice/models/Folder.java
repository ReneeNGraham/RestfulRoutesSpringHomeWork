package com.example.codeclan.folderservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @JsonIgnoreProperties({"folder"})
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    @JsonIgnoreProperties({"folder"})
    @OneToMany(mappedBy="folder")

    private List<File> files;

    public Folder(String name, User user ) {
        this.name = name;
        this.user = user;
        this.files = new ArrayList<File>();
    }

    public Folder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}


package ru.aleynikov.blogcamp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User {

    private int id;
    private String username;
    private String password;
    private String secretQuestion;
    private String secretAnswer;
    private boolean active;
    private Date registeredDate;
    private String about;

    public User(int id, String username, String password, String secretQuestion, String secretAnswer, boolean active, Date registeredDate, String about) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.active = active;
        this.registeredDate = registeredDate;
        this.about = about;
    }

    public User() {}
}

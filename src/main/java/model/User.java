package model;

import lombok.*;

@Data
public class User {
    private long id;
    private String name;
    private String lastName;
    private byte age;
}
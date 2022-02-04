package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Student {

    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;
    private Lesson lesson;
    private Date registeredDate;

    public Student(String poxos, String poxosyan, int age, String email, String phone, Lesson lesson, String s) {
    }
}

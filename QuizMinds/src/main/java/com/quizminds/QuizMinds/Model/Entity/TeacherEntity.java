package com.quizminds.QuizMinds.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table
public final class TeacherEntity extends PersonEntity{
    private String speciality;
    public TeacherEntity(String id , String firstname , String lastname, LocalDate bd, String address, String speciality){
        super(id,firstname,lastname,bd,address);
        setSpeciality(speciality);
    }
}

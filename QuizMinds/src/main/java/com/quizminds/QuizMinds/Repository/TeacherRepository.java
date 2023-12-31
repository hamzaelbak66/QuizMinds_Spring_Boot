package com.quizminds.QuizMinds.Repository;

import com.quizminds.QuizMinds.Model.DTO.Resp.TeacherRespDTO;
import com.quizminds.QuizMinds.Model.DTO.TeacherDTO;
import com.quizminds.QuizMinds.Model.Entity.TeacherEntity;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity, String> {
    TeacherEntity findTeacherEntityByCodeOrEmail(String code, String email);

    TeacherEntity findTeacherEntityByCode(String code);
}

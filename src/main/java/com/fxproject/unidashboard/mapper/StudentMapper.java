package com.fxproject.unidashboard.mapper;

import com.fxproject.unidashboard.dto.StudentDto;
import com.fxproject.unidashboard.model.Student;

import java.util.List;

public class StudentMapper {

    private StudentMapper() {
    }

    public static List<StudentDto> mapToStudentDtos(List<Student> allStudents) {
        return allStudents.stream()
                .map(student ->
                        new StudentDto(
                                student.getId(),
                                "100000",
                                student.getFirstName(),
                                student.getSecondName(),
                                student.getLastName(),
                                student.getEmail(),
                                student.getEmail(),//todo: universityEmail
                                student.getPhoneNumber(),
                                student.getPesel())
                ).toList();
    }
}

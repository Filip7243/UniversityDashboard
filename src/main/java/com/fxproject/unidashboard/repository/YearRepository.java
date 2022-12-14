package com.fxproject.unidashboard.repository;

import com.fxproject.unidashboard.model.FieldOfStudy;
import com.fxproject.unidashboard.model.Student;
import com.fxproject.unidashboard.model.Year;

import java.util.List;

public interface YearRepository extends DefaultRepository<Year, Long>{

    List<Year> findYearsByName(String name);
    List<Year> findYearsByStudent(Student student);
    List<Year> findYearByFieldOfStudy(FieldOfStudy fieldOfStudy);
    List<Year> findYearsByYearOfStudy(Integer yearOfStudy);
}

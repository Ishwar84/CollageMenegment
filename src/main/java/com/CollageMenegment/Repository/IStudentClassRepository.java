package com.CollageMenegment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CollageMenegment.model.StudentClass;
@Repository
public interface IStudentClassRepository extends JpaRepository<StudentClass, Long>{
}

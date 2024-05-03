package com.CollageMenegment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CollageMenegment.model.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Long> {

}

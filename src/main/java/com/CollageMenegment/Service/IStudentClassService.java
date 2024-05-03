package com.CollageMenegment.Service;

import java.util.List;
import java.util.Optional;
import com.CollageMenegment.model.StudentClass;

public interface IStudentClassService {


	StudentClass create(StudentClass std);

	List<StudentClass> getAllclass();


	void deleteClasses(Long classId);

	Optional<StudentClass> getById(Long classId);

	StudentClass updateById(Long classId);

	StudentClass updateClasses(StudentClass st);

}

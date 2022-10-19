package edu.miu.cs.cs425.studentmgmt.repo;

import edu.miu.cs.cs425.studentmgmt.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}

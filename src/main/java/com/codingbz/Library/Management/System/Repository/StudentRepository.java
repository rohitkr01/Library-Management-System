package com.codingbz.Library.Management.System.Repository;

import com.codingbz.Library.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

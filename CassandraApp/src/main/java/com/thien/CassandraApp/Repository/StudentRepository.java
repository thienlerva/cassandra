package com.thien.CassandraApp.Repository;

import com.thien.CassandraApp.model.Student;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface StudentRepository extends CassandraRepository<Student, Integer> {

    @AllowFiltering
    List<Student> findByAgeGreaterThan(Integer age);
}

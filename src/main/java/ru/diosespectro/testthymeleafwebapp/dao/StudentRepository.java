package ru.diosespectro.testthymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.diosespectro.testthymeleafwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

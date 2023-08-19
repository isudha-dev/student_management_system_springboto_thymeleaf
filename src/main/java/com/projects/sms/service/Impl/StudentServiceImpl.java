package com.projects.sms.service.Impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.projects.sms.entity.Student;
import com.projects.sms.repository.StudentRepository;
import com.projects.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    public StudentServiceImpl(final StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student saveStudent(final Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student getStudentById(final Long id) {
        return studentRepository.findById(id).get();
    }
    @Override
    public Student updateStudent(final Student student) {
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }
}

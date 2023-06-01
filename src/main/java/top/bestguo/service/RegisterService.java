package top.bestguo.service;

import top.bestguo.entity.Student;
import top.bestguo.entity.Teacher;
                //注册
public interface RegisterService {
    int addStudent(Student student);
    int addTeacher(Teacher teacher);
}

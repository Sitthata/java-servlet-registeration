package com.example.subject.repository;

import com.example.subject.entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    static List<Subject> subjects;

    static {
        subjects = new ArrayList<>();
        initialize();
    }

    public static void initialize() {
        subjects.add(new Subject("INT103", "Advance Programming", 0));
        subjects.add(new Subject("INT104", "Database Management", 0));
        subjects.add(new Subject("INT105", "Web Programming", 0));
        subjects.add(new Subject("INT106", "Computer Network", 0));
        subjects.add(new Subject("INT107", "System Analysis and Design", 0));
        subjects.add(new Subject("INT108", "Data Structure and Algorithm", 0));
    }

    public static List<Subject> getAllStudent() {
        return subjects;
    }

    public static void addSubject(Subject subject) {
        subjects.add(subject);
    }

}

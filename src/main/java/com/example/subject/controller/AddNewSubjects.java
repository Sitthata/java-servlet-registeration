package com.example.subject.controller;

import com.example.subject.entities.Subject;
import com.example.subject.repository.SubjectRepository;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddSubject")
public class AddNewSubjects extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String credit = request.getParameter("credit");

        Subject newSubject = new Subject(
            id,
            title,
            Double.parseDouble(credit)
        );

        SubjectRepository.addSubject(newSubject);
    }
}

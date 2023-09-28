package com.example.subject.controller;

import com.example.subject.entities.Subject;
import com.example.subject.repository.SubjectRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet("/SubjectList")
public class ViewAllSubjectServlet extends HttpServlet {
    private long start;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Fetch data from Repository
        List<Subject> subjects = SubjectRepository.getAllStudent();
        // Forward to View
        request.setAttribute("subjects",
                subjects != null && !subjects.isEmpty() ? subjects : Collections.emptyList());
        request.getRequestDispatcher("/subject-listing.jsp").forward(request, response);
    }

    @Override
    public void init() {
        start = System.currentTimeMillis();
    }

    @Override
    public void destroy() {
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Duration: " + duration + " milliseconds");
    }
}

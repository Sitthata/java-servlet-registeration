package com.example.subject.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Subject {
    private String id;
    private String title;
    private double credit;
}

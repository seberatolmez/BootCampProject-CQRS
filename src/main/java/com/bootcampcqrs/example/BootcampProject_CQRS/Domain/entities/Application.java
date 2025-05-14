package com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "applicantId")
    @ManyToOne
    private Applicant applicant;

    @JoinColumn(name = "bootcampId")
    @ManyToOne
    private Bootcamp bootcamp;

}

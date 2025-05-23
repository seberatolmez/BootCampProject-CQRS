package com.bootcampcqrs.example.BootcampProject_CQRS.Domain.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blacklists")
public class Blacklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "reason")
    private String reason;

    @Column(name = "date")
    private LocalDateTime date ;

    @JoinColumn(name = "applicantId")
    @ManyToOne
    private Applicant applicant ;

    public int getId() {
        return id;
    }

    public String getReason() {
        return reason;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Applicant getApplicant() {
        return applicant;
    }
}

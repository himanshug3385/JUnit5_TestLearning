package com.learning.TestLearning.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Employee_Table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_Name", nullable = false)
    private String firstName;
    @Column(name="last_Name", nullable = false)
    private String lastName;
    @Column(name="email", nullable = false)
    private String email;
}

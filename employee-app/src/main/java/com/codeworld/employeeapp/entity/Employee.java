package com.codeworld.employeeapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(
        name = "tbl_employee"
)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Max(20)
    private String name;
    @Max(20)
    private String lastname;
    @Email
    private String email;
    @Max(25)
    private String phone;
}

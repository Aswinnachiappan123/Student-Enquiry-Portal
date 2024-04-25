package com.coursecompass.courses.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="co_realenquiress")
public class Enquires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eid;
    private String name;
    private String email;
    private String phone;
    private String program;
    private String inquiry;
}

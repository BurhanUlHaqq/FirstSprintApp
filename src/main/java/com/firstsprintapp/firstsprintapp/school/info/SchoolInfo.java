package com.firstsprintapp.firstsprintapp.school.info;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SchoolInfo {
    @Id
    @SequenceGenerator(
            name = "school_info_sequence",
            sequenceName = "school_info_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "school_info_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String schoolName;
    private LocalDate established;
    private String level;
    private String address;
}

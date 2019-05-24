package com.tunedapps.reg.entites;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@ToString
public class Student extends EntityBase {

    private Gender gender;
    private LocalDate bod;
    private List<Course> courses;
    private Location location;
}



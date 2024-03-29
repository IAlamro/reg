package com.tunedapps.reg.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Course extends EntityBase {

    private int credits;
    private List<Student> students;

}

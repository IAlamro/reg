package com.tunedapps.reg.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Location extends EntityBase{

    private String streetName;
    private int buildingNo;
    private List<Student> students;
}

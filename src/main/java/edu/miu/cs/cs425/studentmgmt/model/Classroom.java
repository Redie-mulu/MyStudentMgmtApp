package edu.miu.cs.cs425.studentmgmt.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classroomId;
    private String buildingName;
    private String roomNumber;

//    @ManyToMany
//    private List<Student> students;

    public Classroom() {
    }

    public Classroom(Integer classroomId, String buildingName, String roomNumber) {
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }


}

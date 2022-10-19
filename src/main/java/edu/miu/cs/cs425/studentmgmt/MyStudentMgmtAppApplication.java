package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.repo.StudentRepo;
import edu.miu.cs.cs425.studentmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

    @Autowired

    private StudentService studentService;

    public static void main(String[] args) {
        System.out.println("hhhhhh");
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started");
//        long studentId, long studentNumber,
//                   String firstName, String middleName,
//                   String lastName, double cgpa,
//                   LocalDate dateOfEnrollment
        LocalDate redietEnrollmentDate = LocalDate.of(2020, 1,8);
        LocalDate annaEnrollmentDate = LocalDate.of(2019, 5,24);
//        Student s1 = new Student(1, "000-61-0001", "Anna", "Lynn","Smith", 3.9, annaEnrollmentDate );
//        Student student1 = new Student(2, "111", "Rediet", "Muluneh","Woldemariam", 3.9, redietEnrollmentDate );

//        studentService.saveStudent(s1);
//        studentService.saveStudent(student1);
        Student s3 = new Student(3, "000-61-0001", "Jhon", "Doe","Smith", 3.9,annaEnrollmentDate);

        Transcript t1 = new Transcript(1,"BS Computer Science", s3);
        Classroom c1 = new Classroom(1, "McLaughlin building", "M105");
        List<Classroom> classrooms = new ArrayList<>();
        classrooms.add(c1);

        // new Student

        s3.setTranscript(t1);
        studentService.saveStudent(s3);

    }
}

package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@Component
public class FileSaver {


    public void saveToFile(Student student) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("AllStudents.txt");
        out.print(student.toString());
        out.close();
    }
}

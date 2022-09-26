package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(1,0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
        if (y == 0)  {
            try {
                throw new ArithmeticException("You cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            int divided = x / y;
        }
    }

    // If a student’s submitted file ends in .java, they get 1 point. If a student’s submitted file doesn’t end in .java, they get 0 points. If the file submitted is null or an empty string, an exception should be thrown and you should give the student -1 points. What kind of exception is up to you, including to a custom exception!
    public static int CheckFileExtension(String fileName) {
        int studentPoints;

        if(fileName == "")  {
            try {
                throw new ArithmeticException("No file has been submitted");
            } catch (ArithmeticException e) {
                studentPoints = -1;
                e.printStackTrace();
            }
        } else if (fileName.contains(".java"))  {
            studentPoints = 1;
        } else {studentPoints = 0;}

        return studentPoints;
    }

}

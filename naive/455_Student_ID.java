//455_Student_ID

class Student {
    public int id;
    
    public Student(int id) {
        this.id = id;
    }
}

public class Class {
    /**
     * Declare a public attribute `students` which is an array of `Student`
     * instances
     */
    // write your code here.
    
    Student[] students;
    
    public Class(int n) {
        students = new Student[n];
        
        for(int i = 0; i < n; i++) {
            students[i] = new Student(i);
        }
    }
    
     
    /**
     * Declare a constructor with a parameter n which is the total number of
     * students in the *class*. The constructor should create n Student
     * instances and initialized with student id from 0 ~ n-1
     */
    // write your code here
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.ArrayList;

/**
 *
 * @author NLAB1
 */
public class Student {
    public int studentId;
    public String name;
    public Semester SemesterEnrolled;
    public Department department;
    public ArrayList<Course> courseList;
    public ArrayList<Course> coursesCompleted;
    
    public Student(int Id, String name, Department d){
        this.studentId = Id;
        this.name = name;
        this.department = d;
        
        this.courseList = new ArrayList<>();
        this.coursesCompleted = new ArrayList<>();
    }
    
    public void CourseAdd(Course course){
        this.courseList.add(course);
    }
    
    public void CourseAdd(ArrayList<Course> courses){
        for(int i=0; i<courses.size(); i++){
            this.courseList.add(courses.get(i));
        }
    }
    
    
    public void CourseDrop(Course course){
        this.courseList.remove(course);
    }
    
    public void SemesterEnrollment(Semester s){
        this.SemesterEnrolled = s;
    }
    
    public void EndSemester(){
        this.SemesterEnrolled = null;
        for(int i=0; i<this.courseList.size(); i++){
            this.coursesCompleted.add(this.courseList.get(i));
        }
        this.courseList=new ArrayList<>();
    }
    
    public void printEnrolledCourses(){
        for(int i=0; i<this.courseList.size(); i++){
            System.out.println("ID: "+this.courseList.get(i).courseId + " Course Name:"+ this.courseList.get(i).courseName);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Shawn Gregory
 */
public class Student {
    private String name;
    private String gender;
    private String email;
    private Course course1;
    private Course course2;
    private Course course3;
    
    /**
     * Default constructor
     */
    public Student() {
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();
    }

    /**
     * Constructor for some of the data members
     * @param name The data members for the year
     * @param gender The data member for the gender
     * @param email The data member for email addresses
     */
    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    /**
     * Constructor for the data members
     * @param name The data member for the name
     * @param gender The data member for the gender
     * @param email the data member for email addresses
     * @param course1 the data member for the 1st course
     * @param course2 the data member for the 2nd course
     * @param course3 the data member for the 3rd course
     */
    public Student(String name, String gender, String email, String course1, String course2, String course3) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();
    }
    
    /**
     * The copy constructor
     * @param student the copy constructor for all 6 data members
     */
    public Student(Student student) {
        this.name = student.name;
        this.gender = student.gender;
        this.email = student.email;
        this.course1 = student.course1;
        this.course2 = student.course2;
        this.course3 = student.course3;
    }
    
    /**
     * To see how many courses I passed
     * @return Number of courses I passed
     */
    public int calcPassedCourseNum() {
        int passedCourse = 0;
        if (course1.isPassed())
            passedCourse++;
        if (course2.isPassed())
            passedCourse++;
        if (course3.isPassed())
            passedCourse++;
        return passedCourse;
    }
    
    /**
     * To calculate how many credits I will receive
     * @return the number of credits I received
     */
    public double calcTotalCredit() {
        double passedCredits = 0;
        if (course1.isPassed())
            passedCredits += course1.getCredit();
        if (course2.isPassed())
            passedCredits += course2.getCredit();
        if (course3.isPassed())
            passedCredits += course3.getCredit();
        return passedCredits;
    }
    
    /**
     * To check if the email is a valid email or not
     * @return the result of it being valid or not
     */
    public boolean isEmailValid() {
        if (!email.contains("@"))
            return false;
        return (email.length() <= 320 && email.indexOf("@") < email.indexOf(".") - 1);
        /*
        In the return it is possible to return as true without the @ in it so that
        is why I added the if statement. The second one you need to have a . for it
        to return true as well as needing the length of the email to be 320 or less.
        */
    }
    
    /**
     * checks to see if student matches the data member
     * @param student checks the data members of this class
     * @return 
     */
    public boolean equals(Student student) {
        return this.name.equals(student.name) &&
                this.gender.equals(student.gender) &&
                this.email.equals(student.email) &&
                this.course1.equals(student.course1) &&
                this.course2.equals(student.course2) &&
                this.course3.equals(student.course3);
    }

    /**
     * converts data members to a string
     * @return the string
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-20s: %s\n", "Name", name);
        str += String.format("%-20s: %s\n", "Gender", gender);
        if (isEmailValid())
            str += String.format("%-20s: %s\n\n", "Email", email);
        str += String.format("%-22s%-22s%-10s%-20s\n", "Course", "Name", "Credit", "Score");
        str += String.format("------------------------------------------------------------\n");
        str += String.format("%-20s: %-22s%-10s%.1f\n", "Course 1", course1.getCourseName(), 
                calcPassedCourseNum(), course1.calcFinalScore());
        str += String.format("%-20s: %-22s%-10s%.1f\n", "Course 2", course2.getCourseName(), 
                calcPassedCourseNum(), course2.calcFinalScore());
        str += String.format("%-20s: %-22s%-10s%.1f\n\n", "Course 3", course3.getCourseName(), 
                calcPassedCourseNum(), course3.calcFinalScore());
        str += String.format("%-15s: %s\n", "Passed Courses", calcPassedCourseNum());
        str += String.format("%-15s: %s", "Total Credits", calcTotalCredit());
                
        return str;
    }
    
    /**
     * gets the data member name
     * @return the data member
     */
    public String getName() {
        return name;
    }
    
    /**
     * sets the object name
     * @param name the object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the data member gender
     * @return the data member
     */
    public String getGender() {
        return gender;
    }

    /**
     * sets the object gender
     * @param gender the object
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * gets the data member email
     * @return the data member
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * sets the object email
     * @param email the object
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * gets the data member Course1
     * @return the data member
     */
    public Course getCourse1() {
        return course1;
    }

    /**
     * sets the object Course1
     * @param course1 the object
     */
    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    /**
     * gets the data member Course2
     * @return the data member
     */
    public Course getCourse2() {
        return course2;
    }

    /**
     * sets the object Course2
     * @param course2 the object
     */
    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    /**
     * gets the data member Course3
     * @return the data member
     */
    public Course getCourse3() {
        return course3;
    }

    /**
     * sets the object Course3
     * @param course3 the object
     */
    public void setCourse3(Course course3) {
        this.course3 = course3;
    }
}
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
public class Course {
    private String courseName;
    private double credit;
    private double examScore;
    private double assignmentScore;

    /**
     * Default constructor
     */
    public Course() {
        this.courseName = null;
        this.credit = 0;
        this.examScore = 0;
        this.assignmentScore = 0;
    }

    /**
     * Constructor for some of the data member
     * @param courseName the data member for the Course name
     * @param credit the data member for the credit
     */
    public Course(String courseName, double credit) {
        this.courseName = courseName;
        this.credit = credit;
    }

    /**
     * Constructor for all 4 data members
     * @param courseName the data member for the Course Name
     * @param credit the data member for the credit
     * @param examScore the data member for the Exam Score
     * @param assignmentScore the data member for the Assignment Score
     */
    public Course(String courseName, double credit, double examScore, double assignmentScore) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = examScore;
        this.assignmentScore = assignmentScore;
    }
    
    /**
     * Copy constructor
     * @param course the copy constructor for all 4 data members
     */
    public Course (Course course) {
        this.courseName = course.courseName;
        this.credit = course.credit;
        this.examScore = course.examScore;
        this.assignmentScore = course.assignmentScore;
    }
    
    /**
     * Calculates your final score
     * @return the score
     */
    public double calcFinalScore() {
        double examWorth = 0.6;
        double assignmentWorth = 0.4;
        return (examScore * examWorth) + (assignmentScore * assignmentWorth);
    }
    
    /**
     * To see if you passed the course
     * @return passed or not
     */
    public boolean isPassed() {
        return calcFinalScore() >= 60;
    }
    
    /**
     * checks to see if course matches its data members
     * @param course checks the data members of this class
     * @return 
     */
    public boolean equals(Course course) {
        return this.courseName.equals(course.courseName) &&
                this.credit == course.credit &&
                this.examScore == course.examScore &&
                this.assignmentScore == course.assignmentScore;
    }

    /**
     * Converts data members to a string
     * @return the string
     */
    @Override
    public String toString() {
        String str = "";
         
        str += String.format("%-20s: %s\n", "Course Name", courseName);
        str += String.format("%-20s: %.1f\n", "Credit", credit);
        str += String.format("%-20s: %.1f\n", "Exam Score", examScore);
        str += String.format("%-20s: %.1f\n", "Assignment Score", assignmentScore);
        str += String.format("%-20s: %.1f\n", "Final Score", calcFinalScore());
        
        return str;
    }
    
    /**
     * gets the data member to courseName
     * @return the data member
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * sets the object courseName
     * @param courseName the object
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    /**
     * gets the data member to credit
     * @return the data member
     */
    public double getCredit() {
        return credit;
    }
    
    /**
     * sets the object to credit
     * @param credit the object
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }
    
    /**
     * gets the data member examScore
     * @return the data member
     */
    public double getExamScore() {
        return examScore;
    }
    
    /**
     * sets the object to examScore
     * @param examScore the object
     */
    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }
    
    /**
     * gets the data member assignmentScore
     * @return the data member
     */
    public double getAssignmentScore() {
        return assignmentScore;
    }
    
    /**
     * sets the object to assignmentScore
     * @param assignmentScore the object 
     */
    public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
    }
}

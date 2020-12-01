/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Atoz
 */
public class Test {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Course course = new Course("Programming I", 3, 95, 87);
        Student stu1 = new Student("Yi Wang", "Male", "ywang@vaniercollege.qc.ca", 
            course.getCourseName(), course.getCourseName(), course.getCourseName());
          
        System.out.println(course);
        System.out.println("");
        System.out.println("");
        System.out.println(stu1);
        
        //course1.setCourseName(new Course("Programming I"));
    }
}

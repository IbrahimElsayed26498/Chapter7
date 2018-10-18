/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebooktest;

/**
 *
 * @author ibrahim
 */
public class GradeBook {
    private String courseName;
    private int[]  grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    //it performs various operation on the data
    public void processGrade(){
        //printing grades
        outputGrade();
        //printing avarege
        System.out.printf("%nClass average is %.2f%n",getAverage());
        //printing min and max
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",getMinimum(),getMaximum());
        //printing Bar Char (1 => *, 5 => *****, ........)
        outputBarChart();
    }
    
    public int getMinimum(){
        int lowGrade = grades[0];
        for(int grade : grades){
            if(grade < lowGrade)
                lowGrade = grade;
        }    
        return lowGrade;
    }
    
    public int getMaximum(){
        int highGrade = grades[0];
        for(int grade : grades ){
            if(grade > highGrade)
                highGrade = grade ; 
        }
        
        return highGrade;
    }

    private double getAverage() {
        int total = 0;
        for (int grade : grades)
            total += grade;
        return (double) total/grades.length;
    }
    
    private void outputBarChart() {
        System.out.println("Grade distribution:");
        
        int [] frequency = new int [11];
        
        for(int grade : grades)
            ++frequency[grade/10];
        
        for (int counter = 0; counter<=grades.length; counter++){
            
            if(counter==10)
                System.out.printf("%5d: ",100);
            else
                System.out.printf("%02d-%02d: ",counter*10,counter*10+9);
            for(int stars=0; stars<frequency[counter]; stars++)
                System.out.print("*");
            System.out.println();
            
        }
        
    }
    
    
    private void outputGrade() {
        System.out.printf("The grades are:%n%n");
        
        for(int student=0; student<grades.length; student++){
            System.out.printf("Student %2d: %3d%n",student+1,grades[student]);
        }
    }
    
}

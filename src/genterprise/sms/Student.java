package genterprise.sms;

/**
*Created by Sarthak Gupta on 7/17/2020
* This class is responsible for keeping track of students
* (Fees paid, Name, Grade, Student ID,
 */

public class Student {
//    ---------- DECLARING FIELDS IN STUDENT CLASSS -------------- These are all considered to be fields
        private int id;
        private String name;
        private int grade;
        private int feesPaid;
        private int feesTotal;
//        -------------------------------------------


    /**
     * To create a new student by initializing.
     * Fees for every student will be $30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name student name
     * @param grade student grade
     */
    //created new student object
    public Student(int id, String name, int grade) {
        //always try to initialize all fields from the class

        feesTotal = 30_000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //We will not alter the student's name, or student id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

// School will receive funds, add fees to "feesPaid"

    public void payFees(int fees) {  //updateFeesTotal?
       feesPaid += fees; //feesPaid = feesPaid + fees
        School.updateTotalMoneyEarned(feesPaid);

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int getFeesPaid() {
        return feesPaid;
    }
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid; //return the remaining fees
    }














}

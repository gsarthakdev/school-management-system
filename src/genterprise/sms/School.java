package genterprise.sms;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    public String schoolName;


    public School(String schoolName, List<Teacher> teachers, List<Student> students) {
        this.schoolName = schoolName;
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0; //as school opens they will have $0 until kids pay fees
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *
     * @param moneySpent money that is given as salary to the teachers.
     *
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        moneySpent += totalMoneySpent;
        totalMoneyEarned -= moneySpent;
    }
}

package genterprise.sms;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher verble = new Teacher(3, "Verble", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(verble);


        Student kate = new Student(1, "Kate", 5);
        Student tim = new Student(2, "Tim", 6);
        Student jacob = new Student(3,"Jacob", 8);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(kate);
        studentsList.add(tim);
        studentsList.add(jacob);


        School chms = new School("CHMS",teacherList,studentsList);

        kate.payFees(5000);
        jacob.payFees(6000);
        System.out.println("CHMS has earned: $" + chms.getTotalMoneyEarned());

        System.out.println("-------- MAKING CHMS PAY SALARY -----------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("CHMS has paid: $" + lizzy.getSalary() + " to " + lizzy.getName()
         + " and now the school has " + chms.getTotalMoneyEarned() );


    }


}

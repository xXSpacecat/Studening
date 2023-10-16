import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner skelletor = new Scanner(System.in);

    public static void main(String[] args) {


        City home1 = new City("Gotham", "South USA");
        City home2 = new City("Metropolis", "Central USA");
        City home3 = new City("Star City", "North USA");
        City home4 = new City("Central City", "Northwest USA");

        ArrayList<Student> classG = new ArrayList<>();
        classG.add(new Student(34, "Damien", home1));
        classG.add(new Student(2, "Richard", home1));
        classG.add(new Student(32, "Tim", home1));
        classG.add(new Student(47, "John", home2));
        classG.add(new Student(12, "Conner", home2));
        classG.add(new Student(16, "Jason", home1));
        classG.add(new Student(23, "Biz", home2));
        classG.add(new Student(5, "Roy", home3));
        classG.add(new Student(3, "Wally", home4));
        classG.add(new Student(43, "Bart", home4));

        classG.get(0).setBuddy(classG.get(3));
        classG.get(0).setBuddy(classG.get(9));
        classG.get(1).setBuddy(classG.get(8));
        classG.get(2).setBuddy(classG.get(4));
        classG.get(3).setBuddy(classG.get(0));
        classG.get(4).setBuddy(classG.get(2));
        classG.get(5).setBuddy(classG.get(6));
        classG.get(5).setBuddy(classG.get(7));
        classG.get(6).setBuddy(classG.get(5));
        classG.get(7).setBuddy(classG.get(5));
        classG.get(8).setBuddy(classG.get(1));
        classG.get(9).setBuddy(classG.get(0));

        for (int i = 0; i < classG.size(); i++) {
            System.out.println(classG.get(i).getName() + "s buddy is ");
            classG.get(i).reportBuddyName();
        }


        while (true) {
            for (int i = 0; i < classG.size(); i++) {
                System.out.println(classG.get(i).getName() + " : " + i);

            }
            System.out.println("access?(#)");
            int num = skelletor.nextInt();

        }

    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner skelletor = new Scanner(System.in);
    public static ArrayList<Student> classG = new ArrayList<>();
    public static ArrayList<City> cities = new ArrayList<>();

    public static void main(String[] args) {


        cities.add(new City("Gotham", "South USA"));
        cities.add(new City("Metropolis", "Central USA"));
        cities.add(new City("Star City", "North USA"));
        cities.add(new City("Central City", "Northwest USA"));


        classG.add(new Student(34, "Damien", cities.get(0)));
        classG.add(new Student(2, "Richard", cities.get(0)));
        classG.add(new Student(32, "Tim", cities.get(0)));
        classG.add(new Student(47, "John", cities.get(1)));
        classG.add(new Student(12, "Conner", cities.get(1)));
        classG.add(new Student(16, "Jason", cities.get(0)));
        classG.add(new Student(23, "Biz", cities.get(1)));
        classG.add(new Student(5, "Roy", cities.get(2)));
        classG.add(new Student(3, "Wally", cities.get(3)));
        classG.add(new Student(43, "Bart", cities.get(3)));

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

        Student.sortByHome();


        while (true) {
            for (int i = 0; i < classG.size(); i++) {
                System.out.println(classG.get(i).getName() + " : " + i);

            }
            System.out.println("access?(#)");
            int num = skelletor.nextInt();
            classG.get(num).setAttributes();
            classG.get(num).reportBuddyName();
            for (int i = 0; i < classG.size(); i++) {
                System.out.println(classG.get(i).getName() + "s buddy is ");
                classG.get(i).reportBuddyName();
            }
        }


    }
}
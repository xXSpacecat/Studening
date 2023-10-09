public class Main {
    public static void main(String[] args) {
        City home1 = new City("Gotham", "USA");
        City home2 = new City("Metropolis", "USA");
        City home3 = new City("Star City", "USA");
        City home4 = new City("Central City", "USA");


        Student stud1 = new Student(34, "Damien", home1);
        Student stud3 = new Student(2, "Richard", home1);
        Student stud4 = new Student(16, "Jason", home1);
        Student stud5 = new Student(32, "Tim", home1);
        Student stud2 = new Student(47, "John", home2);
        Student stud6 = new Student(12, "Connor", home2);
        Student stud7 = new Student(23, "Biz", home2);
        Student stud8 = new Student(5, "Roy", home3);
        Student stud9 = new Student(3, "Wally", home4);
        Student stud10 = new Student(43, "Bart", home4);

        stud1.setBuddy(stud2);
        System.out.println(stud1.getName() + "s buddy is ");
        stud1.reportBuddyName();
        System.out.println("Hello world!");
    }
}
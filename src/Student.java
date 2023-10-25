import java.util.ArrayList;

public class Student {
    private ArrayList<Student> buddy = new ArrayList<>();
    private String name;
    private int studentID;
    private City hometown;
    private int grades;

    public void reportBuddyName() {
        for (Student student : buddy) {
            System.out.println(student.name);
        }
    }

    Student(int studentID, String name, City hometown) {
        this.studentID = studentID;
        this.name = name;
        this.hometown = hometown;

    }

    public Student getBuddy() {
        for (int i = 0; i < this.buddy.size(); i++) {
            return this.buddy.get(i);
        }
        return this.buddy.get(0);
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public City getHometown() {
        return hometown;
    }

    public void setHometown(City hometown) {
        this.hometown = hometown;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setBuddy(Student buddy) {
        this.buddy.add(buddy);
    }

    public void setAttributes() {
        System.out.println("change? buddy:1, hometown:2, grades:3");
        int change = Main.skelletor.nextInt();
        switch (change) {
            case 1:
                System.out.println("add (1) or remove (2)? #");
                int svar = Main.skelletor.nextInt();
                if (svar == 1) {
                    System.out.println("Name of new buddy?");
                    String newName = Main.skelletor.next();
                    for (Student stud : Main.classG) {
                        if (newName.equalsIgnoreCase(stud.name)) {
                            buddy.add(stud);
                            for (Student myStud : Main.classG) {
                                if (this.name.equalsIgnoreCase(myStud.name)) {
                                    stud.buddy.add(myStud);
                                }
                            }
                        }

                    }

                } else {

                }
                getBuddy();
            case 2:
                System.out.println();

            case 3:
                System.out.println();


        }
    }


    public void changeBud() {
        System.out.println("clear? add? 1:2");
        int v = Main.skelletor.nextInt();
        if (v == 1) {

        }
    }
}
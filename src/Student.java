import java.util.ArrayList;

public class Student {
    private ArrayList<Student> buddy = new ArrayList<>();
    private String name;
    private int studentID;
    private City hometown;
    private int grades;

    public void reportBuddyName() {
        for (int i = 0; i < buddy.size(); i++)
            System.out.println(buddy.get(i).name);

    }

    Student(int studentID, String name, City hometown) {
        this.studentID = studentID;
        this.name = name;
        this.hometown = hometown;

    }

    public Student getBuddy() {
        for (int i = 0; i < buddy.size(); i++) {
            return buddy.get(i);
        }
        return buddy.get(0);
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
                System.out.println();

        }
    }

}
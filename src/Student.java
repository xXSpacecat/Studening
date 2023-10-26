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
    

    public void setBuddy(Student buddy) {
        this.buddy.add(buddy);
    }

    public void setAttributes() {
        System.out.println("change? buddy:1, hometown:2, gradeAVG:3");
        int change = Main.skelletor.nextInt();
        Main.skelletor.nextLine();
        switch (change) {
            case 1:
                changeBuddy();
            case 2:
                changeHometown();

            case 3:
                System.out.println();


        }
    }


    public void changeBuddy() {
        System.out.println("add (1) or remove all(2)? #");
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
            for (int i = 0; i < this.buddy.size(); i++) {
                this.buddy.get(i).buddy.remove(this);

            }
            for (int i = 0; i < this.buddy.size(); i++) {
                this.buddy.clear();
            }

        }
    }

    public void changeHometown() {
        System.out.println("Name of new Hometown?");
        String newHome = Main.skelletor.nextLine();
        System.out.println(newHome);
        for (int i = 0; i < Main.cities.size(); i++) {
            if (newHome.equalsIgnoreCase(Main.cities.get(i).getName())) {
                this.hometown = Main.cities.get(i);

            }
        }
        sortByHome();
    }

    public void changeGrade() {
        System.out.println("Whats the new grade?");
        grades = Main.skelletor.nextInt();
    }

    public static void sortByHome() {
        System.out.println("gothamites:");
        for (int i = 0; i < Main.classG.size(); i++) {
            if (Main.classG.get(i).hometown.getName().equalsIgnoreCase("gotham")) {
                System.out.println(Main.classG.get(i).name);
            }
        }

        System.out.println("Metros:");
        for (int i = 0; i < Main.classG.size(); i++) {
            if (Main.classG.get(i).hometown.getName().equalsIgnoreCase("metropolis")) {
                System.out.println(Main.classG.get(i).name);
            }

        }

        System.out.println("Starries:");
        for (int i = 0; i < Main.classG.size(); i++) {
            if (Main.classG.get(i).hometown.getName().equalsIgnoreCase("star city")) {
                System.out.println(Main.classG.get(i).name);
            }

        }

        System.out.println("Cents:");
        for (int i = 0; i < Main.classG.size(); i++) {
            if (Main.classG.get(i).hometown.getName().equalsIgnoreCase("central city")) {
                System.out.println(Main.classG.get(i).name);
            }

        }
    }

}
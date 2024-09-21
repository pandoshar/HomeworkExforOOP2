
public class main {
    public static void main(String[] args) {
        Student Adilet = new Student();
        Adilet.displayInfo();

        Adilet.setName("Adilet");
        Adilet.setStudentID(230141034);
        Adilet.setMajor("IT");
        Adilet.displayInfo();
        Adilet.setGPA(3.0);
        Adilet.displayInfo();
        System.out.println();
        System.out.println();
        Student Malika = new Student();
        Malika.displayInfo();

        Malika.setName("Malika");
        Malika.setStudentID(230061226);
        Malika.setMajor("Managment");
        Malika.displayInfo();
        Malika.setGPA(4.0);
        Malika.displayInfo();
        System.out.println();
        System.out.println();
        Student Aidai = new Student();
        Aidai.displayInfo();

        Aidai.setName("Aidai");
        Aidai.setStudentID(230061226);
        Aidai.setMajor("Managment");
        Aidai.displayInfo();
        Aidai.setGPA(2.6);
        Aidai.displayInfo();
    }
}
class Student{

    private String name = "";
    private int studentID = 0;
    private String major = "";
    private double GPA = 0.0;
    public Student(){
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("StudentID: " + studentID);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
    }
    void setName(String name){
        this.name = name;
    }
    void setStudentID(int studentID){
        this.studentID = studentID;
    }
    void setMajor(String major){
        this.major = major;
    }
    void setGPA(double GPA){
        this.GPA = GPA;
    }
}

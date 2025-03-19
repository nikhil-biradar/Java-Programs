package oops.encapsulation;

public class StudentDetails {

    private String stdName;
    private int stdRollNo;
    private int stdId;

    public String getStdName() {
        return stdName;
    }

    public int getStdRollNo() {
        return stdRollNo;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdName(String name) {
        this.stdName = name;
    }

    public void setStdRollNo(int rollNo) {
        this.stdRollNo = rollNo;
    }

    public void setStdId(int id) {
        this.stdId = id;
    }

    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        s.stdName = "Nikhil";
        s.stdRollNo = 178021;
        s.stdId = 22020080;

        System.out.println("Student's Name : " + s.getStdName());
        System.out.println("Student's Roll No : " + s.getStdRollNo());
        System.out.println("Student's Id : " + s.getStdId());
    }
}
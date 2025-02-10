package arrays;

public class EmployeeDetails {
    String name;
    int rollNo;

    public EmployeeDetails(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        EmployeeDetails e [] = new EmployeeDetails[]{
                new EmployeeDetails("Nikhil", 23),
                new EmployeeDetails("Nitin", 25),
                new EmployeeDetails("Sonali", 27)
        };

        for(int i = 0; i < e.length; i++){
            System.out.println("Name : " + e[i].name + " rollNo : " + e[i].rollNo);
        }
    }
}

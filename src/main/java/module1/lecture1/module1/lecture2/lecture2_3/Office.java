package module1.lecture1.module1.lecture2.lecture2_3;

public class Office extends Employee {
    public String department;
    public int office;

    public Office(String name, String surname, int age, String education, String jobTitle, String department, int office) {
        super(name, surname, age, education, jobTitle);
        this.department = department;
        this.office = office;
    }

    public void workAsANAccountant() {
        System.out.println(surname + " " + name + " может работать бухгалтером");
    }

    public void workASATeamLeader() {
        System.out.println(surname + " " + name + " может работать руководителем отдела");
    }
}

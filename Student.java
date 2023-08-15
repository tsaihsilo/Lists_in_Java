public class Student extends Person{

    private Integer year;

    public Student(String newName, String address, String phone, Integer year){
        super(newName, address, phone);
        this.year = year;
    }
    public void setGraduationYear(Integer year){
        this.year = year;
    }
    public int getGraduationYear(){
        return this.year;
    }
    public String toString(){
        return super.toString() + ", Graduation year: " + getGraduationYear();
    }
}  
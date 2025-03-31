// ENCAPSULATION QN
class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) { 
        if (grade >= 0 && grade <= 100) {  
            this.grade = grade;
        } else {
            this.grade = 0;
        }  
    } 

    // adding main() so were able to execute the private attributes in the class
    public static void main(String[] args) {
        Student student1 = new Student("gitau", 100);
        Student student2 = new Student("Orpah", 101);

        System.out.println("Student 1: " + student1.getName() + ", Grade: " + student1.getGrade());
        System.out.println("Student 2: " + student2.getName() + ", Grade: " + student2.getGrade());
    }
} 

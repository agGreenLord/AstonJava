

public class Student {
    private String name;
    private int course;
    private String clas; 
    private int assessment;

    public Student(String name, int course, String clas, int assessment) {
        this.name = name;
        this.course = course;
        this.clas = clas;
        this.assessment = assessment;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getClas() {
        return clas;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setClass() {
        clas += 1;
    }

}

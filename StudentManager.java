import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<String> getStudent() {
        List<String> newlist = new ArrayList<>();
        for (Student student : this.students) {
            newlist.add(student.getName());
        }
        return newlist;
    }


    public List<String> getStudentOfAssessment(int count) {
        List<String> newstudents = new ArrayList<>();
        for (Student student : this.students) {
            if (student.getAssessment() == count) {
                newstudents.add(student.getName());
            }
        }
        return newstudents;
    }

    public void removeStudent() {
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).getAssessment() < 3) {
                students.remove(i);
            }
        }
     }

     public void nextClass() {
        for (Student student : this.students) {
            if (student.getAssessment() >= 3) {
                student.setClass();
            }
        }
     }

     public void printStudent(int course) {
        List<String> studentOfCourse = new ArrayList<>();
        for (Student student : this.students) {
            if (student.getCourse() == course) {
                studentOfCourse.add(student.getName());
            }
        } 
        System.out.println(studentOfCourse);
     }

}

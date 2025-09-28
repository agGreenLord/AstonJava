

public class Lesson_5 {
    
    public static void main(String[] args) {
        StudentManager students = new StudentManager();
        Student pavel = new Student("Pavel", 1, "A12", 4);
        Student andrey = new Student("Andrey", 1, "A12", 3);
        Student kate = new Student("Kate", 3, "B13", 3);
        Student mary = new Student("Mary", 3, "A12", 2);
        Student jon = new Student("jon", 3, "B13", 3);
        Student maikle = new Student("Maikle", 2, "A12", 4);
        Student ivan = new Student("Ivan", 2, "B13", 2);

        students.addStudent(pavel);
        students.addStudent(andrey);
        students.addStudent(kate);
        students.addStudent(mary);
        students.addStudent(jon);
        students.addStudent(maikle);
        students.addStudent(ivan);

        System.out.println(students.getStudentOfAssessment(3));
        students.removeStudent();
        System.out.println(students.getStudent());
        students.printStudent( 3);


        PhoneDirectory phone_dict = new PhoneDirectory();
        phone_dict.add("88005553535", "Kira");
        phone_dict.add("88005553242", "Anrey");
        phone_dict.add("88005554545", "Kira");
        phone_dict.add("88005557454", "Ivan");
        phone_dict.add("88005553986", "Mary");
        phone_dict.add("88005559765", "Mary");

        phone_dict.get("Mary");


        
    }
}
 
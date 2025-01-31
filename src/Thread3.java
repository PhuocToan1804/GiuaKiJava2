package GiuaKi2Java;



import java.util.List;

public class Thread3 implements Runnable {
    List<Student> students;

    public Thread3(List<Student> students) {
        this.students = students;
    }

    public void run() {
        for (Student student : students) {
            student.setDigit(true);
            for (int i = 2; i <= Math.sqrt(student.sum); i++) {
                if (student.sum % i == 0) {
                    student.setDigit(false);
                    break;
                }
            }
        }
    }

}


import db.DBCourse;
import db.DBHelper;
import models.Course;
import models.Level;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course philosophy = new Course("philosophy", Level.BA);
        DBHelper.save(philosophy);

        Course english = new Course("english", Level.MA);
        DBHelper.save(english);

        Course archaeology = new Course("archaeology", Level.MLITT);
        DBHelper.save(archaeology);

        Course chemistry = new Course("chemistry", Level.MPHIL);
        DBHelper.save(chemistry);

        Student student1 = new Student("Jeff", "Winger", 33, 101, philosophy);
        DBHelper.save(student1);

        Student student2 = new Student("Annie", "Edison", 18, 102, philosophy);
        DBHelper.save(student2);

        Student student3 = new Student("Britta", "Perry", 24, 103, english);
        DBHelper.save(student3);

        Student student4 = new Student("Troy", "Barnes", 18, 104, archaeology);
        DBHelper.save(student4);

        List<Student> students = DBCourse.findAllStudents(philosophy);

    }
}

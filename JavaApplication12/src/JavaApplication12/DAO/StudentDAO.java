
package JavaApplication12.DAO;

import JavaApplication12.model.Student;
import java.util.List;

public interface StudentDAO {
    public void addStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(int sid);
    
    public Student getStudentById(int sid);
    public List<Student> getAllStudent();
    
}

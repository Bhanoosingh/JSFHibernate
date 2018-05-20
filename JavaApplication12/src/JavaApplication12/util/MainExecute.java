
package JavaApplication12.util;

import JavaApplication12.DAO.StudentDAO;
import JavaApplication12.DAO.impl.StudentDAOImpl;
import JavaApplication12.model.Student;

public class MainExecute {
    public static void main(String arg[]){
        Student stud=new Student();
         StudentDAOImpl studentDAO=new StudentDAOImpl();
        
//        stud.setName("Bhanoo");
//        stud.setAddress("Saprumarg lko");
//        
//      
//        for(int i=1;i<5;i++)
//        studentDAO.addStudent(stud);

stud=studentDAO.getStudentById(4);
//stud.setName("Alok");
//stud.setAddress("Lucknow");
//
//studentDAO.updateStudent(stud);

//studentDAO.deleteStudent(5);

for(Student stud1:studentDAO.getAllStudent()){
    System.out.println(stud1.getSid()+"\t"+stud1.getAddress()+"\t"+stud1.getStudentName()+"\t"+stud1.getDOB());
}

    }
    
}

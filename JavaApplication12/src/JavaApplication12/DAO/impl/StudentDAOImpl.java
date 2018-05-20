
package JavaApplication12.DAO.impl;

import JavaApplication12.DAO.StudentDAO;
import JavaApplication12.model.Student;
import JavaApplication12.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDAOImpl implements StudentDAO{

    SessionFactory sf=HibernateUtil.getSessionFactory();
    
    @Override
    public void addStudent(Student student) {
        Session session=sf.openSession();
        session.beginTransaction();
         //session.persist(student);
         session.save(student);
       // session.saveOrUpdate(student);
        session.getTransaction().commit();
        session.close();
       
    }

    @Override
    public void updateStudent(Student student) {
        Session session=sf.openSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteStudent(int sid) {
        Session session=sf.openSession();
        session.beginTransaction();
        session.delete(getStudentById(sid));
        session.getTransaction().commit();
        session.close();
        
    }

    @Override
    public Student getStudentById(int sid) {
         Session session=sf.openSession();
        session.beginTransaction();
       Student stud=(Student) session.get(Student.class,sid);
        session.getTransaction().commit();
        session.close();
        return stud;
    }

    @Override
    public List<Student> getAllStudent() {
        Session session=sf.openSession();
        session.beginTransaction();
       List<Student> listStudent=session.createQuery("From Student").list();
        session.getTransaction().commit();
        session.close();
        return listStudent;
    }
    
}

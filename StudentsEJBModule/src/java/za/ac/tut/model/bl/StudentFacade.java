/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entity.Student;

/**
 *
 * @author SIBUSISO
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "StudentsEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public Long getStudentsCount() {
        String queryStr = "SELECT COUNT(s) FROM Student s";
        Query query = em.createQuery(queryStr);
        Long cnt = (Long) query.getSingleResult();
        
        return cnt;
    }

    @Override
    public Long getTotalPassed() {
        String qryStr = "SELECT COUNT(s) FROM Student s WHERE s.markObtained > 49";
        Query qry = em.createQuery(qryStr);
        Long cnt = (Long) qry.getSingleResult();
        //return cnt;
        return cnt;
    }

    @Override
    public Long getTotalFailed() {
        String qryStr = "SELECT COUNT(s) FROM Student s WHERE s.markObtained < 50";
        Query qry = em.createQuery(qryStr);
        Long cnt = (Long) qry.getSingleResult();
        return cnt;
    }
    

    @Override
    public Double getAverageMark() {
        String qryStr = "SELECT AVG(s.markObtained) FROM Student s";
        Query qry = em.createQuery(qryStr);
        Double avgMark = (Double) qry.getSingleResult();
        return avgMark;
        
    }

    @Override
    public Integer getMinimumMark() {
        String qryStr = "SELECT MIN(s.markObtained) FROM Student s";
        Query qry = em.createQuery(qryStr);
        Integer minMark = (Integer) qry.getSingleResult();
        return minMark;
    }

    @Override
    public Integer getMaximumMArk() {
        String qryStr = "Select MAX(s.markObtained) FROM Student s";
        Query qry = em.createQuery(qryStr);
        Integer maxMArk = (Integer) qry.getSingleResult();
        return maxMArk;
    }

    @Override
    public List<Student> getAll() {
        String qryStr = "SELECT s FROM Student s";
        Query qry = em.createQuery(qryStr);
        List<Student> students = qry.getResultList();
        return students;
    }

    @Override
    public List<Student> getAllPerGender(Character gender) {
        String qryStr = "SELECT s FROM Student s WHERE s.gender = ?1";
        Query qry = em.createQuery(qryStr);
        qry.setParameter(1, gender);
        List<Student> students = qry.getResultList();
        return students;
    }

    @Override
    public List<Student> getStudentsWhoPassed() {
       String qryStr = "SELECT s FROM Student s WHERE s.markObtained > 49";
       Query qry = em.createQuery(qryStr);
       List<Student> stds = qry.getResultList();
       return stds;
    }

    @Override
    public List<Student> getStudentsWhoFailed() {
        String qryStr = "SELECT s FROM Student s WHERE s.markObtained < 50";
        Query qry = em.createQuery(qryStr);
        List<Student> stds = qry.getResultList();
        return stds;
    }

    @Override
    public List<Student> getStudentsOverMarkRange(Integer minMark,Integer maxMark) {
       String qryStr = "SELECT s FROM Student s WHERE s.markObtained >= ?1 AND s.markObtained <= ?2";
       Query qry = em.createQuery(qryStr);
       qry.setParameter(1, minMark);
       qry.setParameter(2, maxMark);
       List<Student> stds = qry.getResultList();
       return stds;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.entity.Student;

/**
 *
 * @author SIBUSISO
 */
@Local
public interface StudentFacadeLocal {

    void create(Student student);

    void edit(Student student);

    void remove(Student student);

    Student find(Object id);

    List<Student> findAll();

    List<Student> findRange(int[] range);

    int count();
    
    //customised
    Long getStudentsCount();
    
    Long getTotalPassed();
    
    Long getTotalFailed();
    
    Double getAverageMark();
    
    Integer getMinimumMark();
    
    Integer getMaximumMArk();
    
    List<Student> getAll();
    
    List<Student> getAllPerGender(Character gender);
    
    List<Student> getStudentsWhoPassed();
    
    List<Student> getStudentsWhoFailed();
    
    List<Student> getStudentsOverMarkRange(Integer minMark, Integer maxMArk);
    
}

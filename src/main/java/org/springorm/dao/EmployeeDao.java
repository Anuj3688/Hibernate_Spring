package org.springorm.dao;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springorm.entities.Employee;

public class EmployeeDao {
    private HibernateTemplate hibernateTemplate;

    public int insert(Employee employee){
        //Inserting using hibernateTemplate
        Integer i = (Integer) this.hibernateTemplate.save(employee);
        return i;
    }
}

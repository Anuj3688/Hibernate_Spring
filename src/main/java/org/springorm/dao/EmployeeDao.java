package org.springorm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springorm.entities.Employee;

import javax.transaction.Transactional;

public class EmployeeDao {
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int insert(Employee employee){
        //Inserting using hibernateTemplate
        Integer i = (Integer) this.hibernateTemplate.save(employee);
        return i;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

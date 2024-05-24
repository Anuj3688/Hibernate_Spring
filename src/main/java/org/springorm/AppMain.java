package org.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springorm.dao.EmployeeDao;
import org.springorm.entities.Employee;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Here everything will take place");

        ApplicationContext context  = new ClassPathXmlApplicationContext("java/org/springorm/config.xml");
        EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
        Employee E1 = new Employee(191,"Ramo","2324");
        dao.insert(E1);
    }
}

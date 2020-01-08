package com.deloitte.firstmvn.hibfirst;
import java.sql.Date;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.firstmvn.hibfirst.dao.EmployeeDAO;
import com.deloitte.firstmvn.hibfirst.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory factory= cfg.buildSessionFactory();
        EmployeeDAO edao = new EmployeeDAO(factory);
        /*Employee e1= new Employee();
        edao.insertEmployee(e1);
        e1 = edao.getEmployee(103);
        if(e1!=null)
        	System.out.println(e1.getEname()+"  "+e1.getSalary()+" "+e1.getDoj());*/
        edao.deleteEmployee(103);
        /*Employee e1= new Employee(103,"devi",1200,new Date(2020,12,1));
        edao.modifyEmployee(e1);
        if(e1!=null);
        System.out.println(e1.getEname()+""+e1.getSalary()+""+e1.getDoj());*/
        factory.close();
    }
}

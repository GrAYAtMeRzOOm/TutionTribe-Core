/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.gray.tutiontribe.controller;

import com.gray.tutiontribe.entity.Branch;
import com.gray.tutiontribe.entity.Institute;
import com.gray.tutiontribe.entity.User;
import com.gray.tutiontribe.entity.UserRole;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author grays
 *
 */
@Stateless
public class SampleRegister implements SampleRegisterRemote {

    @PersistenceContext(unitName = "TutionTribe-presitance-unit")
    private EntityManager em;

    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    @Override
    public void registerClient() {
        System.out.println("EM - "+em);
        UserRole userRole = new UserRole();
        userRole.setRoleName("Admin");
        em.persist(userRole);
        
        Institute institute = new Institute();
        institute.setName("HR-TT");
        em.persist(institute);
        
        Branch branch = new Branch();
        branch.setCity("Horana");
        branch.setInstitute(institute); 
        em.persist(branch);
        
        User user = new User();
        user.setName("Pasindu");
        user.setAge(22);
        LocalDate localDate = LocalDate.of(2000, 2, 23);
        user.setDob(Date.valueOf(localDate));
        user.setContact("0789052002");
        user.setUserRole(userRole);
        user.setAddress("Horana");
        user.setBranch(branch);
        
        em.persist(user);
    }
}

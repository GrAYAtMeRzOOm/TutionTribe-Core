/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.gray.tutiontribe.information;

import com.gray.tutiontribe.entity.UserRole;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author grays
 */
@Stateful
public class UserRoleManager implements UserRoleManagerRemote {

    @Override
    public List<UserRole> getUserRoles() throws RuntimeException {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

      
}

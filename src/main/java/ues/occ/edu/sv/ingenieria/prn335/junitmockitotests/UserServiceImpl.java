/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;

/**
 *
 * @author Mauricio
 */
public class UserServiceImpl implements UserService{
     @Override
    public String getFirstName(int userId) {
        String firstName = "";
        // some logic to get user's first name
        // this could be anything like a call to another service,
        // a database query, or a web service call
        return firstName;
    }

    @Override
    public String getLastName(int userId) {
        String lastName = "";
        // some logic to get user's last name
        // this could be anything like a call to another service,
        // a database query, or a web service call
        return lastName;
    }
}

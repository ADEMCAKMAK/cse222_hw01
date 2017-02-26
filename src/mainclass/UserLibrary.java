/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;
/**
 *
 * @author Asus
 */
public class UserLibrary extends UserAbstract{

    /**
     * Constructor
     * @param id
     * @param password
     * @param name
     * @param surname
     * @param status 
     */
    public UserLibrary(int id, int password, String name, String surname, boolean status) {
        super(id, password, name, surname, status);
    }

    @Override
    public String toString() {
        return "UserLibrary{" +super.toString()+ '}';
    }

    @Override
    public boolean logOut() {
        return super.logOut(); 
    }

    @Override
    public boolean logIn(int id, int password) {
        return super.logIn(id, password); 
    }
    
    
}

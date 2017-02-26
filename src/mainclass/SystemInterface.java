/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

//import java.util.ArrayList;
/**
 *
 * @author Asus-AdemCakmak
 */
public interface SystemInterface {

    /**
     * check the valid access
     * @param id
     * @param password
     * @return id and password is right return true otherwise false
     */
    public boolean logIn(int id, int password);
    /**
     * out of system
     * @return statu of out process
     */
    public boolean logOut();
}

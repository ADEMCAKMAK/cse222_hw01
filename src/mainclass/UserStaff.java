/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;
//import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class UserStaff extends UserAbstract {

    /**
     * Constructor
     * @param id
     * @param password
     * @param name
     * @param surname
     * @param status 
     */
    public UserStaff(int id, int password, String name, String surname, boolean status) {
        super(id, password, name, surname, status);
    }
    
    /**
     * staff can be add a book in bookList
     * @param bookList
     * @param item
     * @return process status
     */
    public boolean addBook(ArrayList<Book> bookList, Book item) throws NullPointerException
    {
        if(item==null)
            throw new NullPointerException("object is empty !!!");
        
        return bookList.add(item);
    }
    
    /**
     * staff can be remove a book in booklist
     * @param bookList
     * @param item
     * @return process status
     */
    public boolean removeBook(ArrayList<Book> bookList, Book item) throws NullPointerException, Error
    {
        if(item==null)
            throw new NullPointerException("object is empty !!!");
        if(bookList.size() <= 0 )
            throw new Error("invalid size cannot remove !!");
        
       if( bookList.size() >= 0 )
            for (int i = 0; i < bookList.size(); i++) {
                if( bookList.get(i).equals(item) ){
                    bookList.remove(i);
                    return true;
                }
                    
            }
        return false;
    }
    
    /**
     * staff can be add a user(student)
     * @param userList
     * @param item
     * @return 
     */
    public boolean addUser(ArrayList<UserLibrary> userList, UserLibrary item) throws NullPointerException
    {
        if(item==null)
            throw new NullPointerException("object is empty !!!");
        return userList.add(item);
    }
    
    /**
     * staff can be remove a user(student)
     * @param userList
     * @param item
     * @return 
     */
    public boolean removeUser(ArrayList<UserLibrary> userList, UserLibrary item) throws NullPointerException, Error
    {
        if(item==null)
            throw new NullPointerException("object is empty !!!");
        if(userList.size() <= 0 )
            throw new Error("invalid size cannot remove !!");
        if( userList.size() > 0 )
            for (int i = 0; i < userList.size(); i++) {
                if( userList.get(i).equals(item) ){
                    userList.remove(i);
                    return true;
                }
                    
            }
        return false;
    }
    
    @Override
    public String toString() {
        return "UserStaff{" +super.toString()+ '}';
    }

    @Override
    public boolean logIn(int id, int password) {
        return super.logIn(id, password);
    }

    @Override
    public boolean logOut() {
        return super.logOut(); 
    }


}

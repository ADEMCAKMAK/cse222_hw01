/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class UserAbstract extends Users implements SystemInterface {

    public UserAbstract() {
    }
    /**
     * Constructor 
     * @param id specific code for user
     * @param password enter number
     * @param name first name
     * @param surname last name
     * @param status info status
     */
    public UserAbstract(int id, int password, String name, String surname, boolean status) {
        super(id, password, name, surname, status);
    }
     

    @Override
    public boolean logIn(int id, int password) {
      
        
        if( this.getId() == id && this.getPassword() == password && this.isStatus() == false ){
            this.setStatus(true);
            return true;
        }
      
        return false;
    }

    @Override
    public boolean logOut() {
        
        if(this.isStatus() == true)
        {
             this.setStatus(false);
             return true;
        }
        
        return false;
    }  
    
    /**
     * borrow the book from the list
     * @param bookList list of book
     * @param item a book
     * @return result of borrow is success
     */
    public boolean borrowBook(ArrayList<Book> bookList, Book item) throws NullPointerException
    {
        if(item==null)
            throw new NullPointerException();
        
        for ( int i = 0; i < bookList.size(); i++ ) {
            
            if(  bookList.get(i).equals(item) && !bookList.get(i).isStatus() ){
                
                bookList.get(i).setStatus(true);
                
                return true;
            }
                
        }
        
        return false;
    }
    
    /**
     * return the borrowed book
     * @param bookList list of book
     * @param item a book
     * @return result of process status
     */
    public boolean returnBook(ArrayList<Book> bookList, Book item)
    {
                
        for ( int i = 0; i < bookList.size(); i++ ) {
            
            if(  bookList.get(i).equals(item) && bookList.get(i).isStatus() ){
                
                bookList.get(i).setStatus(false);
                
                return true;
            }
                
        }
        
        return false;
    }
}

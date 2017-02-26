/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.ArrayList;

/**
 *
 * @author Asus-AdemCakmak
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<UserStaff> staffList = new ArrayList<>();
        ArrayList<UserLibrary> userList = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();

        UserStaff staff1 = new UserStaff(2,2,"isa","mes", false);
        /**
         * Create a staff for adding books
         */
        System.out.println(staff1.toString());
        
        UserStaff staff2 = new UserStaff(3,3,"musa","sem", false);
         /**
         * Create another staff for adding users
         */
        System.out.println(staff2.toString());
        
        staffList.add(staff1);
        staffList.add(staff2);
        
        if( staff1.logIn(2,2) )
            System.out.println("success to log in staff1");
        else
            System.out.println("failed to log in");
        
        if( staff2.logIn(3,3) )
            System.out.println("success to log in staff2");
        else
            System.out.println("failed to log in");
        /**
         * creating book list and users for processing methods
         */
        
        
        
        if( staff1.addBook(bookList, new Book(1,"suc ve ceza", "tolstoy", false)) )
            System.out.println("success to add book\n" + bookList.get(0).toString());
        else
            System.out.println("fail to add book");
        
        if( staff1.addBook(bookList, new Book(2,"yaban", "Yakup Kadri Karaosmanoglu", false)) )
            System.out.println("success to add book\n" + bookList.get(1).toString());
        else
            System.out.println("fail to add book");
        
        if( staff1.addBook(bookList, new Book(3,"robinson crusoe", "Daniel Defoe", false)) )
            System.out.println("success to add book\n" + bookList.get(2).toString());
        else
            System.out.println("fail to add book");
        
        if( staff1.addBook(bookList, new Book(4,"donusum", "Franz Kafka", false)) )
            System.out.println("success to add book\n" + bookList.get(3).toString());
        else
            System.out.println("fail to add book");

        if( staff1.addBook(bookList, new Book(5,"olu ozanlar dernegı", "Robin Williams", false)) )
            System.out.println("success to add book\n" + bookList.get(4).toString());
        else
            System.out.println("fail to add book");

        /**
         * add books and view status
         */
        
        if ( staff2.addUser(userList, new UserLibrary(5,5,"adem","cakmak", false)) )
            System.out.println("success to add user\n" + userList.get(0).toString());
        else
            System.out.println("failed to add user\n");
        
        if ( staff2.addUser(userList, new UserLibrary(6,6,"alex","souza", false)) )
            System.out.println("success to add user\n" + userList.get(1).toString());
        else
            System.out.println("failed to add user\n");
        
        if ( staff2.addUser(userList, new UserLibrary(7,7,"sabri","sarioglu", false)) )
            System.out.println("success to add user\n" + userList.get(2).toString());
        else
            System.out.println("failed to add user\n");
        
        /**
         * add users and view status
         */
        
        if( userList.get(1).logIn(6,6) )
            System.out.println("success to log in user1");
        else
            System.out.println("failed to log in");
        
        /**
         *  removing a book from the list
         */
        System.out.println("booklist before removing a book\n");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
        
        if( staff1.removeBook(bookList, new Book(4,"donusum", "Franz Kafka", false)) )
            System.out.println("succes to remove the book");
        else
            System.out.println("failed to remove the book");
        
        
        System.out.println("booklist after removing a book\n");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
   
        
        /**
         * an user borrow and return
         */
        if( userList.get(1).borrowBook(bookList,new Book(5,"olu ozanlar dernegı", "Robin Williams", false)) ) 
            System.out.println("success to borrow book");
        else
            System.out.println("failed to borrow book");
            
        System.out.println("booklist after borrowing a book\n");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
    
        
        if( userList.get(1).returnBook(bookList,new Book(5,"olu ozanlar dernegı", "Robin Williams", true)) ) 
            System.out.println("success to return book");
        else
            System.out.println("failed to return book");
            
        System.out.println("booklist after returning a book\n");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
        
        if( staff1.logOut() )
            System.out.println("success to log out staff1");
        else
            System.out.println("failed to log out");
        
        if( staff2.logOut() )
            System.out.println("success to log out staff2");
        else
            System.out.println("failed to log out");
        
        if( userList.get(1).logOut() )
            System.out.println("success to log out user1");
        else
            System.out.println("failed to log out");
        
    }   

}

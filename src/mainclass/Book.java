/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.Objects;

/**
 *
 * @author Asus
 */
public class Book {
    /**
     * specific code for item
     */
    private int id;
    /**
     * called name
     */
    private String name;
    /**
     * who written item
     */
    private String author;
    /**
     * status info
     */
    private boolean status; 

    /**
     * Constructor
     * @param id specific code for item
     * @param name called name
     * @param author who written item
     * @param status status info
     */
    public Book(int id, String name, String author, boolean status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.status = status;
    }

    /**
     * view the book is borrowed or not
     * @return book status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * if the book is valid, borrow it and set status
     * @param status setting current status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.author);
        hash = 97 * hash + (this.status ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.author, other.author);
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author=" + author + ", status=" + status + '}';
    }
  
}

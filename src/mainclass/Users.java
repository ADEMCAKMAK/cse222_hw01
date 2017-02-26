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
public class Users {
    
    /**
     * specific code for item
     */
    private int id;
    /**
     * system access key
     */
    private int password;
    /**
     * first name
     */
    private String name;
    /**
     * last name
     */
    private String surname;
    
    /**
     * status info
     */
    private boolean status;

    /**
     * default constructor
     */
    public Users() {
        this.id = 1;
        this.password = 1;
        this.name = "adem";
        this.surname = "cakmak";
        this.status = true;
    }

    /**
     * Constructor
     * @param id
     * @param password
     * @param name
     * @param surname
     * @param status 
     */
    public Users(int id, int password, String name, String surname, boolean status) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.status = status;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        final Users other = (Users) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.password != other.password) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surname, other.surname);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + this.password;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.surname);
        hash = 29 * hash + (this.status ? 1 : 0);
        return hash;
    }

    
    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", password=" + password + ", name=" + name + ", surname=" + surname + ", status=" + status + '}';
    }
    
    
}

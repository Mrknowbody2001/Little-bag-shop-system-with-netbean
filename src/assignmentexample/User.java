/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignmentexample;

/**
 *
 * @author hnd
 */
public class User {
    //encapsulation by using get/set member function with private var
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    int uType;
    
   public String getFirstName() {
        return firstName;
    }
    
    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // Getter for lastName
    public String getLastName() {
        return lastName;
    }
    
    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // Getter for userName
    public String getUserName() {
        return userName;
    }
    
    // Setter for userName
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    // Getter for password
    public String getPassword() {
        return password;
    }
    
    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
    
    //get function
    public int GetUserType(){
        return uType;
    }
    //set function
    public void SetUserType(int userType){
        uType=userType;
    }
}

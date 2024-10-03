/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignmentexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.nio.file.FileSystems;



/**
 *
 * @author hnd
 */
public class UserAppLogics {
    public boolean GetValidUser(String userName,String password){
        List<User> users = DisplayUserList();
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return true; // Credentials are valid
            }
        }
        return false;
    }
    public boolean AddNewUser(User newUser){
        String userData=newUser.getFirstName()+","+
                        newUser.getLastName()+","+
                        newUser.getUserName() + "," +
                        newUser.getPassword();
        
        try {
        Writer output;
         output = new BufferedWriter(new FileWriter(
            "E:\\icbt assignment\\sem2\\sem 2.2\\oop\\AssignmentExample\\users.txt", true));
        output.append(userData);
        output.append("\n");
        output.close();
        return true; // Indicate success
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, e);
        return false; // Indicate failure
    }
}

    public List<User> DisplayUserList(){
        List<User> totalusersList=new ArrayList<User>();
        try{
            File userFile=new File("E:\\icbt assignment\\sem2\\sem 2.2\\oop\\AssignmentExample\\users.txt");
            Scanner myReader=new Scanner(userFile);
                while(myReader.hasNextLine()){
                    String userData=myReader.nextLine();
                    ArrayList<String> userList=new ArrayList<>(Arrays.asList(userData.split(",")));
                        User users=new User();
                        users.setFirstName(userList.get(0));
                        users.setLastName(userList.get(1));
                        users.setUserName(userList.get(2));
                        users.setPassword(userList.get(3));
                    totalusersList.add(users);
                }
                myReader.close();
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return totalusersList;
    }
    
}
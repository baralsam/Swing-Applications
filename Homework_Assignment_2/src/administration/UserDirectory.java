/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administration;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class UserDirectory {
    private ArrayList<User>userList;
    
    public UserDirectory(){
        this.userList = new ArrayList<User>();
        User user = new User();
        user.setEnabled(true);
        user.setNuid("");
        user.setUsername("admin");
        user.setPassword("admin");
        user.setRole("Admin");
        userList.add(user);
    }
    
    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User>userList) {
        this.userList = userList;
    }
   
   public User addUser(){
       User person = new User();
       userList.add(person);
       return person;
   } 
   
    
   public void deleteUser(User person){
       userList.remove(person);
   }
   
   public User searchUser(String nuid){
       for(User us: userList){
           if(us.getNuid().equals(nuid)){
               return us;
           }
       }
       return null;
   }
}

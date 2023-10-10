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
public class PersonDirectory {
    private ArrayList<User>personList;
    
    public PersonDirectory(){
        this.personList = new ArrayList<User>();
    }
    
    public ArrayList<User> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<User>personList) {
        this.personList = personList;
    }
   
   public User addPerson(){
       User person = new User();
       personList.add(person);
       return person;
   } 
    
   public void deletePerson(User person){
       personList.remove(person);
   }
   
   public User searchPerson(String nuid){
       for(User person: personList){
           if(person.getNuid().equals(nuid)){
               return person;
           }
       }
       return null;
   }
}

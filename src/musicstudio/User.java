/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicstudio;


/**
 *
 * @author aojegede
 */
public class User {
    boolean admin;
    int userId;
    String firstName;
    String lastName;
    int phone;
    String address;
    String email;
    String username;
    String password;
    
   public User(String name, String pword) {
        username = name;
        password = pword;
       
   }
    
    public void getUserType() {
        System.out.println("musicstudio.User.<init>()");
    }
    
    
    public String getUsername() {
        return username;
    }
   public String getPassword() {
        return password;
    }
    
}

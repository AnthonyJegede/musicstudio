/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicstudio;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aojegede
 */
interface Observable {
    public void onUpdate();
}

public class MusicApp implements Observable {
    
    private static MusicApp instance = null;
    private MusicApp() {
        User user = new User("admin", "admin123");
        users.add(user);
        
    }
    /*
    public static MusicApp getInstance() {
        if (instance == null) {
            instance = new MusicApp();
        }
        return instance;
    }
    */
    
    public void onUpdate() {
      /*  modelTable.setRowCount(0);
        
        for (int i = 0; i < todo.taskList.getTasksCount(); i++) {
            Task task = todo.taskList.getTask(i);
            
            modelTable.addRow(new Object[] { task.getCompleted(),  task.getName(), " - " });
        }
        //modelTable.addRow( new Object[]{ false, "..", "25/65/2024" } );
        */
    }
    
    //UsersList users;
   
    MusicList musicList = new MusicList();
    ArrayList<User> users = new ArrayList<User>();
    // Todo: add user list array    
    
    
   public boolean login(String userName, String password) {
        System.out.println(userName + " " + password);
         for (int i = 0; i<users.size(); i++) {
             if ( users.get(i).getUsername().equals(userName)) {
                  System.out.println("user");
                 if (users.get(i).getPassword().equals(password)) {
                     System.out.println("pass");
                     return true;
                 }
             }

         }
         return false;
           
        
       }
      
       
      
   
   
   public void logout() {
       
   }
    
}

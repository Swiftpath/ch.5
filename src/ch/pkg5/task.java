/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pkg5;

/**
 *
 * @author Dominic
 */
public class task implements priority {
    
    
    private int priority;
   String name;

   public task(String taskName)
   {
      name = taskName;
      priority = MED_PRIORITY;
   }
   
   String getName()
   {
      return name;
   }
   @Override
   public void setPriority(int value)
   {
      priority = value;
   }
   @Override
   public int getPriority()
   {
      return priority;
   }

}

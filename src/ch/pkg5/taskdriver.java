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
public class taskdriver {
   
    public static void main(String args[])
   {
      task task1 = new task("USE TASK 1");
      task1.setPriority(7);
      task task2 = new task("USE TASK 2, THIS TASK HAS THE LOWEST PRORETY");
      task2.setPriority(priority.MIN_PRIORITY);
      task task3 = new task("USE TASK 3, THIS TASK HAS THE HIGHEST PRIORETY");
      task3.setPriority(priority.MAX_PRIORITY);
      task task4 = new task("USE TASK 4");
      task4.setPriority(4);

      System.out.println(" TO/DO ");
      System.out.println(task1.getName() + " \tpriority: " + task1.getPriority());
      System.out.println(task2.getName() + " \tpriority: " + task2.getPriority());
      System.out.println(task3.getName() + " \tpriority: " + task3.getPriority());
      System.out.println(task4.getName() + " \tpriority: " + task4.getPriority());
   }

}

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
public interface priority {
   
   static final int MED_PRIORITY = 5;
   static final int MAX_PRIORITY = 10;
   static final int MIN_PRIORITY = 1;
   
public void setPriority(int value);

public int getPriority();

}
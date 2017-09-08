/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author mitchell
 */
public class WelcomeService {
   
    
   public String produceGreeting(String name, String greetingEnding){
       
      return getGreetingForCurrentHour()+ " " + name + greetingEnding; 
   }
    
    
   public String getGreetingForCurrentHour(){
       String greeting = "Hello";
       int hour = LocalDateTime.now().getHour();
       
       
       if(hour >= 4 & hour <= 10){
           greeting = "Good Morning";
       }else if(hour >= 11 & hour <= 14){
           greeting = "Good Afternoon";
       }else if(hour >= 15 & hour <= 21){
           greeting = "Good Evening";
       }else if(hour >= 22 || hour <= 3 ){
           greeting = "Good Night";
       }
  
  return greeting; }
    
}

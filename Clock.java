/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author FiercePC
 */
import java.time.*;
import java.time.format.DateTimeFormatter; 


public class Clock{

        private boolean on = false;
        private boolean isSet;
        private String setTo;
        private String strTime;
        private String strDate;
        private final DateTimeFormatter timeFormatter;
        private final DateTimeFormatter dateFormatter;

        public Clock(){
                isSet = false;
                setTo = "";
                timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                dateFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
                strTime = LocalTime.now().format(timeFormatter); 
                strDate = LocalDate.now().format(dateFormatter);
        }
        //GETTER METHODS
        public boolean getOn(){
            return this.on;
        }
        public boolean getIsSet(){
                return this.isSet;
        }
        public String getSetTo(){
                return this.setTo;
        }
        public String getStrTime(){
                return this.strTime;
        }
        public String getStrDate(){
            return this.strDate;
        }
        
        //SETTER METHODS
        public void setOn(boolean aValue){
            this.on = aValue;
        }
        public void setIsSet(boolean aValue){
                this.isSet = aValue;
        }
        public void setSetTo(String aTime){
                this.setTo = aTime;
        }
        public void setStrTime(){
                this.strTime = LocalTime.now().format(timeFormatter);
        }
        public void setStrDate(){
            this.strDate = LocalDate.now().format(dateFormatter);
        }

        //INSTANCE METHODS
        
        /**Delays the current thread for a specified amount of time
         * 
         * @param aTime 
         */
        private void delay(int aTime){
            try{
                Thread.sleep(aTime);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        
        /**
         * Updates the time every 500 milliseconds
         */
        public void updateTime(){
            this.setStrTime();
            this.delay(500);
            }

        
        
        
        
        
        
        
        
    public static void main(String args[]){
        AlarmClock test = new AlarmClock();
        for(int i = 0; i < 100; i++){
            System.out.println(test.getStrDate());
            System.out.println(test.getStrTime());
            test.updateTime();
        }

    }
}

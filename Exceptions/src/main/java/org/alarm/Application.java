package org.alarm;

public class Application {


    public static void main(String[] args){
        //Pseudo-code
        // Check that power is on
        //Alarm goes off
        //Check awake, if not awake throw exception

        try{
            boolean isAwake = false;
            String power = "ON";
            System.out.println("Morning!  Its 6am!");

            try{
                isAwake = soundAlarm(power);
            }
            catch(PowerIsOffException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println("Unexpected error: " + e.getMessage());
            }
            if(!isAwake){
                throw new InterruptedException("Not awake yet!");
            }
            else{
                System.out.println("The sun is up and SO AM I!!");
            }
        }
        catch (InterruptedException exception){
            String message = exception.getMessage();
            //Text mom to come wake us up.
        }
        finally{
            System.out.println("Reminder: Set your alarm for tomorrow!");
        }
    }

    public static void alarmSounder(String power) throws PowerIsOffException{
        soundAlarm(power);
    }

    public static boolean soundAlarm(String power){
        if(power.equals("ON")){
            return true;
        }
        else{
            throw new PowerIsOffException("You forgot to plug in your alarm clock!");
        }
    }
}

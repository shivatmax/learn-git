import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class SpeedTYping{
    static String[] words = { "Rupam","Dhruv","Aniket" ,"Tushar","Somya","Indu","KARTIK","PIYUSH","Vineet","Devanshu","Joysa","Nishita","Kushagra","sahil","Pushpender","VISHNULAL","Arunima","ASLAH","Rishi","Arpita","Manu","Prem","Shirisha","Akhila","Anjali","AKASH","Manasa","Mamatha","Jaynilkumar","Muzahid","Jadav","PRINCE","Shiv","Akshit","Satyam","Digvijay","Om","Sarang","Aviral"};
    String[] TypedW = {};
    String[] RandW = new String[10];
    

}
public class random extends SpeedTYping{
    Random rand = new Random();
    for(int i=0;i<10;i++)
    {
        RandW[i] =  words[rand.nextInt(39)];
     System.out.print(RandW[i] +" ");

    }
}

public class exceptionbox{
    double check = 0.0;
    try { 
        System.out.print("Incorrect Words : ");
        for (int i = 0; i < RandW.length; i++) {
            // System.out.println(","+RandW[i]+","+TypedW[i]+",");
            
            String left = RandW[i];
              String right = TypedW[i];
                if(left.equals(right))
                {   
                    check++;
                 
                }
                else{
                       
                        System.out.print(left+" ");
                }
                
            
            }
    }

    catch (Exception e) { 
        System.out.println("\n Inside Except block");
       
    } 
   
    Accuracy = (check/10)*100;
    System.out.println(" Accuracy is: "+Accuracy+"%"); 
}
public void timeout(int n){
     System.out.println("n");
     TimeUnit.SECONDS.sleep(1);
}

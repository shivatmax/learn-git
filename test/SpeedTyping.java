import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class SpeedTyping {
   static String[] words = { "Rupam","Dhruv","Aniket" ,"Tushar","Somya","Indu","KARTIK","PIYUSH","Vineet","Devanshu","Joysa","Nishita","Kushagra","sahil","Pushpender","VISHNULAL","Arunima","ASLAH","Rishi","Arpita","Manu","Prem","Shirisha","Akhila","Anjali","AKASH","Manasa","Mamatha","Jaynilkumar","Muzahid","Jadav","PRINCE","Shiv","Akshit","Satyam","Digvijay","Om","Sarang","Aviral"};
  public static void main(String[] args) throws InterruptedException {
   String[] TypedW = {};
   String[] RandW = new String[10];
    System.out.println("3");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("2");
    TimeUnit.SECONDS.sleep(1);

    System.out.println("1");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("GO!");
    TimeUnit.SECONDS.sleep(1);
    Random rand = new Random();
    for(int i=0;i<10;i++)
    {
        RandW[i] =  words[rand.nextInt(39)];
     System.out.print(RandW[i] +" ");

    }
    System.out.println();
    double start = LocalTime.now().toNanoOfDay();
    Scanner scan = new Scanner(System.in);
    String typedWords = scan.nextLine();
   
    double end = LocalTime.now().toNanoOfDay();
    double elapsedTime = end - start;
    double seconds = elapsedTime / 1000000000.0;
    System.out.println(seconds);
    int numChars = typedWords.length();
    // (x char / 5 )/ 1 min = y WPM
    int wpm = (int)((((double) numChars /5) /seconds) * 60);
    System.out.println("Your WPM  "+ wpm+" !");
    
    TypedW  = typedWords.split(" ");
    // System.out.println("Array: "+ Arrays.toString(TypedW));  
    double Accuracy = 0.0;
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

}
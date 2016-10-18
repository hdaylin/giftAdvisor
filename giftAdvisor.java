package giftadvisor;
import java.util.Scanner;  
import java.util.Random; 

/**
 *
 * @author daylinhenry
 */ 


public class GiftAdvisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in); 
    Random random = new Random();
    
    String gender = null; 
    String pricerange = null; 
    
     
    
    String [] femalehigh = {"Piece of Jewlery", "Weekend Getaway" }; 
    String [] femalemedium = {"Bottle of perfume", "Sweater"}; 
    String [] femalelow  = {"Bottle of Wine", "Selfie Stick"}; 
    
    String [] malehigh = {"Smart TV", "Apple Watch" };  
    String [] malemedium = {"Guitar", "Playstation" };  
    String [] malelow = {"Books", "Pair of Shoes" }; 
     
    int female1 = random.nextInt(femalehigh.length); 
    int female2 = random.nextInt(femalelow.length);
    int female3 = random.nextInt(femalelow.length); 
    
    int male1 = random.nextInt(malehigh.length); 
    int male2 = random.nextInt(malemedium.length);
    int male3 = random.nextInt(malelow.length); 
    
    
    
    System.out.println("Whats the recipient's gender?"); 
    gender = keyboard.next(); 
    
    if (gender.equals ("female")){
        
        System.out.println("What is your price range?"); 
        pricerange =keyboard.next(); 
         
        if(pricerange.equals ("high")){ 
         
        System.out.println("The perfect gift for her is a " + femalehigh[female1] + "!");   
                     
            
        }else if(pricerange.equals("medium")){
        
            System.out.println("The perfect gift for her is a " + femalemedium[female2] + "!");     
        
        }else if(pricerange.equals("low")){
            
            System.out.println("The perfect gift for her is a " + femalelow[female3] + "!");
        }        
    }else if (gender.equals ("male")){ 
        
        System.out.println("What is your price range?"); 
        pricerange =keyboard.next();  
        
        if(pricerange.equals ("high")){ 
         
        System.out.println("The perfect gift for him is a " + malehigh[male1] + "!");   
                     
            
        }else if(pricerange.equals("medium")){
        
            System.out.println("The perfect gift for him is a " + malemedium[male2] + "!");     
        
        }else if(pricerange.equals("low")){
            
            System.out.println("The perfect gift for him is a " + malelow[male3] + "!");
        }        
        
        
    }
        
        
        
    }
    
}

import java.util.*;
public class factorialno {public static void main(String args[]){  
    int i,factorial=1;
    Scanner sc =new Scanner(System.in);
    int number =sc.nextInt();  
        
    for(i=1;i<=number;i++){    
        factorial=factorial*i;    
    }    
    System.out.println("Factorial of "+number+" is: "+factorial);    
}  
}
    


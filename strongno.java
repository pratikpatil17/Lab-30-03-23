public class strongno{

    static int fact[] = new int[10];
 
    static {
       fact[0] = fact[1] = 1;
       for(int i=2; i<fact.length; ++i) {
           fact[i] = fact[i-1] * i;
       }
    }
 
    public static boolean isStrong(int number) {
       int sum = 0, lastDigit = 0;
       int tempNum = number;
 
       while(tempNum != 0) {
           lastDigit = tempNum % 10;
           sum += fact[lastDigit];
           tempNum /= 10;
       }
       return (sum == number); 
    }
 
    public static void main(String[] args) {
       int minRange = 1, maxRange = 100;
 
     //   Scanner scan = new Scanner(System.in);
     //   System.out.print("Enter the minimum value of range:: ");
     //   minRange = scan.nextInt();
     //   System.out.print("Enter the maximum value of range:: ");
     //   maxRange = scan.nextInt();
 
       System.out.println("The Strong number from "+ 
               minRange + " to "+ maxRange+" are: ");
       for(int i=minRange; i<=maxRange; i++) {
           
           if(isStrong(i))
               System.out.print(i +" ");
       }
 
       
    }
 }
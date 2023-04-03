public class invertedpyramid {
    public static void main(String args[]){
        int row=5;
        int i,j;

        for (i=row; i>=0;i--){
            for(j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

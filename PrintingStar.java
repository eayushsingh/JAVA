/*
1
14
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * * 
* * * * * * * * * * * * 
* * * * * * * * * * * * * 
* * * * * * * * * * * * * * 

=== Code Execution Successful === 

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            for(int row = 1;row<=n;row++){
                for(int col = 1; col<=row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

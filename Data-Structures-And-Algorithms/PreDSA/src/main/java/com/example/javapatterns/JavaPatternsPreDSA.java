package com.example.javapatterns;

import java.util.Scanner;

public class JavaPatternsPreDSA {
    public static void pattern1(int n) {
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=n; j++){
            System.out.print("* "); 
        }
        System.out.println();}
    }
    public static void pattern2(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        for(int i =0 ; i<n ; i++){
            for(int j=0 ; j<=i ; j++){
                 System.out.print(i + 1 + " ");
            }
         System.out.println();
        }
     }
    public static void pattern5(int n) {
       for(int i = n ; i>0 ; i--){
           for(int j = n; j>0; j--) {
               System.out.print("* ");
           }
           System.out.println();
           n-=1;
       }
    }
    public static void pattern6(int n) {
        for(int i=n; i>0 ; i--){
            for(int j=0;j<i; j++){
                System.out.print(j + 1 + " ");
            }
            System.out.println();
            n-=1;
        }
    }
    public static void pattern7(int n) {
        for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n-i-1 ; j++){
                System.out.print(" ");
                }
           
                for(int k=0; k<2*i + 1 ; k++){
                    System.out.print("*");
                }
            System.out.println();  
        }      
     }
    public static void pattern8(int n) {
        for(int i=n ; i>0 ; i--){
            for(int j=n-i; j>0;j-- ){
                System.out.print(" ");
            }
            for(int k=2*i-1; k>0 ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n) {
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-1-i ; j++){
                System.out.print(" ");
            }
             for(int k=0; k<2*i+1; k++){
                 System.out.print("*");
             }
             System.out.println();
          }
 
          for(int i=n; i>0 ; i--){
              for(int j=n-i; j>0; j--){
                  System.out.print(" ");
              }
 
              for(int k=2*i-1; k>0; k--){
                  System.out.print("*");
              }
              System.out.println();
          }
     }
    public static void pattern10(int n) {
        for(int i=1 ; i<=2*n-1 ; i++){
            int numberOfStars = i;
            if(i>n){
                numberOfStars = 2*n-i;
            }
            for(int j=0 ; j<numberOfStars; j++){
                System.out.print("*");
            }
            System.out.println();
    }
    }
    public static void pattern11(int n) {
        for(int i=1 ; i<=2*n-1 ; i++){
            int numberOfStars = i;
            if(i>n){
                numberOfStars = 2*n-i;
            }
            for(int j=0 ; j<numberOfStars; j++){
                System.out.print("*");
            }
            System.out.println();
    }
    }
    public static void pattern12(int n) {
        for(int i=n; i>0 ; i--){
           for(int j=0; j<=n-i; j++){
               System.out.print(j+1+" ");
           }
           for(int k=1; k<=2*i-2 ; k++){
               System.out.print(" ");
           }
           for(int a=n-i;a>=0; a--){
               System.out.print(a+1+" ");
           }
        System.out.println();
        }
    }
    public static void pattern13(int n) {
        int num=1;
        for(int i =1 ; i<=n ; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(num  + " ");
                num=num+1;
            }
            System.out.println();
        }
     }

    public static void pattern14(int n) {
        for(int i = 0 ; i<n; i++){
            for(char ch='A'; ch <= 'A'+i ; ch++){
                System.out.print(ch+ " ");
            }
        System.out.println();
        }
    }

    public static void pattern15(int n) {
        for(int i = n ; i>0; i--){
            for(char ch='A'; ch < 'A'+i ; ch++){
                System.out.print(ch+ " ");
            }
        System.out.println();
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int N = scanner.nextInt();
        scanner.close();
        pattern15(N);
    }
}

package exercicio30;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       int a = 10;
       int b = 15;
       int c = 20;
       
       
       
       if(a > b && a > c){
       if(b > c){
       
       System.out.print(a+", "+ b+", " + c);
       
       }else{System.out.print(a+", "+c+", " + b);}
       
       }
       
       
       if(b > a && b > c){
       if(a > c){
       
       System.out.print(b+", "+ a+", " + c);
       
       }else{System.out.print(b+", "+c+", " + a);}
       
       }
       
       if(c > a && c > b){
       if(a > c){
       
       System.out.print(c+", "+a+", " + b);
       
       }else{System.out.print(c+", "+b+", " + a);}
       
       }
       
        
        
        
        
       
    }
}

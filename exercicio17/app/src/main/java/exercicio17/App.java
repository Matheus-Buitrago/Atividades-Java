package exercicio17;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] vet = new int[5];
        int num=0;
        
        System.out.println("informe cinco numeros");
        
        for(int x=0;x<5;x++){
        vet[x]= teclado.nextInt();
        
        }
        
        for(int i=0;i<5;i++){
        if(vet[i]>= 10 & vet[i]<=150){
        
        num++;
        }
        }
        
        System.out.println(num+" numeros informados estao entre 10 e 150");
        
        
        
    }
}

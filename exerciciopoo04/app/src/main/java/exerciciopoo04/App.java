package exerciciopoo04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        elevador objetoelevador = new elevador(0,10,0);
        Scanner teclado = new Scanner(System.in);
        
        char op;
        char opPosicao;
        
        
        System.out.print("entra? ");
        op = teclado.next().charAt(0);
        if(op == 's' || op =='S'){
        objetoelevador.entra();
        }
        
        
        System.out.print("sai? ");
        op = teclado.next().charAt(0);
        if(op == 's' || op =='S'){
        objetoelevador.sai();
        }
        
        
        System.out.print("sobe? ");
        opPosicao = teclado.next().charAt(0);
        if(op == 's' || op =='S'){
        objetoelevador.sobe();
        }
        
        
        System.out.print("desce? ");
        opPosicao = teclado.next().charAt(0);
        if(op == 's' || op =='S'){
        objetoelevador.desce();
        }
        
        
       
    }
}

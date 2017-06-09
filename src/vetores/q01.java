/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author renan
 */
public class q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int vet[] = new int[10];
        
        System.out.println("Valores salvos: ");
        
        for(int i = 0;i<10;i++){
            vet[i] = entrada.nextInt();
        }
        
        System.out.print("\nOrdem inversa: ");
        
        for(int i = 9;i>-1;i--){
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
    }
    
}

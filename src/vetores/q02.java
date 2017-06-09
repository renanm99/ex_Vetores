/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author renan
 */
public class q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = new int[10];
        int aux=1;
        
        for(int i = 0;i<10;i++){
            for(int o = aux+vet[i];o<vet[i]+20;o++){
                if(o%2 != 0){
                    vet[i] = o;
                    aux=vet[i]+1;
                    break;
                }
            }
        }
        for(int i = 0;i<10;i++){
        System.out.print(vet[i] + " ");
        }
    }
    
}

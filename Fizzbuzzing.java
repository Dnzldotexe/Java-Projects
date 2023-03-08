/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzzing;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Fizzbuzzing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please input initial number [>= 0]: ");
        int one = sc.nextInt();
        
        System.out.print("Please input last number [<= 100]: ");
        int two = sc.nextInt();
        
        for(int i = (one); i <= (two); i++){
            
            if(i % 15 == 0){
                System.out.println("FIZZBUZZ");
            }else if(i % 3 == 0){
                System.out.println("FIZZ");
            }else if(i % 5 ==0){
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }
            
            /*if (i % == 0) {
            
            System.out.print("\n" + i + "\n");
            
            }*/
       }
        
        //System.out.println();
        //System.out.println(two);
        
    }
    
}

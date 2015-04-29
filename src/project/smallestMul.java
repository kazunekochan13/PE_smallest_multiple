/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Owner
 */
public class smallestMul {
    
    public void sm() {
        Boolean exit = false;
        int n=3;
        while (exit!=true){
            if (n%1==0 && n%2==0 && n%3==0 && n%4==0 && n%5==0 && n%6==0 && n%7==0 && n%8==0 && n%9==0 && n%10==0 && n%11==0 && n%12==0 && n%13==0 && n%14==0 && n%15==0 && n%16==0 && n%17==0 && n%18==0 && n%19==0 && n%20==0){
                System.out.println(n);
                exit=true;
            }
            //System.out.println(n);
            n++;
        }
    }
    
    public static void main(String[] args){
        smallestMul main = new smallestMul();
        main.sm();
    }
}

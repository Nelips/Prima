/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prima;
import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class Prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan angka pertama: ");
        int a=input.nextInt();
        System.out.println("Masukan angka kedua: ");
        int b=input.nextInt();
        int c;
        if(a>b){
            c=a;
            a=b;
            b=c;
        }
        System.out.print("Deret bilangan priman antara " + a + " dan " + b + " yaitu: ");
        boolean prime = true;
        while(b<=a){
            c=b-1;
            if(c!=1 || c!=0 || b!=1 || b!=2)
                while(c>1){
                    if(b%c==0) prime = false;
                    c--;
                }
            if(prime==true) System.out.print(b + ", ");
            prime=true;
            a++;
        }
        
    }
    
}

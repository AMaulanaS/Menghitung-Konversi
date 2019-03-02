/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;

class Matematika_2{
    float hasil;
    void pertambahan (int a, int b)
    {
        hasil=a+b;
        System.out.println("pertambahan : "+a+" + "+b+"="+hasil);
    }
    void pengurangan(int a, int b)
    {
        hasil=a-b;
        System.out.println("pengurangan : "+a+" - "+b+"="+hasil);
    }
    void perkalian (int a, int b)
    {
        hasil= a*b;
        System.out.println("perkalian : "+a+" * "+b+"="+hasil);
    }
    void pembagian (float a, float b)
    {
        hasil=a/b;
        System.out.println("pembagian : "+a+" / "+b+"="+hasil);
    }
    
}
public class Matematika {
    
    public static void main(String[] args){
        Matematika_2 Matrik= new Matematika_2();
        
        Matrik.pengurangan(2, 9);
        Matrik.pertambahan(25, 75);
        Matrik.perkalian(2, 4);
        Matrik.pembagian(5, 2);
    }
    
}

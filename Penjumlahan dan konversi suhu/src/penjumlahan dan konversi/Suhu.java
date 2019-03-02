/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;

class formula{
    int cel;
    void kelvin(int c){
        this.cel=c;
        float K=c + 273.15f;
        System.out.println("suhu"+cel+" = "+K+"kelvin");
    }
    void fahrenheit()
    {
        float F=cel * 1.8f + 32;
        System.out.println("suhu"+cel+"="+F+"farenheit");
    }
    void rankine()
    {
        float R=cel * 1.8f + 491.67f;
        System.out.println("suhu"+cel+"="+R+"rankine");
    }
    void delisle()
    {
        float D=(100 - cel)*1.5f;
                System.out.println("suhu"+cel+"="+D+"rankine");
    }
    void newton()
    {
        float N=cel*33/100;
                System.out.println("suhu"+cel+"="+N+"rankine");
    }
    void reamur()
    {
        float R=cel*0.8f;
                System.out.println("suhu"+cel+"="+R+"rankine");
    }
    void romer()
    {
        float Z= cel * 21/40 + 7.5f;
                System.out.println("suhu"+cel+"="+Z+"rankine");
    }
}
public class Suhu {
    public static void main(String[] args)
    {
        formula suhu = new formula();
        suhu.kelvin(170);
        suhu.fahrenheit();
        suhu.rankine();
        suhu.delisle();
        suhu.newton();
        suhu.reamur();
        suhu.romer();
    }
}

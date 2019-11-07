/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan55_handphone;

/**
 *
 * @author syhar
 */
public class Handphone {
    
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;
    
    public Handphone(){
    
        
    }
    
    public void displayProduct(){
        System.out.println("Manufatur : "+manufacture);
        System.out.println("OS : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
    
}

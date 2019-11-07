/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan55_handphone;

/**
 *
 * @author 
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan55_Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Android x = new Android("Samsung", "Android", "Grand", 3000000);
        Blackberry y = new Blackberry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone z = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        
        x.displayProduct();
        x.setKeyStore("234ibfd3840fo");
        System.out.println("Andorid Key Store : "+x.getKeyStore());
        System.out.println("");
        
        y.displayProduct();
        y.setPinBB("BHS249");
        System.out.println("PIN : "+y.getPinBB());
        System.out.println("");
        
        z.displayProduct();
        z.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store : "+z.getWpKeyStore());
        System.out.println("");
    }
    
}

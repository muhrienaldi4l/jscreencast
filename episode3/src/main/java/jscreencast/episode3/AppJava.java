package jscreencast.episode3;

import jscreencast.episode3.dto.Jeruk;

/**
 * @author Eko Kurniawan Khannedy
 */
public class AppJava {

    static public void main(final String[] args){

        Jeruk a = new Jeruk();
        a.setNama("A");
        a.setJumlah(10);

        Jeruk b = new Jeruk();
        b.setNama("B");
        b.setJumlah(10);

        Jeruk c = new Jeruk();
        c.setNama("C");

        int jumlah = a.getJumlah() + b.getJumlah();
        c.setJumlah(jumlah);

        System.out.println(c.getJumlah());

    }

}
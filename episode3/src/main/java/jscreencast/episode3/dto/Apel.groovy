package jscreencast.episode3.dto

/**
 * @author Eko Kurniawan Khannedy
 */
class Apel {

    String nama;

    Integer jumlah;

    Apel plus(Apel apel){
        def x = new Apel();
        x.jumlah = this.jumlah + apel.jumlah
        return x
    }

}

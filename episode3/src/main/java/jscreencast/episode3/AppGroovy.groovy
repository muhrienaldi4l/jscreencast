package jscreencast.episode3

import jscreencast.episode3.dto.Apel

/**
 * @author Eko Kurniawan Khannedy
 */
class AppGroovy {

    static def main(final String[] args){

        def a = new Apel()
        a.nama = "A"
        a.jumlah = 10

        def b = new Apel()
        b.nama = "B"
        b.jumlah = 10

        def c = a + b
        c.nama = "C"

        println(c.jumlah)

    }

}

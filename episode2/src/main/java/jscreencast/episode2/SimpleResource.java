package jscreencast.episode2;

/**
 * @author Eko Kurniawan Khannedy
 */
public class SimpleResource implements AutoCloseable{

    public void doSomething(){
        // do something
    }

    @Override
    public void close() throws Exception {
        System.out.println("Ditutup");
    }
}
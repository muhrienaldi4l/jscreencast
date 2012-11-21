package jscreencast.episode2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author Eko Kurniawan Khannedy
 */
public class App {

    static public void main(final String[] args) {

        String data = "sample data";
        File outputFile = new File("/tmp/sample.txt");

//        BufferedWriter writer = null;
//        try {
//            writer = new BufferedWriter(new FileWriter(outputFile));
//            writer.write(data);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (SimpleResource resource = new SimpleResource()) {
            resource.doSomething();
        } catch (Exception ex) {

        }

    }

}
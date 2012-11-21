package jscreencast.episode1;

import jscreencast.episode1.dto.Category;

import java.util.logging.Logger;

/**
 * @author Eko Kurniawan Khannedy
 */
public class App {

    static private Logger log = Logger.getLogger(App.class.getName());

    static public void main(final String[] args){
        log.info("start application");

        Category category = new Category();
        category.setId(10L);
        category.setName("Sample");

        log.info("end application");
    }

}
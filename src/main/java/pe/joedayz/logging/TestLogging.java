package pe.joedayz.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogging {

    private static Logger logger =
            Logger.getLogger(pe.joedayz.logging.TestLogging.class.getName());

    public static void main(String[] args) {
        try {
            /* acciones que pueden lanzar excepciones */
        } catch(Exception e) {
            logger.log(Level.SEVERE, "Your error message", e);
        }

        logger.log(Level.INFO, "Your message");
        logger.info("Your message");
    }
}

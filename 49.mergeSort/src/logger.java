import java.util.* ;
import java.util.logging.Logger;

public class logger {

    protected static final Logger LOGGER = Logger.getLogger(logger.class.getName());

    public static void main(String[] args) {

        System.out.println("Program Started");

        LOGGER.info("This is an INFO message.");

        System.out.println("Program Finished");
    }
}

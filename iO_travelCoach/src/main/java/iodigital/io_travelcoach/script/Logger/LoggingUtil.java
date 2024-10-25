package iodigital.io_travelcoach.script.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingUtil {
    private static final Logger logger = LoggerFactory.getLogger(LoggingUtil.class);

    public static void logInfo(String message, Object result) {
        logger.info(message + ": {}", result);
    }

    public static void logError(String message, Exception exception) {
        logger.error(message, exception);
    }

    public static void logDebug(String message) {
        logger.debug(message);
    }
}

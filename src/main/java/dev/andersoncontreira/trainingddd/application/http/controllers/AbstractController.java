package dev.andersoncontreira.trainingddd.application.http.controllers;

import dev.andersoncontreira.trainingddd.infrastructure.logger.ConsoleLogger;
import org.apache.log4j.Logger;

public class AbstractController {

    protected static Logger logger = null;

    public static Logger getLogger() {
        if (logger == null) {
            // TODO temporário (injetar por dependencia e também trocar por um application logger)
            logger = ConsoleLogger.getLogger();
        }
        return logger;
    }
}

package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task0 {
    public static Logger logger = LogManager.getLogger();

    public void helloWorld() {
        logger.info("Привет, мир!");
    }
}

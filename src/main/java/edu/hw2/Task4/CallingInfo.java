package edu.hw2.Task4;

import java.util.logging.Logger;

public record CallingInfo(String className, String methodName) {
    static Logger logger = Logger.getGlobal();

    public static void callingInfo() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        logger.info("className: " + className);
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        logger.info("methodName: " + methodName);
    }
}

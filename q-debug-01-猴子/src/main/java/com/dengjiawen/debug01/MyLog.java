package com.dengjiawen.debug01;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Author Jarvan
 * @create 2020/9/14 9:39
 */
public class MyLog {
    private static final Logger debugLogger = LogManager.getLogger("DEBUG");
    private static final Logger infoLogger = LogManager.getLogger("INFO");
    private static final Logger warnLogger = LogManager.getLogger("WARN");
    private static final Logger errorLogger = LogManager.getLogger("ERROR");

    /**
     * 输出debug级别的日志
     *
     * @param msg Object 要输出的消息
     */
    public static void logDebug(Object msg) {
        debugLogger.debug(msg);
    }

    /**
     * 输出info级别的日志
     *
     * @param msg Object 要输出的消息
     */
    public static void logInfo(Object msg) {
        infoLogger.info(msg);
    }

    /**
     * 输出warn级别的日志
     *
     * @param msg Object 要输出的消息
     */
    public static void logWarn(Object msg) {
        warnLogger.warn(msg);
    }

    /**
     * 输出error级别的日志
     *
     * @param msg Object 要输出的消息
     */
    public static void logError(Object msg) {
        errorLogger.error(msg);
    }
}

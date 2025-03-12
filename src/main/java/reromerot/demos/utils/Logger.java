package reromerot.demos.utils;

import org.slf4j.LoggerFactory;

public final class Logger {

    private Logger() {
    }

    public static void error(Class<?> clazz, String mensaje) {
        LoggerFactory.getLogger(clazz.getName()).error(mensaje);
    }

    public static void info(Class<?> clazz, String mensaje) {
        LoggerFactory.getLogger(clazz.getName()).info(mensaje);
    }

}
package com.example;

public class Logger {

    private Logger() {}

    private static class loggerHolder{
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance(){
        return loggerHolder.INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}

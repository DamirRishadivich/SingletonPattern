package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static javax.print.attribute.standard.MediaSizeName.D;

public class Logger {

    private static Logger instance;
    protected int num = 1;
    private Logger() {}

    public void log(String msg) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:s");
        Date date = new Date();
        System.out.println("[" + df.format(date) + " " +num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

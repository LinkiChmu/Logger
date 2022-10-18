import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public final class Logger {

    private static Logger logger;

    protected int num = 1;
    protected LocalDateTime dateTimeObj;
    protected DateTimeFormatter formatter;


    private Logger() {
        dateTimeObj = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        dateTimeObj = LocalDateTime.now();
        System.out.println("[" + dateTimeObj.format(formatter) + " " + ++num + "] " + msg);
    }

    @Override
    public String toString() {
        return "[" + dateTimeObj.format(formatter) + " " + 1 + "] Запускаем программу";
    }
}

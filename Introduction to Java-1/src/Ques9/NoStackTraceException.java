package Ques9;

public class NoStackTraceException extends Exception {

    public NoStackTraceException(String message) {
        super(message);
    }
    // Override fillInStackTrace
    @Override
    public Throwable fillInStackTrace() {
        return this; // to skip the stack trace
    }

    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("Custom exception without stack trace");
        } catch (NoStackTraceException e) {
            System.out.println(e.getMessage());
        }
    }
}
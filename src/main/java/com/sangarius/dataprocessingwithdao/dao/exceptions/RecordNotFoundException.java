package main.java.com.sangarius.dataprocessingwithdao.dao.exceptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String message) {
        super(message);
    }
}
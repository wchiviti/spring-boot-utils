package io.github.hobbstech.springbootutils.exceptions;

public class RecordNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -2322365867780274656L;

  public RecordNotFoundException(String s) {
        super(s);
    }
}


package org.accenture.buffer;

public class BufferEmptyException extends Exception {
  
  public  BufferEmptyException(String message) {
    super(message);
    System.err.println("Error :" + message);
}
}

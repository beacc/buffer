package org.accenture.buffer;

public class BufferFullException extends Exception {
  public  BufferFullException(String message) {
    super(message);
    System.err.println("Error :" + message);
}

}

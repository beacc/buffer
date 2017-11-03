package org.accenture.buffer;
/**
 * 
 * @author Beatriz C. Corral
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Buffer {
  private Queue buffer;
  private int capacity;
  int numberPut = 0;
  int numberGet = 0;


  public Buffer(int bsize) {
    capacity = bsize;
    buffer = new LinkedList();
  }

  public void put(Object element) throws BufferFullException {
    if (buffer.size() == capacity) throw new BufferFullException ("Full buffer");
    

    System.out.println("Element inserted");

    buffer.add(element);
    numberPut++;
  }

  public Object get() throws BufferEmptyException {
    if (buffer.isEmpty())
      throw new BufferEmptyException("Empty buffer");

    Object value = buffer.remove();
    System.out.println("Element extracted");

    numberGet++;
    return value;
  }

  public int GetNumberOfElements() {
    return buffer.size();
  }

  public int GetNumberOfHoles() {
    return capacity - buffer.size();
  }

  public int GetNumberOfCapaity() {
    return capacity;
  }

  public double GetNumberOfOperations() {
    return numberPut + numberGet;
  }
}

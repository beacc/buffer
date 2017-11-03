package org.accenture.buffer;
/**
 * 
 * @author Beatriz C. Corral
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Buffer<T> {
  private Queue<T> buffer;
  private int capacity;
  int numberOfPuts = 0;
  int numberOfGets = 0;


  public Buffer(int bufferSize) {
    capacity = bufferSize;
    buffer = new LinkedList<T>();
  }

  public void put(T element) throws BufferFullException {
    if (buffer.size() == capacity) throw new BufferFullException ("Full buffer");
    

    System.out.println("Element inserted");

    buffer.add(element);
    numberOfPuts++;
  }

  public T get() throws BufferEmptyException {
    if (buffer.isEmpty())
      throw new BufferEmptyException("Empty buffer");

    T value = buffer.remove();
    System.out.println("Element extracted");

    numberOfGets++;
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
    return numberOfPuts + numberOfGets;
  }
}

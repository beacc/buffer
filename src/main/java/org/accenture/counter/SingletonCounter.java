package org.accenture.counter;

public class SingletonCounter {
  
  private static SingletonCounter instance;
  private int counter;
  
  
  private SingletonCounter() {
    counter =0;
    instance = null;
    
  }
  
  public static SingletonCounter getInstance() {
    
    if (instance ==null) {
      instance = new SingletonCounter();
    }
    
    return instance;
     
      
    }
  
  public int getCounter() {
    return counter ++;
  }

}

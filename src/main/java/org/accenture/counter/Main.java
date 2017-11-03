package org.accenture.counter;

public class Main {
  public static void main(String [] args) {
    /*Counter counter =new Counter();
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
 
    System.out.println("------");
    
    
    Counter counter2 = new Counter();
    
    System.out.println(counter2.getCounter());
    System.out.println(counter2.getCounter());
  
  
  
   * problema que otro desarrlador puede poner otro contador y 
   * solo se cree una instancia vamos a evitarlo
   * con Singleton
   */
    
    SingletonCounter counter2 =SingletonCounter.getInstance();
    System.out.println(counter2.getCounter());
 
    SingletonCounter counter3= SingletonCounter.getInstance();
    System.out.println(counter3.getCounter());
  }
  
  

}

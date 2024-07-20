package enum1;

import enum1.Books;

public class Main {
	public static void main(String args[]) {
      Books b[] = Books.values();
      System.out.println("-----Display Enum-object--------");
      for(Books k :b) {
    	 System.out.println("Name:"+k.toString()+"\tprice:"+k.price);
    	 
      }
      System.out.println("----display Usig getprice()---");
      for(Books k : b) {
    	  System.out.println("name :"+k.toString()+"\tprice:"+k.getprice());
      }
	}
}

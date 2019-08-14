package com.sonota;
import java.util.*;
public class HashMapExample {
	public static void main(String args[]){  
		   
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Ajay");
		  hm.put(101,"vijay");
		  hm.put(102,"show");
		  System.out.println(hm);
		  
		  for(Map.Entry m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		 
  }

}

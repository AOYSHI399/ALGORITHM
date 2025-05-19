package iit.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FKPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Itemvalue> itemvalues=new ArrayList<Itemvalue>();
		
		Itemvalue itemvalue1=new Itemvalue();
		itemvalue1.setObject(3);
		itemvalue1.setProfit(7);
		itemvalue1.setWeight(7);
		
		
		Itemvalue itemvalue2=new Itemvalue();
		itemvalue2.setObject(3);
		itemvalue2.setProfit(7);
		itemvalue2.setWeight(7);
		
		Itemvalue itemvalue3=new Itemvalue();
		itemvalue3.setObject(3);
		itemvalue3.setProfit(7);
		itemvalue3.setWeight(7);
		
		Itemvalue itemvalue4=new Itemvalue();
		itemvalue4.setObject(3);
		itemvalue4.setProfit(7);
		itemvalue4.setWeight(7);
		
		Itemvalue itemvalue5=new Itemvalue();
		itemvalue5.setObject(3);
		itemvalue5.setProfit(7);
		itemvalue5.setWeight(7);
		
		
		itemvalues.add(itemvalue1);
		itemvalues.add(itemvalue2);
		itemvalues.add(itemvalue3);
		itemvalues.add(itemvalue4);
		itemvalues.add(itemvalue5);
		
		Collections.sort(itemvalues,new MYComparator());
		   
		   
		   int capacity=15;
		   double totalvalue=0.0;
		   int remainingCapacity=capacity;
		   
		   for(Itemvalue item:itemvalues) {
			   if(remainingCapacity==0) {
				   break;
			   }
			   int weight=item.getWeight();
			   int profit=item.getProfit();
			   
			   if(weight<=remainingCapacity) {
				   totalvalue=totalvalue+profit;
				   remainingCapacity=remainingCapacity-weight;
			   }else {
				   double fraction=(double)remainingCapacity/weight;
				   totalvalue=totalvalue+profit*fraction;
				   remainingCapacity=0;
			   }
		   }
		   System.out.println("TotalProfit"+totalvalue);
		   
			}

}

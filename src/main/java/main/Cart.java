package main;
import java.util.ArrayList;
import java.util.List;

import main.Bill;
import main.Item;

public class Cart extends Bill{
    public List<Item> inCart = new ArrayList<Item>();
    public List<Integer> quant = new ArrayList<Integer>();
    public int noOfItems=0;
    public void updateCart(Item a,int q ){
    	if( inCart.contains(a) ) { 
    		int index_a = inCart.indexOf(a);
    		quant.add(quant.get(index_a)+q);
    	}
    	else {
    	inCart.add(a);
    	quant.add(q);
    	noOfItems++;
    	}
   

    }
    public int totalAmt=0;
    public void finalizeCart(String name){
        super.getBill(name);
        for(int i=0;i<noOfItems;i++){
            System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
        }
        totalAmt = calcBill();
        System.out.println("total Amount: "+ Integer.toString(totalAmt));
    }
    public int calcBill() {
    	int total=0;
    	for( int i=0;  i<noOfItems; i++  ) {
    		total = total + ( (inCart.get(i).mrp)*(quant.get(i)) );
    	}
    	return total;
    	
    }
}
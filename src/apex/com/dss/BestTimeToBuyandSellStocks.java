//7.Best possible Time to Buy and Sell Stock
package apex.com.dss;

public class BestTimeToBuyandSellStocks 
{
	public int buysellshares(int [] price)
	{int l=price.length; int maxprofit=0;
	int minprice=price[0];
	if(l<2) {return 0;}
	for(int i=1;i<l;i++)
	{maxprofit=Math.max(maxprofit, price[i]-minprice);
	 minprice=Math.min(minprice, price[i]);
	}
	 return maxprofit;
	}	
	
public static void main(String[] args) 
{	
int [] price= {100,180,260,310,40,535,695};
BestTimeToBuyandSellStocks main=new BestTimeToBuyandSellStocks();
System.out.println(main.buysellshares(price));
}
}

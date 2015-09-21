/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sijo
 *
 */
public class StockMediator implements Mediator {

	private List<Colleague> colleagues;
	private List<StockOffer> stockBuyOffers;
	private List<StockOffer> stockSellOffers;
	private int colleagueCode = 0;
	
	/**
	 * 
	 */
	public StockMediator() {
		super();
		colleagues = new ArrayList<Colleague>();
		stockBuyOffers = new ArrayList<StockOffer>();
		stockSellOffers = new ArrayList<StockOffer>();
		
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.mediator.Mediator#addColleague(com.designpatterns.sijo.samples.behavioral.mediator.Colleague)
	 */
	@Override
	public void addColleague(Colleague newcolleague) {
		colleagues.add(newcolleague);
		colleagueCode ++;
		newcolleague.setColleagueCode(colleagueCode);
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.mediator.Mediator#saleOffer(java.lang.String, int, int)
	 */
	@Override
	public void saleOffer(String stock, int shares, int collCode) {
		boolean stockSold = false;
		for(StockOffer stockOffer:stockBuyOffers){
			if(stockOffer.getStockSymbol().equals(stock) && stockOffer.getStockShares() == shares){
				System.out.println(shares+" shares of "+stock+ " Sold to Colleague Code "+stockOffer.getColleagueCode());
				stockBuyOffers.remove(stockOffer);
				stockSold = true;
			}
			if(stockSold) break;
		}
		if(!stockSold){
			System.out.println(shares+" shares of "+stock+ " added to inventory ");
			StockOffer newOffering = new StockOffer(shares,stock,collCode);
			stockSellOffers.add(newOffering);
		}
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.mediator.Mediator#buyOffer(java.lang.String, int, int)
	 */
	@Override
	public void buyOffer(String stock, int shares, int collCode) {
		boolean stockBought = false;
		for(StockOffer stockOffer:stockSellOffers){
			if(stockOffer.getStockSymbol().equals(stock) && stockOffer.getStockShares() == shares){
				System.out.println(shares+" shares of "+stock+ " Bought by Colleague Code "+stockOffer.getColleagueCode());
				stockSellOffers.remove(stockOffer);
				stockBought = true;
			}
			if(stockBought) break;
		}
		if(!stockBought){
			System.out.println(shares+" shares of "+stock+ " added to inventory ");
			StockOffer newOffering = new StockOffer(shares,stock,collCode);
			stockBuyOffers.add(newOffering);
		}
	}
	
	public void getStockOfferings(){
		System.out.println("Stocks For Sale");
		for(StockOffer offer :stockSellOffers){
			System.out.println(offer.getStockShares()+ " of "+ offer.getStockSymbol());
		}
		
		System.out.println("Stocks Buy Offers");
		for(StockOffer offer :stockBuyOffers){
			System.out.println(offer.getStockShares()+ " of "+ offer.getStockSymbol());
		}
		
	}
	
}

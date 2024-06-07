package chap23_stream.card;

public class CreditCard {
	private String company;
	private String cardName;
	private int limit;
	
	public CreditCard() {
		
	}
	
	public CreditCard(String company, String cardName, int limit) {
		this.company = company;
		this.cardName = cardName;
		this.limit = limit;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "CreditCard [company=" + company + ", cardName=" + cardName + ", limit=" + limit + "]";
	}
	
	public void cardInfo() {
		System.out.println("카드사: " + this.company);
		System.out.println("카드명: " + this.cardName);
		System.out.println("최대한도: " + this.limit);
	}
}

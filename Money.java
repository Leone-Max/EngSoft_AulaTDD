package money.dollar;

class Money  {
	   protected int amount;
	   
	   protected String currency;

	   String currency() {
	      return currency;
	   }
	   
	   public boolean equals(Object object) {
		      Money money = (Money) object;
		      return amount == money.amount && currency().equals(money.currency());
	   }
	   
	   static Money dollar(int amount)  {
		      return new Dollar(amount, "USD");
		   }
		   
	   static Money franc(int amount) {
	      return new Franc(amount, "CHF");
	   }
			
	   
	   Money(int amount, String currency) {
		      this.amount = amount;
		      this.currency = currency;
	   }
	   
	   Money times(int multiplier) {
		      return new Money(amount * multiplier, currency);
	   } 
}

class Dollar extends Money {
	
	   private int amount;
	   
	   Dollar(int amount, String currency)  {
		      super(amount, currency);
	   }
			
	   Money times(int multiplier)  {
	      return Money.dollar(amount * multiplier);
	   }
	   
	   public boolean equals(Object object)  {
		   Dollar dollar = (Dollar) object;
		   return amount == dollar.amount;
		}
}	

class Franc extends Money{   
	   private int amount;		   
	   
	   Franc(int amount, String currency) {
		      super(amount, currency);
		   }
		     
	   Money times(int multiplier)  {
	      return Money.franc(amount * multiplier);
	   }
	   
	    public boolean equals(Object object) {					
	       Franc franc = (Franc) object;      
	       return amount == franc.amount;					
	     }					
}
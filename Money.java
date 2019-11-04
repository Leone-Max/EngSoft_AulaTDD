package money.dollar;

abstract class Money  {
	   int amount;
	   
	   public boolean equals(Object object) {
		      Money money = (Money) object;
		      return amount == money.amount && getClass().equals(money.getClass());
	   } 
	   
	   static Dollar dollar(int amount)  {
		      return new Dollar(amount);
	   }
	   
	   static Money franc(int amount) {
		      return new Franc(amount);
	    }
			
	   abstract Money times(int multiplier);  
}

class Dollar extends Money {
	
	   int amount;
	   Dollar(int amount) {
	      this.amount= amount;
	   }
	   
	   Money times(int multiplier)  {
		      return new Dollar(amount * multiplier);
	   }
	   
	   public boolean equals(Object object)  {
		   Dollar dollar = (Dollar) object;
		   return amount == dollar.amount;
		}
}	

class Franc extends Money{   
	   int amount;					
	   Franc(int amount) {      
	      this.amount= amount;
	    }					
	   Money times(int multiplier)  {
		      return new Franc(amount * multiplier);
	   }  
	    public boolean equals(Object object) {					
	       Franc franc = (Franc) object;      
	       return amount == franc.amount;					
	     }					
}
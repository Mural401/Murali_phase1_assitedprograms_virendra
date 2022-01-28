package abstractclass;

class customer {
	int amount=10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw.....");
		if (this.amount<amount)
		{
			System.out.println("less amount;wating for deposit");
			try {
				wait();
			    }
			catch(Exception e) {}
		}
		this.amount-=amount;
		System.out.println("withdraw completed ,the left over amount "+ this.amount);
	}
	synchronized void withdraw1 (int amount1) {
		System.out.println("going for deposit");
		if (this.amount<amount)
		{
			System.out.println("deposit completed" + this.amount);
		    try {
		    	wait();
		        }
		    catch(Exception e) {}
		}
		this.amount-=amount1;
		System.out.println("withdraw completed ,the left over amount "+ this.amount);
	}
	synchronized void withdraw2 (int amount2) {
		System.out.println("going for deposit");
		if (this.amount<amount2)
		{
			System.out.println("deposit completed" + this.amount);
		    try {
		    	wait();
		        }
		    catch(Exception e) {}
		}
		this.amount-=amount2;
		System.out.println("withdraw completed ,the left over amount "+ this.amount);
	}
	synchronized void deposit (int amount3) {
		System.out.println("going for deposit");
		this.amount+=amount3;
		 
		System.out.println("deposit completed" + this.amount);
		notify();
	}
}
public class Withdraw {
	public static void main(String[] args) {
		final customer c= new customer();
		new Thread() {
			public void run()
			{
				c.withdraw(5000);
			}
		}.start();
		new Thread() {
			public void run()
			{
				c.withdraw(4000);
				
			}
		}.start();
		new Thread () {
			public void run ()
			{
			c.withdraw(10000);
		}
		
		}.start();
		new Thread() {
			public void run ()
			{
				c.deposit(20000);
			}
		}.start();
			}
}
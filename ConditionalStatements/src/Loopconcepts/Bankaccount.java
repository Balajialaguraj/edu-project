package Loopconcepts;

public class Bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class bank{
			
			int ac_no;
			String name, type;
			float amount;
			void details(int n, String nm, String t, float a)
			{
				ac_no=n;
				name=nm;
				type=t;
				amount=a;
				
			}
			void show()
			{
				System.out.println(ac_no +" " + name+"" + type+""+amount);
				
			}
			void deposit(float a)
			{
				amount+=a;
				System.out.println("deposit amount:" + a);
			}
			
			void withdraw(float a)
			{
				if(amount<a)
					System.out.println("insfficent balance");
				else
					amount-=a;
				System.out.println("withdraw amount" + a);
			}
				void checkbalance()
				{
					System.out.println("balance is " + amount);
					
				}
				
		}
		class test
		{
			public static void main(String args[])
			
			{
				bank b=new bank();
				b. details(123456,"bala","saving account",10000);
				b. show();
				b. deposit(40000);
				b. checkbalance();
				b. withdraw(10000);
				b. checkbalance();
				
			}
		}
		

	}

}

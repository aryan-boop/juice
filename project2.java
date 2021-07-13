import java.util.Scanner;

public class project2
{
	

	public static void main(String [] args)
	{
		Scanner d = new Scanner(System.in);
	    
		System.out.println("Please Enter your personal details:");
		
		
		
		
		
		
		System.out.print("Name: ");
		String name = d.next();
		System.out.print("Age: ");
		int age = d.nextInt();
		System.out.print("Address:");
		String address = d.next();
		System.out.print("Contact Number: ");
		int number = d.nextInt();
		
		System.out.print("Would you like to buy Juice or sell Fruits: ");
		String a = d.next();
		if (a.equals("Buy"))
		{
			System.out.print("Would you like to have pulp in your juice: ");
			String b = d.next();
			if (b.equals("Yes"))
			{
				System.out.print("which Juice would you like: Apple, Orange, Lemon, Pineapple: ");
				String c = d.next();
				if (c.equals("Apple"))
				{
					System.out.println("1 Liter of Apple Juice is equal to Rs.120");
					System.out.print("How much liters of Apple Juice do you want: ");
					double e = d.nextDouble();
					double f = 0;
					f = e*120;
					System.out.println("Rs. "+f+" will be charged for "+e+" liters of Apple Juice ");
					System.out.print("Would you like to procced:");
					String g = d.next();
					if (g.equals("Yes"))
					{
						System.out.print("How would you like to pay: COD or Net Banking ");
						String h = d.next();
						if (h.equals("COD"))
						{
							System.out.println("Payment will be done via COD on the following details within 2-3 business days \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
						else if (h.equals("Net"))
						{
							System.out.println("Please procced towards the Net Banking portal and the delivery will be done within 2-3 Business Days on the following details \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
					}
					else if (g.equals("No"))
					{
						System.out.println("The transaction was Declined");
						System.out.print("For further query Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
					}
				}
				else if (c.equals("Orange"))
				{
					System.out.println("1 Liter of Orange Juice is equal to Rs.130");
					System.out.print("How much liters of Orange Juice do you want: ");
					double e = d.nextDouble();
					double f = 0;
					f = e*130;
					System.out.println("Rs. "+f+" will be charged for "+e+" liters of Orange Juice ");
					System.out.print("Would you like to procced:");
					String g = d.next();
					if (g.equals("Yes"))
					{
						System.out.print("How would you like to pay: COD or Net Banking ");
						String h = d.next();
						if (h.equals("COD"))
						{
							System.out.println("Payment will be done via COD on the following details within 2-3 business days \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
						else if (h.equals("Net"))
						{
							System.out.println("Please procced towards the Net Banking portal and the delivery will be done within 2-3 Business Days on the following details \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
					}
					else if (g.equals("No"))
					{
						System.out.println("The transaction was Declined");
						System.out.print("For further query Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
					}
				}
				else if (c.equals("Lemon"))
				{
					System.out.println("1 Liter of Lemon Juice is equal to Rs.140");
					System.out.print("How much liters of Lemon Juice do you want: ");
					double e = d.nextDouble();
					double f = 0;
					f = e*140;
					System.out.println("Rs. "+f+" will be charged for "+e+" liters of Lemon Juice ");
					System.out.print("Would you like to procced:");
					String g = d.next();
					if (g.equals("Yes"))
					{
						System.out.print("How would you like to pay: COD or Net Banking ");
						String h = d.next();
						if (h.equals("COD"))
						{
							System.out.println("Payment will be done via COD on the following details within 2-3 business days \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
						else if (h.equals("Net"))
						{
							System.out.println("Please procced towards the Net Banking portal and the delivery will be done within 2-3 Business Days on the following details \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
					}
					else if (g.equals("No"))
					{
						System.out.println("The transaction was Declined");
						System.out.print("For further query Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
			
					}
		
				}
				else if (c.equals("Pineapple"))
				{
					System.out.println("1 Liter of Pineapple Juice is equal to Rs.150");
					System.out.print("How much liters of Pineapple Juice do you want: ");
					double e = d.nextDouble();
					double f = 0;
					f = e*150;
					System.out.println("Rs. "+f+" will be charged for "+e+" liters of Pineapple Juice ");
					System.out.print("Would you like to procced:");
					String g = d.next();
					if (g.equals("Yes"))
					{
						System.out.print("How would you like to pay: COD or Net Banking ");
						String h = d.next();
						if (h.equals("COD"))
						{
							System.out.println("Payment will be done via COD on the following details within 2-3 business days \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
						else if (h.equals("Net"))
						{
							System.out.println("Please procced towards the Net Banking portal and the delivery will be done within 2-3 Business Days on the following details \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
					}
					else if (g.equals("No"))
					{
						System.out.println("The transaction was Declined");
						System.out.print("For further query Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
			
					}
		
				}
	
			}
			else if (b.equals("No"))
			{
				System.out.print("which Juice would you like: Apple, Orange, Lemon, Pineapple: ");
				String c = d.next();
				if (c.equals("Apple"))
				{
					System.out.println("1 Liter of Apple Juice is equal to Rs.130");
					System.out.print("How much liters of Apple Juice do you want: ");
					double e = d.nextDouble();
					double f = 0;
					f = e*130;
					System.out.println("Rs. "+f+" will be charged for "+e+" liters of Apple Juice ");
					System.out.print("Would you like to procced:");
					String g = d.next();
					if (g.equals("Yes"))
					{
						System.out.print("How would you like to pay: COD or Net Banking ");
						String h = d.next();
						if (h.equals("COD"))
						{
							System.out.println("Payment will be done via COD on the following details within 2-3 business days \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
						else if (h.equals("Net"))
						{
							System.out.println("Please procced towards the Net Banking portal and the delivery will be done within 2-3 Business Days on the following details \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
					}
					else if (g.equals("No"))
					{
						System.out.println("The transaction was Declined");
						System.out.print("For further query Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
					}
				}
				else if (c.equals("Orange"))
				{
					System.out.println("1 Liter of Orange Juice is equal to Rs.140");
					System.out.print("How much liters of Orange Juice do you want: ");
					double e = d.nextDouble();
					double f = 0;
					f = e*140;
					System.out.println("Rs. "+f+" will be charged for "+e+" liters of Orange Juice ");
					System.out.print("Would you like to procced:");
					String g = d.next();
					if (g.equals("Yes"))
					{
						System.out.print("How would you like to pay: COD or Net Banking ");
						String h = d.next();
						if (h.equals("COD"))
						{
							System.out.println("Payment will be done via COD on the following details within 2-3 business days \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
						else if (h.equals("Net"))
						{
							System.out.println("Please procced towards the Net Banking portal and the delivery will be done within 2-3 Business Days on the following details \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
					}
					else if (g.equals("No"))
					{
						System.out.println("The transaction was Declined");
						System.out.print("For further query Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
					}
				}
				else if (c.equals("Lemon"))
				{
					System.out.println("1 Liter of Lemon Juice is equal to Rs.150");
					System.out.print("How much liters of Lemon Juice do you want: ");
					double e = d.nextDouble();
					double f = 0;
					f = e*150;
					System.out.println("Rs. "+f+" will be charged for "+e+" liters of Lemon Juice ");
					System.out.print("Would you like to procced:");
					String g = d.next();
					if (g.equals("Yes"))
					{
						System.out.print("How would you like to pay: COD or Net Banking ");
						String h = d.next();
						if (h.equals("COD"))
						{
							System.out.println("Payment will be done via COD on the following details within 2-3 business days \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
						else if (h.equals("Net"))
						{
							System.out.println("Please procced towards the Net Banking portal and the delivery will be done within 2-3 Business Days on the following details \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
					}
					else if (g.equals("No"))
					{
						System.out.println("The transaction was Declined");
						System.out.print("For further query Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
			
					}
		
				}
				else if (c.equals("Pineapple"))
				{
					System.out.println("1 Liter of Pineapple Juice is equal to Rs.160");
					System.out.print("How much liters of Pineapple Juice do you want: ");
					double e = d.nextDouble();
					double f = 0;
					f = e*160;
					System.out.println("Rs. "+f+" will be charged for "+e+" liters of Pineapple Juice ");
					System.out.print("Would you like to procced:");
					String g = d.next();
					if (g.equals("Yes"))
					{
						System.out.print("How would you like to pay: COD or Net Banking ");
						String h = d.next();
						if (h.equals("COD"))
						{
							System.out.println("Payment will be done via COD on the following details within 2-3 business days \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
						else if (h.equals("Net"))
						{
							System.out.println("Please procced towards the Net Banking portal and the delivery will be done within 2-3 Business Days on the following details \n"+name+"\n"+age+"\n"+address+"\n"+number);
							System.out.print("For further queries Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
						}
					}
					else if (g.equals("No"))
					{
						System.out.println("The transaction was Declined");
						System.out.print("For further query Please contact on: 1234567890 \nOr mail us at Juicy@gmail.com");
			
					}
		
				}
	
			}

		}
		else if (a.equals("Sell"))
		{
			System.out.print("Which Fruit would you like to sell: Apple, Orange, Lemon, Pineapple: ");
			String b = d.next();
			if (b.equals("Apple"))
			{
				System.out.println("1 Kg of Apple is worth Rs.120 ");
				System.out.print("How much in Kg would you like to Sell: ");
				double c = d.nextDouble();
				double e = 0;
				
				e = c*120;
				System.out.println("Rs."+e+" will be given for "+c+" Kg of Apple.");
				System.out.print("Would you like to procced: ");
				String f = d.next();
				if (f.equals("Yes"))
				{
					System.out.print("Our Staff will be contacting you within 1-2 Business Days");
					
				}
				else if (f.equals("No"))
				{
					System.out.print("The process was terminated");
				}
			}
			else if (b.equals("Orange"))
			{
				System.out.println("1 Kg of Orange is worth Rs.130 ");
				System.out.print("How much in Kg would you like to Sell: ");
				double c = d.nextDouble();
				double e = 0;
				
				e = c*130;
				System.out.println("Rs."+e+" will be given for "+c+" Kg of Orange.");
				System.out.print("Would you like to procced: ");
				String f = d.next();
				if (f.equals("Yes"))
				{
					System.out.print("Our Staff will be contacting you within 1-2 Business Days");
					
				}
				else if (f.equals("No"))
				{
					System.out.print("The process was terminated");
				}
			}
			else if (b.equals("Lemon"))
			{
				System.out.println("1 Kg of Lemon is worth Rs.140 ");
				System.out.print("How much in Kg would you like to Sell: ");
				double c = d.nextDouble();
				double e = 0;
				
				e = c*140;
				System.out.println("Rs."+e+" will be given for "+c+" Kg of Lemon.");
				System.out.print("Would you like to procced: ");
				String f = d.next();
				if (f.equals("Yes"))
				{
					System.out.print("Our Staff will be contacting you within 1-2 Business Days");
					
				}
				else if (f.equals("No"))
				{
					System.out.print("The process was terminated");
				}
			}
			else if (b.equals("Pineapple"))
			{
				System.out.println("1 Kg of pineapple is worth Rs.150 ");
				System.out.print("How much in Kg would you like to Sell: ");
				double c = d.nextDouble();
				double e = 0;
				
				e = c*150;
				System.out.println("Rs."+e+" will be given for "+c+" Kg of .");
				System.out.print("Would you like to procced: ");
				String f = d.next();
				if (f.equals("Yes"))
				{
					System.out.print("Our Staff will be contacting you within 1-2 Business Days");
					
				}
				else if (f.equals("No"))
				{
					System.out.print("The process was terminated");
				}
			}
		}
	}
}
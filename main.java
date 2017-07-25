
public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Address address1=new Address("gzb","UP","india",520);  
		Address address2=new Address("gno","UP","india",406);
		
		User user1=new User("Varun",address1,101);
		User user2=new User("Arun", address2, 202);
		
		Items item1=new Items("Iphone","Mobile",700f);
		Items item2=new Items("Dell","Laptop",500f);
		
		bill(item1.price,item2.price,user1.bid);
	}

	static void bill (float price, float price2,int bid) {
		price=price;
		price2=price2;
		bid=bid;
		System.out.println("Total bill for Customer ID"+bid+":"+(price+price2));
	}
}

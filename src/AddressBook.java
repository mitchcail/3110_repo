import java.util.ArrayList;
import java.util.List;


public class AddressBook {

	private List<BuddyInfo> buddies;

	public AddressBook()
	{
		buddies = new ArrayList<BuddyInfo>();
	}
	public void addBuddy(BuddyInfo buddy)
	{
		buddies.add(buddy);
	}
	public void removeBuddy(BuddyInfo buddy)
	{
		buddies.remove(buddy);
	}
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo();
		AddressBook book = new AddressBook();
		buddy.setAddress("ottawa");
		buddy.setNumber("123-456-6784");
		
		book.addBuddy(buddy);
		
		System.out.println("hello " + buddy.getName() );
		
		// dsjbfa;kjba;kbjv

	}
}
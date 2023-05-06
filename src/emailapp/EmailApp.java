package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em = new Email();
		//Show the  details
		em.showInfo();
		
		System.out.println("--------------------------------------------");
		//change mailbox capacity
		em.setMaxEmailCount(900);
		System.out.println("Updated mailbox Capacity: "+em.getMaxEmailCount());
		
		//change Password
		em.changePassword("GH^m4n$3");
		System.out.println("New Password: "+em.getPassword());
		
		//add alternate email ID
		em.setAlternateEmail("jsk@company.com");
		System.out.println("Alternate Email ID: "+em.getAlternateEmail());
		

	}

}

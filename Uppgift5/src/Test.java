public class Test {

	public static void main(String[] args) {
		Account bankAccount1 = new Account();
		Account bankAccount2 = new Account();	
		
		bankAccount1.setBalance(2000.5);
		bankAccount1.setNr("123");
		bankAccount2.setBalance(5000.5);
		bankAccount2.setNr("456");
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setPnr("111111-1111");
		person1.setName("Anna");
		
		person2.setPnr("222222-2222");
		person2.setName("Peter");
		
		bankAccount1.setOwner(person1);
		bankAccount2.setOwner(person2);
		
		PersonRegister personer = new PersonRegister();
		personer.addPerson(person1);
		personer.addPerson(person2);
		
		System.out.println(bankAccount1.getOwner().getName());
		System.out.println(person2.getName());
	
		Person p = personer.findPerson("111111-1111");
			if (p != null) {
				System.out.println("Hittade: " + p.getName());
		} 
		personer.removePerson("111111-1111");
		Person a = personer.findPerson("111111-1111");
			if (a == null) {
				System.out.println("Fungerar!");
			}
		

	}

}
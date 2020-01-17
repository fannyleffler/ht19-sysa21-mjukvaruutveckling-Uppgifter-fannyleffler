
//INL 5
import java.util.ArrayList;

	public class Person {
		
		private ArrayList <Account> bankkonto = new ArrayList <Account>();
		
		private String pnr;
		private String name;
		
		public void setBankkonto(ArrayList <Account> bankkonto) {
			this.bankkonto=bankkonto;
		}
		public ArrayList <Account> getBankkonto() {
			return bankkonto;
		}
		public void setPnr(String pnr) {
			this.pnr=pnr;
			}
		public String getPnr() {
			return pnr;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void addAccount(Account a) {
				if(a.getOwner() == null) {
				bankkonto.add(a);
				a.setOwner(this);
			} 
			else if(a.getOwner()!= null) {
				System.out.println("Kontot tillhör redan en person");
			}
		}
		}
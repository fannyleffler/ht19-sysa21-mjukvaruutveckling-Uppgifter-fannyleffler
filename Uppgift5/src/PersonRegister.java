
import java.util.ArrayList;

public class PersonRegister {
	
	private ArrayList<Person> personlista = new ArrayList<Person>();
	public void setPersonlista(ArrayList<Person> personlista) {
		this.personlista = personlista;
	}
	public ArrayList<Person> getPersonlista() {
		return personlista;
	}
	public void addPerson(Person p) {
		if(p!=null)
		personlista.add(p);
	}
	public Person findPerson(String pnr) {
		if (pnr != null) {
			for (Person p : personlista) {
				if (p.getPnr().equals(pnr)) //använda equals istället för stt sätta att string = ngt...
					return p;
			}
		}return null;
	}
	public Person removePerson(String pnr) {
		if (pnr != null) {
			for (Person a : personlista) {
				if (a.getPnr().equals(pnr))
					personlista.remove(a);
			}
		}return null;
	}
}
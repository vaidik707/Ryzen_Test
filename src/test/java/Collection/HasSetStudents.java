package Collection;

import java.util.HashSet;

public class HasSetStudents {

	int id;
	String Name, City;

	public HasSetStudents(int id, String Name, String City) {

		this.id = id;
		this.City = City;
		this.Name = Name;
	}

	
	public static void main(String[] args) {
		
		HashSet<HasSetStudents> Stud =  new HashSet<HasSetStudents>();
		HasSetStudents s1 = new HasSetStudents(1, "Vaidik", "Indore");
		HasSetStudents s2 = new HasSetStudents(2, "Hardik", "Katak");
		HasSetStudents s3 = new HasSetStudents(3, "Vidhi", "Indore");

		Stud.add(s1);
		Stud.add(s2);
		Stud.add(s3);
		Stud.add(s1);

		for(HasSetStudents S : Stud) {
			System.out.println(S.id+" "+S.Name+" "+S.City);
		}
	}

}

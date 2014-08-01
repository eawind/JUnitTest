package Test;
import org.junit.Test;

import Person.Person;


public class PersonTest {

	@Test
	public void test() {
		Person shinichi = new Person();
		Person aiko = new Person();
		
		shinichi.setName("Shinichi.Kazama");
		shinichi.setAge(38);
		aiko.setInfo("Aiko.Kazama", 32);
		
		System.out.println(shinichi.getName() + ": " + shinichi.getAge() + " years old");
		System.out.println(aiko.getName() + ": " + aiko.getAge() + " years old");
	}

}

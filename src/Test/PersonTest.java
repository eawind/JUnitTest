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
		shinichi.setSex(Person.MAN);
		aiko.setInfo("Aiko.Kazama", 32, Person.Woman);
		
		System.out.println(shinichi.getName() + ": " + shinichi.getAge() + " years old: sex = " + shinichi.getSex());
		System.out.println(aiko.getName() + ": " + aiko.getAge() + " years old: sex = " + aiko.getSex());
	}

}

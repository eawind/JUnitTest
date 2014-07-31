import org.junit.Test;


public class PersonTest {

	@Test
	public void test() {
		Person shinichi = new Person();
		Person aiko = new Person();
		
		shinichi.setName("Shinichi.Kazama");
		shinichi.setAge(38);
		aiko.setInfo("Aiko.Kazama", 32);
		
		System.out.println(shinichi.getName());
		System.out.println(shinichi.getAge() + " years old");
		System.out.println(aiko.getName());
		System.out.println(aiko.getAge() + " years old");
	}

}

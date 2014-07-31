import org.junit.Test;


public class PersonTest {

	@Test
	public void test() {
		Person kazama = new Person();
		
		kazama.setName("Shinichi.Kazama");
		kazama.setAge(38);
		
		System.out.println(kazama.getName());
		System.out.println(kazama.getAge() + " years old");
	}

}

package Person;

public class Person {

	private String name;
	private int age;
	private int sex;
	
	public static final int MAN = 0;
	public static final int Woman = 1;
	
	public void setName(String string) {
		this.name = string;
		
	}

	public void setAge(int i) {
		this.age = i;
		
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setSex(int i) {
		this.sex = i;	
	}

	public void setInfo(String name, int age, int sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getSex() {
		return this.sex;
	}
}

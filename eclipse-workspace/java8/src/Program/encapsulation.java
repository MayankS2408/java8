package Program;

public class encapsulation {

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		encapsulation oops= new encapsulation();
		oops.setName("Mayank");
		oops.setName("Sharma");
		oops.setId(2);
		
		System.out.println(oops.getName());
		System.out.println(oops.getId());
	}

}

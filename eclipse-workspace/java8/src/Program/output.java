package Program;

class parent {
	String name = "parent";
}

public class output extends parent {

	String name="child";
	
	public static void main(String[] args) {
		parent p=new output();
		System.out.println(p.name);
	}
}



package Program;

public class lowertouppe {

	public static void main(String[] args) {

         String s="Mayank";
         char c='M';
         
         StringBuilder build= new StringBuilder();
          for(int i=0;i<s.length();i++) {
        	  char a= s.charAt(i);
        	  if(a==c) {
        		  build.append(Character.toLowerCase(a));
        	  } else {
        		  build.append(a);
        	  }
          }
		System.out.println(build);

	}

}

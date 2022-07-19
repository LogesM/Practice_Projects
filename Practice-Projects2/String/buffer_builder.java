public class buffer_builder {
	public static void main(String args[]) {
		//creating string
		String strs[] = { " one ", " two ", " three \n" };
		
		//string to string builder
	    StringBuilder sb = new StringBuilder();
        sb.append(" "+strs[0]);
        sb.append(" "+strs[1]);
	    sb.append(" "+strs[2]);
	    System.out.println("string to string builder");
	    System.out.println(sb.toString());
		
	    //string to string buffer
	    String a = "Hello";
	    StringBuffer buf = new StringBuffer(a);
        buf.append(", World");
        String result = buf.toString();
        System.out.println("string to string buffer");
        System.out.println("  "+result);
   }
}


import java.util.regex.*;

public class exp {

public static void main(String[] args) {

	String a = "[a-z]+";
	String b = "ApPle MaNgo";
	Pattern x = Pattern.compile(a);
	Matcher y = x.matcher(b);
	
	while (y.find()) {
		
      	System.out.println(b.substring(y.start(),y.end()));
      	
	}
  }
}

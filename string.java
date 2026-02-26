import java.util.Scanner;
public class string{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String a=sc.nextLine();
		System.out.println("Enter a string:");
		String b=sc.nextLine();

		System.out.println("String length:   "+a.length());
		System.out.println("String uppercase:   "+a.toUpperCase());
		System.out.println("String lowercase:   "+a.toLowerCase());
		String result=a.concat(b);
		System.out.println("String concat:  "+result);
		System.out.println("String trim:"+a.trim());
		System.out.println("String first character:"+b.charAt(0));
		System.out.println("string equals:"+b.equals("nourin"));
		System.out.println("Substring:"+a.contains("nazar"));
		System.out.println("index of r: "+b.indexOf("r"));
		System.out.println("extract string:"+b.substring(0,3));


	}
}

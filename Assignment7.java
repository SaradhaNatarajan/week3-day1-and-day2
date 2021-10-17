package Week3day1;
public class Assignment7 {

	public static void main(String[] args) {
		String text = "Java Exercise" ;
		int indexOfE = text.indexOf("E");
		System.out.println("string E is present in " +indexOfE);
		int indexOfS = text.indexOf("s");
		System.out.println("string E is present in " +indexOfS);
		String one="I am Learning Java" ;
		String two="I am learning java";
		if(one.equals(two)) {
			System.out.println("both are same values");
		}
		else {
			System.out.println("both are different");
		}
		
		if(one==two) {
			System.out.println("both are located in same memory loca");
		}
		else {
			System.out.println("both are different memory alloc");
		}
		if(one.equalsIgnoreCase(two)) {
			System.out.println("both are same values");
		}
		else {
			System.out.println("both are different");
		}
		String sentence = "I am working with Java8";
		String versionUpdate = sentence.replace("8", "11");
		System.out.println(versionUpdate);
		String subValue = sentence.substring(5, 14);
		System.out.println(subValue);
	}

}
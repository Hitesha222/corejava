package collectionPractice;
//Assignment42:Stringbuffer
public class stringbuffer {
	public static void main(String[] args) {
		StringBuilder ssb = new StringBuilder("Hello, world!");
		ssb.append("How are you?");
		System.out.println(ssb);
		
		//Insert the string "Java" at index 7.
		ssb.insert(7, "Java ");
		System.out.println("Ater inserting: "+ssb);
		
		//Delete characters from index 2 to index 5.
		ssb.delete(2, 5);
		System.out.println("Ater deleting: "+ssb);
		
		//Reverse the entire string
		ssb.reverse();
		System.out.println("reverse string is : "+ssb);
		
	}


}

package collectionPractice;
//practice string buffer

class PracBuffer {

	public static void main(String[] args) {

		StringBuffer bs = new StringBuffer("Ram");
		StringBuffer bs1 = new StringBuffer("Ram Sita laxman");
		StringBuffer bs2 = new StringBuffer();
		StringBuffer bs3 = new StringBuffer();

		// Methods
		System.out.println("1.Object: " + (bs == bs1)); // false-object comparision
		System.out.println("2.Object: " + bs.equals(bs1)); // false-object comparision

		System.out.println("3.Content: " + bs.toString().equals(bs1.toString()));
		System.out.println("4.Capacity: " + bs2.capacity()); // 16 initial: Old capacity=(16*2)+2 = o/p 19
		bs2.ensureCapacity(18);
		System.out.println("5.After ensuring capacity is: " + bs2.capacity());
		// 012345
		System.out.println("Charracter at 0 is: " + bs1.charAt(0));
		bs2.append("Bharat"); // Append charaSequnce method
		System.out.println("6.Reverse string object: " + bs.reverse());
		bs2.deleteCharAt(5);
		System.out.println("deleted:" + bs2);
		bs2.append(3464.56); // Append charaSequnce method
		System.out.println("7.substring: " + bs1.substring(2));
		System.out.println("7.1.substring: " + bs2.substring(2, 5)); // can throw exception outofBound

		char[] str = new char[] { 'a', 'd', 'c', 't', 'h' };
		bs3.append(str, 0, 4);
		bs2.append(bs3);
		System.out.println("!" + bs3);
		System.out.println("!!: " + bs2);
		System.out.println("Character array: " + bs1.insert(3, str));
		
		String s1="Hello";
		StringBuffer s2= new StringBuffer("Hello");
		System.out.println(s1.equals(s2));

	}
}

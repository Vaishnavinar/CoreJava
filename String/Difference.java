package String;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//immutable
		//storage:-heap and SCP memory
		//synchronized
		//thread safe
		//use when string content does not requently changed
		//eg:-username,email,gender
		String s="java";
		s.concat("programming");
		System.out.println(s);
		
		//mutable
		//storage:-heap memory
		//synchronized
		//thread safe
		//default capacity of string buffer is 16.
		//final capacity=default capacity=length of string
		//use when string content get frequently changed
		//eg.notepad,word
		StringBuffer sb=new StringBuffer("java programming");
		StringBuffer sb1=new StringBuffer("java programming");
		//sb.append("programming");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb.compareTo(sb1));
		System.out.println(sb.insert(0, 'p'));
		System.out.println(sb.replace(1, 3, "pstr"));
		System.out.println(sb);
		
		//storage
		//mutable
		//non-synchronical
		//non thread safe
		//best performance
		StringBuilder sb2=new StringBuilder("java");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.reverse());
		
		//use of intern method
		String str="java";
		String str1=new String("java");
		String str2=str1.intern();
		System.out.println(str==str2);
		
		//why char array is prefferd over string for storing password
		//1 reason
		String str3="java123";
		System.out.println(str3);
		char p[]= {'j','a','v','a','1','2','3','4'};
		System.out.println(p);
		
		
		
	}
	
	
	

}

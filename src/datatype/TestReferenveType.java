package datatype;

public class TestReferenveType {
	public static void main(String[] args) {
		// ==연산자와 !=연산자를 사용
		//1. Primitive Type의 값 비교
		int n1 =30;
		int n2 = 30;
		int n3 =50;
		System.out.println("n1==n2? "+(n1==n2));
		System.out.println("n2!=n3? "+(n2!=n3));
		
		//2. Reference Type의 주소 비교
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = new String("Java");
		String str4 = "java";
		String str5 = "java";
		
		System.out.println("str1 == str2? "+(str1 == str2));
		System.out.println("str1 != str2? "+(str1 != str2));
		System.out.println("str4 == str5? "+(str4 == str5));
		System.out.println("str3 == str4? "+(str3 == str4));
		
		//3.Reference Type인 String의 값 비교
		System.out.println("str1.contentEquals(str5) "+str1.contentEquals(str5));
		System.out.println("str1.contentEquals(str3) "+str1.contentEquals(str3));
		//대소문자 구분을 무시하고 값을 비교한다.
		System.out.println("str1.equalsIgnoreCase(str3) "+str1.equalsIgnoreCase(str3));
		
		
	}
}

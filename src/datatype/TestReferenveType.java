package datatype;

public class TestReferenveType {
	public static void main(String[] args) {
		// ==�����ڿ� !=�����ڸ� ���
		//1. Primitive Type�� �� ��
		int n1 =30;
		int n2 = 30;
		int n3 =50;
		System.out.println("n1==n2? "+(n1==n2));
		System.out.println("n2!=n3? "+(n2!=n3));
		
		//2. Reference Type�� �ּ� ��
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = new String("Java");
		String str4 = "java";
		String str5 = "java";
		
		System.out.println("str1 == str2? "+(str1 == str2));
		System.out.println("str1 != str2? "+(str1 != str2));
		System.out.println("str4 == str5? "+(str4 == str5));
		System.out.println("str3 == str4? "+(str3 == str4));
		
		//3.Reference Type�� String�� �� ��
		System.out.println("str1.contentEquals(str5) "+str1.contentEquals(str5));
		System.out.println("str1.contentEquals(str3) "+str1.contentEquals(str3));
		//��ҹ��� ������ �����ϰ� ���� ���Ѵ�.
		System.out.println("str1.equalsIgnoreCase(str3) "+str1.equalsIgnoreCase(str3));
		
		
	}
}

package bai9_TaoClassOOP;

public class RunTest {

		public static void main(String[] args) {
			ClassInOOP md1= new ClassInOOP(31,1,2024);
			ClassInOOP md2= new ClassInOOP(2,2,2024);
			ClassInOOP md3= new ClassInOOP(31,1,2024);	
		System.out.println(md1);
		System.out.println(md2);
		System.out.println("md1 == md2"  + " " + md1.equals(md2));
		System.out.println("md1 == md3" + " " + md1.equals(md3));
		System.out.println("md1 hashcode: " + " " + md1.hashCode());
		System.out.println("md3 hashcode: " + " " + md3.hashCode());
		}
}

package by.htp.hometask.branching;

import java.util.Scanner;

public class HomeworkBranching {

	public static void main(String[] args) {
		
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37();
		task38();
		task39();
		task40();
	}
	
	public static double scannerDouble() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double number;
		
		System.out.println("������� �����: \r");
		
		while(!in.hasNextDouble()) {
			
			in.next();
			
			System.out.println("������������ ����! \r");
			System.out.println("������� �����: \r");
		}
		
		number = in.nextDouble();
		
		return number;
		
	}
	
	public static int scannerInt() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int number;
		
		System.out.println("������� �����: \r");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("������������ ����!\r ");
			System.out.println("������� �����: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}
	public static String scannerString() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String symbol;
		
		System.out.println("������� ����� '�' ��� '�': \r");
		
		while(!in.hasNextLine()) {
			
			in.next();
			
			System.out.println("������������ ����! \r");
			System.out.println("������� ����� '�' ��� '�': \\r");
		}
		symbol = in.nextLine();
		
		return symbol;
	}
	public static void task01() {
		
		System.out.println("1. ��������� ��������� ��������� ���� ����� 1 � 2." + 
				"���� 1 ������ 2 � ������� �� ����� ����� 7, � ��������� ������ � ����� 8.");
		
		double a;
		double b;
		
		a = 1;
		b = 2;
		
		if(a < b) {
			
			System.out.println(a + " ������ " + b);
			System.out.println("������� 7");
		}
		else {
			
			System.out.println(a + " ������ " + b);
			System.out.println("������� 8");
		}
		System.out.println();
	}
	
	public static void task02() {
		
		System.out.println("2. ��������� ��������� ��������� ���� ����� 1 � 2." + 
				"���� 1 ������ 2 � ������� �� ����� ����� �yes�, � ��������� ������ � ����� �no� ");
		
		double a;
		double b;
		
		a = 1;
		b = 2;
		
		if(a < b) {
			
			System.out.println(a + " ������ " + b);
			System.out.println("������� YES ");
		}
		else {
			
			System.out.println(a + " ������ " + b);
			System.out.println("������� NO ");
		}
		System.out.println();
	}
	
	public static void task03() {
		
		System.out.println("3. ��������� ��������� ��������� ���������� ����� � � ����� 3.\n" + 
				"������� �� ����� ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�.");
		
		double a = scannerDouble();
		
		System.out.println("��������� ����� \r" + a);
		
		if(a < 3) {
			
			System.out.println("������� YES \r");
		}
		else {
			
			System.out.println("������� NO \r");
		}
		
		System.out.println();
		
	}
	
	public static void task04() {
		
		System.out.println("4. ��������� ���������:  ����� �� ��� ����� � � b?");
		
		double a = scannerDouble();
		double b = scannerDouble();
		
		if(a == b) {
			
			System.out.println("����� " + a + " � " + b + " ����� \r");
		}
		else {
			
			System.out.println("����� " + a + " � " + b + " �� ����� \r");
		}
		
		System.out.println();
	}
	
	public static void task05() {
		
		System.out.println("5. ��������� ���������: ����������� ����������� �� ���� ����� � � b.");
		
		double a = scannerDouble();
		double b = scannerDouble();
		
		
		if(a == b) {
			
			System.out.println("����� ����� ");
			
		}
		
		if(a < b) {
			
			System.out.println("����� " + a + " ���������� \r");
		}
		
		if(a > b) {
			
			System.out.println("����� " + b + " ���������� \r");
		}
		
		System.out.println();
	}
	
	public static void task06() {
		
		System.out.println("6. ��������� ���������: ����������� ����������� �� ���� ����� � � b.");
		
		double a = scannerDouble();
		double b = scannerDouble();
		
		
		if(a == b) {
			
			System.out.println("����� ����� ");
			
		}
		if(a > b) {
			
			System.out.println("����� " + a + " ���������� \r");
		}
		
		if(a < b) {
			
			System.out.println("����� " + b + " ���������� \r");
		}
		
		System.out.println();
	}
	
	public static void task07() {
		
		System.out.println("7. ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c"
				+ " ��� �������� ��������� a, b, c � � ");
		
		double a;
		double b;
		double c;
		double x;
		double z;
		double d;
		
		a = 5;//������������ ��������
		b = 6;//������������ ��������
		c = 7; //������������ ��������
		x = 10;//������������ ��������
		
		z = a * x * x + b * x + c;
		
		d = Math.abs(z);
		
		System.out.println("������ ��������� ����� " + d);
		
		System.out.println();
	}
	
	public static void task08() {
		
		System.out.println("8. ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.");
		
		double a = scannerDouble();
		double b = scannerDouble();
		double x;
		double y;
		
		x = Math.pow(a, 2);
		y = Math.pow(b, 2);
		
		if(x == y) {
			
			System.out.println("����� ����� ");
		}
		
		if(x < y) {
			
			System.out.println("������� ����� " + a + " ���������� \r");
		}
		
		if(x > y) {
			
			System.out.println("������� ����� " + b + " ���������� \r");
		}
		
		System.out.println();
	}
	
	public static void task09() {
		
		System.out.println("9.  ���������  ���������,  �������  ���������  ��  ����  ���������  ��������," +
				"��������  ��  ������  ����������� ��������������.");
		
		double a = scannerDouble();
		double b = scannerDouble();
		double c = scannerDouble();
		
		if (a == b && b == c) {
			
			System.out.println("����������� �������������� ");
		}
		else {
			
			System.out.println("����������� �� �������������� ");
		}
		
		System.out.println();
	}
	
	public static void task10() {
		
		System.out.println("10. ��������� ���������, ������� ��������� ������� ������ ����� ������\n");
		System.out.println("������� ������ ����� ");
		
		double r1 = scannerDouble();
		double r2 = scannerDouble();
		double s1;
		double s2;
		
		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);
		
		if(s1 < s2) {
			
			System.out.println("������� ������� ����� ������ � ���������� " + s1);
		}
		else {
			
			System.out.println("������� ������� ����� ������ � ���������� " + s2);
		}
		
		System.out.println();
		
	}
	
	public static void task11() {
		
		System.out.println("11. ��������� ���������, ������� ��������� ������� ������ ������������ ������.\n");
		System.out.println("������� ��������� � ������ ��� ������� ������������ ");
		
		double a1 = scannerDouble();//��������� ������������
		double h1 = scannerDouble();//������ ������������
		double a2 = scannerDouble();//��������� ������������
		double h2 = scannerDouble();//������ ������������
		double s1;
		double s2;
		
		s1 = (a1 * h1) / 2;
		s2 = (a2 * h2) / 2;
		
		if(s1 > s2) {
			
			System.out.println("������� ������� ������������ ������ � ���������� " + s1);
		}
		else {
			
			System.out.println("������� ������� ������������ ������ � ���������� " + s2);
		}
		
		System.out.println();
	}
	
	public static void task12() {
		
		System.out.println("12. ���� ��� �������������� �����. �������� � ������� �� �� ���, "
				+ "�������� ������� ��������������, � � ��������� ������� � �������������.");
		
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		
		a = 12;//������������ ��������
		b = 9;//������������ ��������
		c = -7;//������������ ��������
		
		if(a > 0) {
			
			x  = Math.pow(a, 2);
			
			System.out.println(a + " � �������� ����� " + x);
		}
		else {
			
			x = Math.pow(a, 4);
			
			System.out.println(a + " � ���������� ������� ����� " + x);
		}
		
		if(b > 0) {
			
			y  = Math.pow(b, 2);
			
			System.out.println(b + " � �������� ����� " + y);
		}
		else {
			
			y = Math.pow(b, 4);
			
			System.out.println(b + " � ���������� ������� ����� " + y);
		}
		
		if(c > 0) {
			
			z  = Math.pow(c, 2);
			
			System.out.println(c + " � �������� ����� " + z);
		}
		else {
			
			z = Math.pow(c, 4);
			
			System.out.println(c + " � ���������� ������� ����� " + z);
		}
		
		System.out.println();
	}
	
	public static void task13() {
		
		System.out.println("13. ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������,"
				+ " ������� �� ����� ��������� ����� ������ ���������.");
		
		double x1;//���������� � ����� �
		double y1;//���������� � ����� �
		double x2;//���������� x ����� B
		double y2;//���������� y ����� B
		double d1;//����� �
		double d2;//����� �
		
		x1 = 1;//������������ ��������
		y1 = 2;//������������ ��������
		
		x2 = 2;//������������ ��������
		y2 = 3;//������������ ��������
		
		d1 = (Math.pow(x1, 2)) + Math.pow(y1, 2);
		d2 = (Math.pow(x2, 2)) + Math.pow(y2, 2);
		
		if(d1 == d2) {
			
			System.out.println("����� � � � ���������!");
		}
		
		if(d1 < d2) {
			
			System.out.println("����� A ��������� ����� � ������ ���������");
		}
		else {
			
			System.out.println("����� B ��������� ����� � ������ ���������");
		}
		System.out.println();
	}
	
	public static void task14() {
		
		System.out.println("14. ���� ��� ���� ������������ (� ��������). ����������, ���������� �� �����"
				+ " �����������, � ���� ��, �� ����� �� �� �������������. ");
		
		double a;//�������� ���� ������������
		double b;//�������� ���� ������������
		double c;
		
		a = 45;//������������ ��������
		b = 120;//������������ ��������
		
		c = a + b;
		
		if(c > 0 && c < 180) {
			
			System.out.println("����� ������������� ���������� ");
			
			if(a == 90 || b == 90) {
			
				System.out.println(" � �� �������������!");
			}
			else {
				
				System.out.println(" �� �� �������������!");
			}
		}
		else {
				
			System.out.println("������ ������������ �� ����������!");
			
		}
		
		System.out.println();
		
	}
	
	public static void task15() {
		
		System.out.println("15. ���� �������������� ����� � � �, �� ������ ���� �����. "
				+ "������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������. ");
		
		double x;
		double y;
		double s;//�����
		double z;//������������
		
		x = 2;//������������ ��������
		y = 3;//������������ ��������
		
		s = x + y;
		z = x * y;
		
		if(x == y) {
			
			System.out.println("X � Y �� ����� ���� �����!!!");
		}
		else {
			if(x < y) {
				
				x = s / 2;
				y = z * 2;
				
			}
			else {
				
				y = s / 2;
				x = z * 2;
				
			}
			
		System.out.println("�������� � " + x + "�������� Y " + y);
		
		}
		
		System.out.println();
	}
	
	public static void task16() {
		
		System.out.println("16. �� ��������� ��Y ������ ������ ������������ ����� �. "
				+ "�������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����).");
		
		double x;
		double y;
		
		x = 2;//������������ ��������
		y = 4;//������������ ��������
		
		if(x < 0 && y > 0) {
			
			System.out.println("����� � ����������� � 2 ������������ ����");
		}
		
		if(x < 0 && y <0 ) {
			
			System.out.println("����� � ����������� � 3 ������������ ����");
		}
		
		if(x > 0 && y > 0) {
			
			System.out.println("����� � ����������� � 1 ������������ ����");
		}
		
		if(x > 0 && y < 0) {
			
			System.out.println("����� � ����������� � 4 ������������ ����");
		}
		if(x == 0) {
			
			System.out.println("����� � ����������� �� ��� OY");
		}
		if(y == 0) {
			
			System.out.println("����� � ����������� �� ��� OX");
		}
		
		System.out.println();
	}
	
	public static void task17() {
		
		System.out.println("17. ���� ����� ����� m � n. ���� ����� �� �����, �� �������� ������ �� ���"
				+ " ����� � ��� �� ������, ������ �������� �� ��������, � ���� �����, �� ��������"
				+ " ����� ������. ");
		
		int m;
		int n;
		
		m = 2;//������������ ��������
		n = 3;//������������ ��������
		
		System.out.println("���� ����� m " + m + " �  n " + n);
		
		if(m == n) {
			
			m = 0;
			n = 0;
			
			System.out.println("����� ����� ������� m = " + m + " � n = " + n);
		}
		else {
			
			if(m < n) {
				
				m = n;
			}
			else {
				
				n = m;
			}
		System.out.println("����� m � n ����� �������������� " + m + " " + n);
		}
		System.out.println();
	}
	
	public static void task18() {
		
		System.out.println("18. ���������� ���������� ������������� ����� ����� �, b, �.");
		
		double a;
		double b;
		double c;
		int x;
		int y;
		int z;
		int s;//����������� ������������� �����
		
		a = 12;//������������ ��������
		b = -11;//������������ ��������
		c = -3;//������������ ��������
		
		if(a < 0) {
			x = 1;
		}
		else {
			x = 0;
		}
		if(b < 0) {
			
			y = 1;
		}
		else {
			y = 0;
		}
		if(c < 0) {
			z = 1;
		}
		else {
			z = 0;
		}
		s = x + y + z;
		
		System.out.println("���������� ������������� ����� ����� " + s);
		
		System.out.println();
	} 
	
	public static void task19() {
		
		System.out.println("19. ���������� ���������� ������������� ����� ����� �, b, �.");
		
		double a;
		double b;
		double c;
		int x;
		int y;
		int z;
		int s;//����������� ������������� �����
		
		a = 12;//������������ ��������
		b = 11;//������������ ��������
		c = -3;//������������ ��������
		
		if(a > 0) {
			x = 1;
		}
		else {
			x = 0;
		}
		if(b > 0) {
			
			y = 1;
		}
		else {
			y = 0;
		}
		if(c > 0) {
			z = 1;
		}
		else {
			z = 0;
		}
		s = x + y + z;
		
		System.out.println("���������� ������������� ����� ����� " + s);
		
		System.out.println();
	}
	
	public static void task20() {
		
		System.out.println("20. ����������, ��������� ����� ����� �, b, � �������� ����� k.");
		
		double a;
		double b;
		double c;
		double k;
		
		a = 12;//������������ ��������
		b = 10;//������������ ��������
		c = 18;//������������ ��������
		k = 4;//������������ ��������
		
		if(a % k == 0) {
			
			System.out.println("����� k �������� ��������� ����� a");
		}
		else {
			
			System.out.println("����� k �� �������� ��������� ����� a");
		}
		if(b % k == 0) {
			
			System.out.println("����� k �������� ��������� ����� b");
		}
		else {
			
			System.out.println("����� k �� �������� ��������� ����� b");
		}
		if(c % k == 0) {
			
			System.out.println("����� k �������� ��������� ����� c");
		}
		else {
			
			System.out.println("����� k �� �������� ��������� ����� c");
		}
		
		System.out.println();
	}
	
	public static void task21() {
		
		System.out.println("21. ���������  �  ������.  ��  ������  �������������  ������  ����  ��:  ������� "
				+ " ���  �������? �����  �  ���  ̻.  � ����������� �� ������ �� ������ ������ ��������� ����� "
				+ "���� �������� �������!� ��� ���� �������� ��������!�. ");
		
		System.out.println("��� ��: ������� ��� �������? ����� � ��� �");
		
		String c = scannerString();
		
		switch(c) {
			case "�":
				System.out.println("��� �������� �������!");
				break;
			case "�":
				System.out.println("��� �������� ��������!");
				break;
			default:
				System.out.println("�� ����� �� ���������� �����!");
		}
		
		System.out.println();
	}
	
	public static void task22() {
		
		System.out.println("22. ���������������� �������� ���������� � � � ���,"
				+ " ����� � � ��������� ������� �� ���� ��������, � � y - �������.");
		
		double x;
		double y;
		
		x = 5;//������������ ��������
		y = 7;//������������ ��������
		
		if(x == y) {
			
			System.out.println("�������� � � Y �����");
		}
		
		if(x > y) {
			
			System.out.println("�������� � ����� " + x + "�������� � ����� " + y);
		
		}
		if(x < y) {
			
			double y1 = x;
			x = y;
			
			System.out.println("�������� � ����� " + x + " �������� � ����� " + y1);
		}
		
		System.out.println();
	}
	
	public static void task23() {
		
		System.out.println("23. ���������� ������������ ����, ��������� � ���������� "
				+ "(����� � �� 1 �� 31, ����� � �� 1 �� 12). ���� ������� \r\n" + 
				"������������ ������, �� �������� �� ����. ");
		
		int a = scannerInt();
		int b = scannerInt();
		
		if(a > 31 && a < 1) {
			System.out.println("�� ����� �� ���������� �����");
		}
		else {
			System.out.println("����� ������� ���������");
		}
		
		if(b > 12 && b < 1) {
			System.out.println("�� ����� �� ���������� �����");
		}
		else {
			System.out.println("����� ������ ���������");
		}
		
		System.out.println();
	}
	
	public static void task24() {
		
		System.out.println("24. ��������� ���������, ������������ ��������� ������� �� ������� � "
				+ "�������� �����, ���� �� �������� ������ ���������� ��������� n.");
		
		int n;
		
		n = 10;//������������ ��������
		
		int i = 1;
		
		while(i < n) {
			
			if(i % 2 == 0) {
				
				System.out.println("�� �����");
			}
			else {
				System.out.println("�����");
			}
			
			i++;
		}
		
		System.out.println();
		
	}
	
	public static void task25() {
		
		System.out.println("25.  ��������  ���������  �  ������  �������  ���������  �������  �  ���������,"
				+ "  �������  �������  ��������� �������������� �������� �, ���� ����������� � �������"
				+ "��������� 60� �.");
		
		double t;
		
		t = 68;//������������ ��������
		
		if(t > 60) {
			
			System.out.println("�������� ��������!!!");
		}
		else {
			
			System.out.println("�������� ���������� � �����");
		}
		
		System.out.println();
	}
	
	public static void task26() {
		
		System.out.println("26. �������� ��������� ���������� ����� �������� � �������� �� ���� �����.");
		
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		double d;
		double s;
		
		a = 21;//������������ ��������
		b = 56;//������������ ��������
		c = 20;//������������ ��������
		
		/*��� ��������� � Math.max()
		 * if(a > b){  
		 * 	x = b;
		 * }
		 * else{
		 * 	x = a;
		 * }
		 * if(x > c){
		 * 	y = x;
		 * }
		 * else{
		 * 	y = c;
		 * }
		 * if(a < b){
		 * 	z = a;
		 * }
		 * else{
		 * 	z = b;
		 * }
		 * if(z < c){
		 * 	d = z;
		 * }
		 * else{
		 * 	d = c;
		 * }
		 * 
		 * s = y + d;
		 * 
		 * System.out.println("����� ����������� � ����������� ����� �� ���� ����� " + s);
		 * 
		 */
		
		x = Math.max(a, b);
		y = Math.max(x, c);//���������� �������� ���� �����
		
		z = Math.min(a, b);
		d = Math.min(z, c);//���������� �������� ���� �����
		
		s = y + d;//����� ����������� � ����������� �����
		
		System.out.println("����� ����������� � ����������� ����� �� ���� ����� " + s);
		
		System.out.println();
	}
	
	public static void task27() {
		
		System.out.println("27. ����� max{min(a, b), min(c, d)}.");
		
		double a;
		double b;
		double c;
		double d;
		double x;
		double y;
		double z;
		
		a= 12;//������������ ��������
		b = 56;//������������ ��������
		c = 87;//������������ ��������
		d = 9;//������������ ��������
		
		/* ��� Math.max() � Math.min()
		 * if(a < b){
		 * 	x = a;
		 * }
		 * else{
		 * 	x = b;
		 * }
		 * if(c < d){
		 * 	y = c;
		 * }
		 * else{
		 * 	y = d;
		 * }
		 * if(x > y){
		 * 	z = x;
		 * }
		 * else{
		 * 	z =  y;
		 * }
		 * 
		 * System.out.println("Max{min( " + a + ", " + b + "), min(" + c + ", " + d + ") }. ����� " + z);
		 * 
		 */
		
		x = Math.min(a, b);
		y = Math.min(c, d);
		z = Math.max(x, y);
		
		System.out.println("Max{min( " + a + ", " + b + "), min(" + c + ", " + d + ") }. ����� " + z);
		
		System.out.println();
		
	}
	
	public static void task28() {
		
		System.out.println("28. ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. "
				+ "���� �� ���� �� ����� d, �� ����� max(d � a, d � b, d � c).");
		
		double a;
		double b;
		double c;
		double d;
		double x;
		double y;
		double z;
		
		a = 11;//������������ ��������
		b = 9;//������������ ��������
		c = 5;//������������ ��������
		d = 12;//������������ ��������
		
		if(a == d || b == d || c == d) {
			
			if(a == d) {
				
				System.out.println(" a ����� d");
			}
			if(b == d) {
				
				System.out.println(" b ����� d");
			}
			if(c == d) {
				
				System.out.println(" c ����� d");
			}
		}
		else {
			x = d - a;
			y = d - b;
			z = d - c;
			
			double s;
			double q;
			
			if(x > y){  
				s = x;
			}
			else{
				s = y;
			}
			if(s > z){
				q = s;
			}
			else{
				q = z;
			}
			
			System.out.println("max(d � a, d � b, d � c) ����� " + q);
		}
		
		System.out.println();
		
	}
	
	public static void task29() {
		
		System.out.println("29. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). "
				+ "����������, ����� �� ��� ����������� �� ����� ������.");
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		x1 = 10;//������������ ��������
		x2 = 12;//������������ ��������
		x3 = 10;//������������ ��������
		y1 = 5;//������������ ��������
		y2 = 2;//������������ ��������
		y3 = 10;//������������ ��������
		
		if((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
			
			System.out.println("����� �(�1,�1), �(�2,�2) � �(�3,�3) ����������� �� ����� ������.");
		}
		else {
			
			System.out.println("����� �(�1,�1), �(�2,�2) � �(�3,�3) �� ����������� �� ����� ������.");
		}
		
		System.out.println();
	}
	
	public static void task30() {
		
		System.out.println("30. ���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �,"
				+ " � �������� �� ����������� ����������, ���� ��� �� ���.");
		
		double a;
		double b;
		double c;
		
		a = -12;//������������ ��������
		b = 10;//������������ ��������
		c = 5;//������������ ��������
		
		if(a > b && b > c){  
			
			a = a * 2;
			b = b * 2;
			c = c * 2;
		}
		else{
			
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		
		System.out.println("�������� a,b � c ����� �������������� " + a + " " + b + " " + c);
		
		System.out.println();
	
	}
	
	public static void task31() {
		
		System.out.println("31. ������ ������� �, � �������������� ��������� � ������� �, �, z �������."
				+ " ����������, ������� �� ������ ����� ���������.");
		
		double a;//������� ���������
		double b;//������� ���������
		double x;//����� �������
		double y;//����� �������
		double z;//����� �������
		double s;//�������� ���������
		double s1;//������� ����� ������� �������
		double s2;//������� ������ ������� �������
		double s3;//������� ������� ������� �������
		
		a = 10;//������������ ��������
		b = 20;//������������ ��������
		x = 2;//������������ ��������
		y = 5;//������������ ��������
		z = 1;//������������ ��������
		
		s = a * b;
		s1 = x * y;
		s2 = x * z;
		s3 = y * z;
		
		if(s > s1 && s > s2 && s > s3) {
			
			System.out.println("������ ������� � ��������� ��");
		}
		else {
			
			System.out.println("������ �� ������� � ��������� ��");
		}
		System.out.println();
	}
	
	public static void task32() {
		
		System.out.println("32. �������� ���������, ������� �� �������� ���� ������ ����������, "
				+ "�������� �� ����� �����-���� ���� �� ��� �������������.");
		
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		
		a = 12;//������������ ��������
		b = 5;//������������ ��������
		c = -15;//������������ ��������
		
		x = a + b;
		y = a + c;
		z = b + c;
		
		if(x > 0 || y > 0 || z > 0) {
			
			System.out.println("����� �����-���� ���� ����� ������������");
		}
		else {
			
			System.out.println("��� ����� ����� ������� ������������");
		}
		System.out.println();
	} 
	
	public static void task33() {
		
		System.out.println("33. �������� ���������, ������� �� ������ ����� ���������� ������� "
				+ "������� ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������"
				+ " ����� �������, �������� �� ��� ������ �� ������� �������. ��� ����� ��������� ������:"
				+ " 9583, 1747 � �������� ������ ��� �, �, �; "
				+ " 3331, 7922 � �������� ������ ��� �, �;"
				+ " 9455, 8997 � �������� ������ ���� �.");
		
		double x = 9583;//
		double y = 1747;//
		double z = 3331;//
		double a = 7922;//
		double b = 9455;//
		double c = 8997;//
		double s;// ������ ������� ���� ���������
		
		s = 9583;
		
		if(s == x || s == y) {
			
			System.out.println("��� �������� ������ ��� �, �, �");
		}
		if(s == z || s == a) {
			
			System.out.println("��� �������� ������ ��� �, �");
		}
		if(s == b || s == c) {
			
			System.out.println("��� �������� ������ �");
		} 
		if (s != x && s != y && s != z && s != a && s != b && s != c) {
			
			System.out.println("� ��� ��� ������� � ����������!");
			
		}
		
		System.out.println();
	}
	
	public static void task34() {
		
		System.out.println("34.  ���������  ���������,  �����������  ������  ����������  ���������� "
				+ " �  �������  ��������.  ��������� �����������  ���������  ����,  �����  �����, "
				+ " ���������  �����������;  ����  �����  ��  ���������,  ��������  ��  ������ "
				+ "��������; ���� ����� ������� ������, ��� ����������, �� �������� ��������� �����"
				+ " � ��������� ����� �����; ���� \r\n" + 
				"����� ������������, �� �������� ��������� �� ���� � ��������� ������ ����������� �����.");
		
		double x;//��������� �����
		double y;//���������� ����� ���������� �� ����������
		double a;//�����
		double b;//���������
		
		System.out.println("������ ��������� �����:");
		
		x = scannerDouble();
		
		System.out.println("������� ����� ����� ���������� �� ����������:");
		
		y = scannerDouble();
		
		if(x == y) {
			
			System.out.println("�������!");
		}
		if(x < y) {
			
			a = y - x;
			
			System.out.println("�������� ����� " + a);
		}
		if(x > y) {
			b = x - y;
			System.out.println("��������� " + b);
		}
		
		System.out.println();
	}
	
	public static void task35() {
		
		System.out.println("35. ��������� ����� � ����� � ������������ ���� �� ������ ���.");
		
		double x;
		
		x = 156;//������������ ��������
		
		System.out.println("�� ����� " + x + " ����, ��� �������������\n");
		
		if(x > 0 && x <= 59) {
			
			if(x <= 31) {
				
				System.out.println( x + "������");
			}
			if(x > 31 && x <= 59) {
				
				x = x - 31;
				
				System.out.println( x + "�������");
			} 
		}
		if(x > 59 && x <= 151) {
			
			x = x - 59;
			
			if(x <= 31) {
				
				System.out.println( x + "�����");
			}
			if(x > 31 && x <= 61) {
				
				x = x - 31;
				
				System.out.println(x + " ������" );
			}
			if(x > 61 && x <= 92) {
				
				x = x - 61;
				
				System.out.println(x + " ���" );
			}
		}
		if(x > 151 && x <= 243) {
			
			x = x - 151;
			
			if(x <= 30) {
				
				System.out.println(x + " ����");
			}
			if(x > 30 && x <= 61) {
				
				x = x - 30;
				
				System.out.println(x + " ����" );
			}
			if(x > 61 && x <= 92) {
				
				x = x - 61;
				
				System.out.println(x + " �������" );
			}
		}
		if(x > 243 && x <= 334) {
			
			x = x - 243;
			
			if(x <= 30) {
				
				System.out.println(x + " ��������" );
			}
			if(x > 30 && x <= 61) {
				
				x = x - 30;
				
				System.out.println(x + " �������" );
			}
			if(x > 61 && x <= 91) {
				
				x = x - 61;
				
				System.out.println(x + " ������" );
			}
		}
		if(x > 334 && x <= 365) {
			
			x = x - 334;
			
			System.out.println(x + " �������" );
			
		}
		
		System.out.println();
	}
	
	public static void task36() {
		
		System.out.println("36. ��������� �������� �������: F(x) = x^2 - 3x + 9, ���� � <= 3 � F(x) = 1 / (x^3 + 6), ���� x > 3 ");
		
		double x;
		double y;
		
		x = 4;//������������ ��������
		
		if(x <= 3) {
			
			y = Math.pow(x, 2) -  (3 * x) + 9;
			
			System.out.println("�������� ������� ��� x <= 3 ����� " + y);
		}
		if(x > 3) {
			
			y = 1 / (Math.pow(x, 3) + 6);
			
			System.out.println("�������� ������� ��� x > 3 ����� " + y);
		}
		
		System.out.println();
	}
	
	public static void task37() {
		
		System.out.println("37. ��������� �������� �������: F(x) = - x^2 + 3x + 9, ���� x >= 3 � F(x) = 1 / (x^3 - 6), ���� x < 3.");
		
		double x;
		double y;
		
		x = 5;//������������ ��������
		
		if(x >= 3) {
			
			y = - Math.pow(x, 2) + 3 * x + 9;
			
			System.out.println("�������� ������� F(x) = - x^2 + 3x + 9 ��� x >= 3 ����� " + y);
		}
		if(x < 3) {
			
			y = 1 / (Math.pow(x, 3) - 6);
			
			System.out.println("�������� ������� F(x) = 1 / (x^3 - 6) ��� x < 3 ����� " + y);
			
		}
		
		System.out.println();
	}
	
	public static void task38() {
		
		System.out.println("38. ��������� �������� �������: F(x) = x^2, ���� 0 <= x <= 3 � F(x) = 4, ���� x > 3, x < 0. ");
		
		double x;
		double y;
		
		x = 12;//������������ ��������
		
		if(x >= 0 && x <= 3) {
			
			y = Math.pow(x, 2);
			
			System.out.println("�������� ������� F(x) = x^2 ��� 0 <= x <= 3 ����� " + y);
		}
		if(x > 3 && x < 0) {
			
			y = 4;
			
			System.out.println("�������� ������� F(x) = " + y);
			
		}
		System.out.println();
	}
	
	public static void task39() {
		
		System.out.println("39. ��������� �������� �������: F(x) = - x^2 + x - 9, ���� x >= 8 � F(x) = 1 / (x^4 - 6), ���� x < 8.");
		
		double x;
		double y;
		
		x = 10;//������������ ��������
		
		if(x >= 8) {
			
			y = - Math.pow(x, 2) + x - 9;
			
			System.out.println("�������� ������� F(x) = -x^2 + x - 9 ��� x >= 8 ����� " + y);
		}
		if(x < 8) {
			
			y = 1 / (Math.pow(x, 4) - 6);
			
			System.out.println("�������� ������� F(x) = 1 / x^4 - 6 ��� x < 8 ����� " + y);
		}
		
		System.out.println();
	}
	
	public static void task40() {
		
		System.out.println("40. ��������� �������� �������: F(x) = - x^3 + 9, ���� x <= 13 � F(x) = - 3 / x + 1, ���� x > 13.");
		
		double x;
		double y;
		
		x = 5;//������������ ��������
		
		if(x <= 13) {
			
			y = - Math.pow(x, 3) + 9;
			
			System.out.println("�������� ������� F(x) = - x^3 + 9 ��� x <= 13 ����� " + y);
		}
		
		if(x > 13) {
			
			y = -(3 / (x + 1));
			
			System.out.println("�������� ������� F(x) = - 3 / x + 1 ��� x > 13 ����� " + y);
		}
		
		System.out.println();
	}
	
}

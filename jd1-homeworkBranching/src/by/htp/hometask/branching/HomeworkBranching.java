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
		
		System.out.println("Введите число: \r");
		
		while(!in.hasNextDouble()) {
			
			in.next();
			
			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите число: \r");
		}
		
		number = in.nextDouble();
		
		return number;
		
	}
	
	public static int scannerInt() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int number;
		
		System.out.println("Введите число: \r");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}
	public static String scannerString() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String symbol;
		
		System.out.println("Введите букву 'М' или 'Д': \r");
		
		while(!in.hasNextLine()) {
			
			in.next();
			
			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите букву 'М' или 'Д': \\r");
		}
		symbol = in.nextLine();
		
		return symbol;
	}
	public static void task01() {
		
		System.out.println("1. Составить программу сравнения двух чисел 1 и 2." + 
				"Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.");
		
		double a;
		double b;
		
		a = 1;
		b = 2;
		
		if(a < b) {
			
			System.out.println(a + " меньше " + b);
			System.out.println("Выводим 7");
		}
		else {
			
			System.out.println(a + " больше " + b);
			System.out.println("Выводим 8");
		}
		System.out.println();
	}
	
	public static void task02() {
		
		System.out.println("2. Составить программу сравнения двух чисел 1 и 2." + 
				"Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no» ");
		
		double a;
		double b;
		
		a = 1;
		b = 2;
		
		if(a < b) {
			
			System.out.println(a + " меньше " + b);
			System.out.println("Выводим YES ");
		}
		else {
			
			System.out.println(a + " больше " + b);
			System.out.println("Выводим NO ");
		}
		System.out.println();
	}
	
	public static void task03() {
		
		System.out.println("3. Составить программу сравнения введенного числа а и цифры 3.\n" + 
				"Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».");
		
		double a = scannerDouble();
		
		System.out.println("Введенное число \r" + a);
		
		if(a < 3) {
			
			System.out.println("Выводим YES \r");
		}
		else {
			
			System.out.println("Выводим NO \r");
		}
		
		System.out.println();
		
	}
	
	public static void task04() {
		
		System.out.println("4. Составить программу:  равны ли два числа а и b?");
		
		double a = scannerDouble();
		double b = scannerDouble();
		
		if(a == b) {
			
			System.out.println("Числа " + a + " и " + b + " равны \r");
		}
		else {
			
			System.out.println("Числа " + a + " и " + b + " не равны \r");
		}
		
		System.out.println();
	}
	
	public static void task05() {
		
		System.out.println("5. Составить программу: определения наименьшего из двух чисел а и b.");
		
		double a = scannerDouble();
		double b = scannerDouble();
		
		
		if(a == b) {
			
			System.out.println("Числа равны ");
			
		}
		
		if(a < b) {
			
			System.out.println("Число " + a + " наименьшее \r");
		}
		
		if(a > b) {
			
			System.out.println("Число " + b + " наименьшее \r");
		}
		
		System.out.println();
	}
	
	public static void task06() {
		
		System.out.println("6. Составить программу: определения наибольшего из двух чисел а и b.");
		
		double a = scannerDouble();
		double b = scannerDouble();
		
		
		if(a == b) {
			
			System.out.println("Числа равны ");
			
		}
		if(a > b) {
			
			System.out.println("Число " + a + " наибольшее \r");
		}
		
		if(a < b) {
			
			System.out.println("Число " + b + " наибольшее \r");
		}
		
		System.out.println();
	}
	
	public static void task07() {
		
		System.out.println("7. Составить программу нахождения модуля выражения a*x*x + b*x + c"
				+ " при заданных значениях a, b, c и х ");
		
		double a;
		double b;
		double c;
		double x;
		double z;
		double d;
		
		a = 5;//произвольное значение
		b = 6;//произвольное значение
		c = 7; //произвольное значение
		x = 10;//произвольное значение
		
		z = a * x * x + b * x + c;
		
		d = Math.abs(z);
		
		System.out.println("Модуль выражения равен " + d);
		
		System.out.println();
	}
	
	public static void task08() {
		
		System.out.println("8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.");
		
		double a = scannerDouble();
		double b = scannerDouble();
		double x;
		double y;
		
		x = Math.pow(a, 2);
		y = Math.pow(b, 2);
		
		if(x == y) {
			
			System.out.println("Числа равны ");
		}
		
		if(x < y) {
			
			System.out.println("Квадрат числа " + a + " наименьший \r");
		}
		
		if(x > y) {
			
			System.out.println("Квадрат числа " + b + " наименьший \r");
		}
		
		System.out.println();
	}
	
	public static void task09() {
		
		System.out.println("9.  Составить  программу,  которая  определит  по  трем  введенным  сторонам," +
				"является  ли  данный  треугольник равносторонним.");
		
		double a = scannerDouble();
		double b = scannerDouble();
		double c = scannerDouble();
		
		if (a == b && b == c) {
			
			System.out.println("Треугольник равносторонний ");
		}
		else {
			
			System.out.println("Треугольник не равносторонний ");
		}
		
		System.out.println();
	}
	
	public static void task10() {
		
		System.out.println("10. Составить программу, которая определит площадь какого круга меньше\n");
		System.out.println("Введите радиус круга ");
		
		double r1 = scannerDouble();
		double r2 = scannerDouble();
		double s1;
		double s2;
		
		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);
		
		if(s1 < s2) {
			
			System.out.println("Площадь первого круга меньше и составляет " + s1);
		}
		else {
			
			System.out.println("Площадь второго круга меньше и составляет " + s2);
		}
		
		System.out.println();
		
	}
	
	public static void task11() {
		
		System.out.println("11. Составить программу, которая определит площадь какого треугольника больше.\n");
		System.out.println("Введите основание и высоту для каждого треугольника ");
		
		double a1 = scannerDouble();//основание треугольника
		double h1 = scannerDouble();//высота треугольника
		double a2 = scannerDouble();//основание треугольника
		double h2 = scannerDouble();//высота треугольника
		double s1;
		double s2;
		
		s1 = (a1 * h1) / 2;
		s2 = (a2 * h2) / 2;
		
		if(s1 > s2) {
			
			System.out.println("Площадь первого треугольника больше и составляет " + s1);
		}
		else {
			
			System.out.println("Площадь второго треугольника больше и составляет " + s2);
		}
		
		System.out.println();
	}
	
	public static void task12() {
		
		System.out.println("12. Даны три действительных числа. Возвести в квадрат те из них, "
				+ "значения которых неотрицательны, и в четвертую степень — отрицательные.");
		
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		
		a = 12;//произвольное значение
		b = 9;//произвольное значение
		c = -7;//произвольное значение
		
		if(a > 0) {
			
			x  = Math.pow(a, 2);
			
			System.out.println(a + " в квадрате равно " + x);
		}
		else {
			
			x = Math.pow(a, 4);
			
			System.out.println(a + " в четвевртой степени равно " + x);
		}
		
		if(b > 0) {
			
			y  = Math.pow(b, 2);
			
			System.out.println(b + " в квадрате равно " + y);
		}
		else {
			
			y = Math.pow(b, 4);
			
			System.out.println(b + " в четвевртой степени равно " + y);
		}
		
		if(c > 0) {
			
			z  = Math.pow(c, 2);
			
			System.out.println(c + " в квадрате равно " + z);
		}
		else {
			
			z = Math.pow(c, 4);
			
			System.out.println(c + " в четвевртой степени равно " + z);
		}
		
		System.out.println();
	}
	
	public static void task13() {
		
		System.out.println("13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,"
				+ " которая из точек находится ближе началу координат.");
		
		double x1;//координата х точки А
		double y1;//координата у точки А
		double x2;//координата x точки B
		double y2;//координата y точки B
		double d1;//точка А
		double d2;//точка В
		
		x1 = 1;//произвольное значение
		y1 = 2;//произвольное значение
		
		x2 = 2;//произвольное значение
		y2 = 3;//произвольное значение
		
		d1 = (Math.pow(x1, 2)) + Math.pow(y1, 2);
		d2 = (Math.pow(x2, 2)) + Math.pow(y2, 2);
		
		if(d1 == d2) {
			
			System.out.println("Точки А и В совпадают!");
		}
		
		if(d1 < d2) {
			
			System.out.println("Точка A находится ближе к началу координат");
		}
		else {
			
			System.out.println("Точка B находится ближе к началу координат");
		}
		System.out.println();
	}
	
	public static void task14() {
		
		System.out.println("14. Даны два угла треугольника (в градусах). Определить, существует ли такой"
				+ " треугольник, и если да, то будет ли он прямоугольным. ");
		
		double a;//заданный угол треугольника
		double b;//заданный угол треугольника
		double c;
		
		a = 45;//произвольное значение
		b = 120;//произвольное значение
		
		c = a + b;
		
		if(c > 0 && c < 180) {
			
			System.out.println("Такой прямоугольник существует ");
			
			if(a == 90 || b == 90) {
			
				System.out.println(" и он прямоугольный!");
			}
			else {
				
				System.out.println(" он не прямоугольный!");
			}
		}
		else {
				
			System.out.println("Такого треугольника не существует!");
			
		}
		
		System.out.println();
		
	}
	
	public static void task15() {
		
		System.out.println("15. Даны действительные числа х и у, не равные друг другу. "
				+ "Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением. ");
		
		double x;
		double y;
		double s;//сумма
		double z;//произведение
		
		x = 2;//произвольное значение
		y = 3;//произвольное значение
		
		s = x + y;
		z = x * y;
		
		if(x == y) {
			
			System.out.println("X и Y не могут быть равны!!!");
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
			
		System.out.println("Значение Х " + x + "Значение Y " + y);
		
		}
		
		System.out.println();
	}
	
	public static void task16() {
		
		System.out.println("16. На плоскости ХОY задана своими координатами точка А. "
				+ "Указать, где она расположена (на какой оси или в каком координатном угле).");
		
		double x;
		double y;
		
		x = 2;//произвольное значение
		y = 4;//произвольное значение
		
		if(x < 0 && y > 0) {
			
			System.out.println("Точка А расположена в 2 координатном угле");
		}
		
		if(x < 0 && y <0 ) {
			
			System.out.println("Точка А расположена в 3 координатном угле");
		}
		
		if(x > 0 && y > 0) {
			
			System.out.println("Точка А расположена в 1 координатном угле");
		}
		
		if(x > 0 && y < 0) {
			
			System.out.println("Точка А расположена в 4 координатном угле");
		}
		if(x == 0) {
			
			System.out.println("Точка А расположена на оси OY");
		}
		if(y == 0) {
			
			System.out.println("Точка А расположена на оси OX");
		}
		
		System.out.println();
	}
	
	public static void task17() {
		
		System.out.println("17. Даны целые числа m и n. Если числа не равны, то заменить каждое из них"
				+ " одним и тем же числом, равным большему из исходных, а если равны, то заменить"
				+ " числа нулями. ");
		
		int m;
		int n;
		
		m = 2;//произвольное значение
		n = 3;//произвольное значение
		
		System.out.println("Даны числа m " + m + " и  n " + n);
		
		if(m == n) {
			
			m = 0;
			n = 0;
			
			System.out.println("Числа равны поэтому m = " + m + " а n = " + n);
		}
		else {
			
			if(m < n) {
				
				m = n;
			}
			else {
				
				n = m;
			}
		System.out.println("Числа m и n равны соответсввенно " + m + " " + n);
		}
		System.out.println();
	}
	
	public static void task18() {
		
		System.out.println("18. Подсчитать количество отрицательных среди чисел а, b, с.");
		
		double a;
		double b;
		double c;
		int x;
		int y;
		int z;
		int s;//колличество отрицательных чисел
		
		a = 12;//произвольное значение
		b = -11;//произвольное значение
		c = -3;//произвольное значение
		
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
		
		System.out.println("Количество отрицательных чисел равно " + s);
		
		System.out.println();
	} 
	
	public static void task19() {
		
		System.out.println("19. Подсчитать количество положительных среди чисел а, b, с.");
		
		double a;
		double b;
		double c;
		int x;
		int y;
		int z;
		int s;//колличество положительных чисел
		
		a = 12;//произвольное значение
		b = 11;//произвольное значение
		c = -3;//произвольное значение
		
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
		
		System.out.println("Количество положительных чисел равно " + s);
		
		System.out.println();
	}
	
	public static void task20() {
		
		System.out.println("20. Определить, делителем каких чисел а, b, с является число k.");
		
		double a;
		double b;
		double c;
		double k;
		
		a = 12;//произвольное значение
		b = 10;//произвольное значение
		c = 18;//произвольное значение
		k = 4;//произвольное значение
		
		if(a % k == 0) {
			
			System.out.println("Число k является делителем числа a");
		}
		else {
			
			System.out.println("Число k не является делителем числа a");
		}
		if(b % k == 0) {
			
			System.out.println("Число k является делителем числа b");
		}
		else {
			
			System.out.println("Число k не является делителем числа b");
		}
		if(c % k == 0) {
			
			System.out.println("Число k является делителем числа c");
		}
		else {
			
			System.out.println("Число k не является делителем числа c");
		}
		
		System.out.println();
	}
	
	public static void task21() {
		
		System.out.println("21. Программа  —  льстец.  На  экране  высвечивается  вопрос  «Кто  ты:  мальчик "
				+ " или  девочка? Введи  Д  или  М».  В зависимости от ответа на экране должен появиться текст "
				+ "«Мне нравятся девочки!» или «Мне нравятся мальчики!». ");
		
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		
		String c = scannerString();
		
		switch(c) {
			case "Д":
				System.out.println("Мне нравятся девочки!");
				break;
			case "М":
				System.out.println("Мне нравятся мальчики!");
				break;
			default:
				System.out.println("Вы ввели не корректную букву!");
		}
		
		System.out.println();
	}
	
	public static void task22() {
		
		System.out.println("22. Перераспределить значения переменных х и у так,"
				+ " чтобы в х оказалось большее из этих значений, а в y - меньшее.");
		
		double x;
		double y;
		
		x = 5;//произвольное значение
		y = 7;//произвольное значение
		
		if(x == y) {
			
			System.out.println("Значения Х и Y равны");
		}
		
		if(x > y) {
			
			System.out.println("Значение х равно " + x + "значение у равно " + y);
		
		}
		if(x < y) {
			
			double y1 = x;
			x = y;
			
			System.out.println("Значение х равно " + x + " значение у равно " + y1);
		}
		
		System.out.println();
	}
	
	public static void task23() {
		
		System.out.println("23. Определить правильность даты, введенной с клавиатуры "
				+ "(число — от 1 до 31, месяц — от 1 до 12). Если введены \r\n" + 
				"некорректные данные, то сообщить об этом. ");
		
		int a = scannerInt();
		int b = scannerInt();
		
		if(a > 31 && a < 1) {
			System.out.println("вы ввели не корректное число");
		}
		else {
			System.out.println("число введено правильно");
		}
		
		if(b > 12 && b < 1) {
			System.out.println("вы ввели не корректный месяц");
		}
		else {
			System.out.println("месяц введен правильно");
		}
		
		System.out.println();
	}
	
	public static void task24() {
		
		System.out.println("24. Составить программу, определяющую результат гадания на ромашке — "
				+ "«любит—не любит», взяв за исходное данное количество лепестков n.");
		
		int n;
		
		n = 10;//произвольное значение
		
		int i = 1;
		
		while(i < n) {
			
			if(i % 2 == 0) {
				
				System.out.println("Не любит");
			}
			else {
				System.out.println("Любит");
			}
			
			i++;
		}
		
		System.out.println();
		
	}
	
	public static void task25() {
		
		System.out.println("25.  Написать  программу  —  модель  анализа  пожарного  датчика  в  помещении,"
				+ "  которая  выводит  сообщение «Пожароопасная ситуация », если температура в комнате"
				+ "превысила 60° С.");
		
		double t;
		
		t = 68;//произвольное значение
		
		if(t > 60) {
			
			System.out.println("Пожарная ситуация!!!");
		}
		else {
			
			System.out.println("Пожарная обстановка в норме");
		}
		
		System.out.println();
	}
	
	public static void task26() {
		
		System.out.println("26. Написать программу нахождения суммы большего и меньшего из трех чисел.");
		
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		double d;
		double s;
		
		a = 21;//произвольное значение
		b = 56;//произвольное значение
		c = 20;//произвольное значение
		
		/*без читерства с Math.max()
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
		 * System.out.println("Сумма наибольшего и наименьшего числа из трех равна " + s);
		 * 
		 */
		
		x = Math.max(a, b);
		y = Math.max(x, c);//наибольшее значение трех чисел
		
		z = Math.min(a, b);
		d = Math.min(z, c);//наименьшее значение трех чисел
		
		s = y + d;//сумма наибольшего и наименьшего числа
		
		System.out.println("Сумма наибольшего и наименьшего числа из трех равна " + s);
		
		System.out.println();
	}
	
	public static void task27() {
		
		System.out.println("27. Найти max{min(a, b), min(c, d)}.");
		
		double a;
		double b;
		double c;
		double d;
		double x;
		double y;
		double z;
		
		a= 12;//произвольное значение
		b = 56;//произвольное значение
		c = 87;//произвольное значение
		d = 9;//произвольное значение
		
		/* без Math.max() и Math.min()
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
		 * System.out.println("Max{min( " + a + ", " + b + "), min(" + c + ", " + d + ") }. равно " + z);
		 * 
		 */
		
		x = Math.min(a, b);
		y = Math.min(c, d);
		z = Math.max(x, y);
		
		System.out.println("Max{min( " + a + ", " + b + "), min(" + c + ", " + d + ") }. равно " + z);
		
		System.out.println();
		
	}
	
	public static void task28() {
		
		System.out.println("28. Даны три числа a, b, с. Определить, какое из них равно d. "
				+ "Если ни одно не равно d, то найти max(d — a, d — b, d — c).");
		
		double a;
		double b;
		double c;
		double d;
		double x;
		double y;
		double z;
		
		a = 11;//произвольное значение
		b = 9;//произвольное значение
		c = 5;//произвольное значение
		d = 12;//произвольное значение
		
		if(a == d || b == d || c == d) {
			
			if(a == d) {
				
				System.out.println(" a равно d");
			}
			if(b == d) {
				
				System.out.println(" b равно d");
			}
			if(c == d) {
				
				System.out.println(" c равно d");
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
			
			System.out.println("max(d — a, d — b, d — c) равно " + q);
		}
		
		System.out.println();
		
	}
	
	public static void task29() {
		
		System.out.println("29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). "
				+ "Определить, будут ли они расположены на одной прямой.");
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		x1 = 10;//произвольное значение
		x2 = 12;//произвольное значение
		x3 = 10;//произвольное значение
		y1 = 5;//произвольное значение
		y2 = 2;//произвольное значение
		y3 = 10;//произвольное значение
		
		if((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
			
			System.out.println("Точки А(х1,у1), В(х2,у2) и С(х3,у3) расположены на одной прямой.");
		}
		else {
			
			System.out.println("Точки А(х1,у1), В(х2,у2) и С(х3,у3) не расположены на одной прямой.");
		}
		
		System.out.println();
	}
	
	public static void task30() {
		
		System.out.println("30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с,"
				+ " и заменить их абсолютными значениями, если это не так.");
		
		double a;
		double b;
		double c;
		
		a = -12;//произвольное значение
		b = 10;//произвольное значение
		c = 5;//произвольное значение
		
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
		
		System.out.println("Значения a,b и c равны соответственно " + a + " " + b + " " + c);
		
		System.out.println();
	
	}
	
	public static void task31() {
		
		System.out.println("31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича."
				+ " Определить, пройдет ли кирпич через отверстие.");
		
		double a;//сторона отверстия
		double b;//сторона отверстия
		double x;//ребро кирпича
		double y;//ребро кирпича
		double z;//ребро кирпича
		double s;//площадьь отверстия
		double s1;//площадь одной стороны кирпича
		double s2;//площадь второй стороны кирпича
		double s3;//площадь третьей стороны кирпича
		
		a = 10;//произвольное значение
		b = 20;//произвольное значение
		x = 2;//произвольное значение
		y = 5;//произвольное значение
		z = 1;//произвольное значение
		
		s = a * b;
		s1 = x * y;
		s2 = x * z;
		s3 = y * z;
		
		if(s > s1 && s > s2 && s > s3) {
			
			System.out.println("Кирпич пройдет в отверстие АВ");
		}
		else {
			
			System.out.println("Кирпич не пройдет в отверстие АВ");
		}
		System.out.println();
	}
	
	public static void task32() {
		
		System.out.println("32. Написать программу, которая по заданным трем числам определяет, "
				+ "является ли сумма каких-либо двух из них положительной.");
		
		double a;
		double b;
		double c;
		double x;
		double y;
		double z;
		
		a = 12;//произвольное значение
		b = 5;//произвольное значение
		c = -15;//произвольное значение
		
		x = a + b;
		y = a + c;
		z = b + c;
		
		if(x > 0 || y > 0 || z > 0) {
			
			System.out.println("Сумма каких-либо двух чисел положительна");
		}
		else {
			
			System.out.println("Нет чисел сумма которых положительна");
		}
		System.out.println();
	} 
	
	public static void task33() {
		
		System.out.println("33. Написать программу, которая по паролю будет определять уровень "
				+ "доступа сотрудника к секретной информации в базе данных. Доступ к базе имеют только"
				+ " шесть человек, разбитых на три группы по степени доступа. Они имеют следующие пароли:"
				+ " 9583, 1747 — доступны модули баз А, В, С; "
				+ " 3331, 7922 — доступны модули баз В, С;"
				+ " 9455, 8997 — доступен модуль базы С.");
		
		double x = 9583;//
		double y = 1747;//
		double z = 3331;//
		double a = 7922;//
		double b = 9455;//
		double c = 8997;//
		double s;// пароль который ввел сотрудник
		
		s = 9583;
		
		if(s == x || s == y) {
			
			System.out.println("Вам доступны модули баз А, В, С");
		}
		if(s == z || s == a) {
			
			System.out.println("Вам доступны модули баз В, С");
		}
		if(s == b || s == c) {
			
			System.out.println("Вам доступен модуль С");
		} 
		if (s != x && s != y && s != z && s != a && s != b && s != c) {
			
			System.out.println("У Вас нет доступа к информации!");
			
		}
		
		System.out.println();
	}
	
	public static void task34() {
		
		System.out.println("34.  Составить  программу,  реализующую  эпизод  применения  компьютера "
				+ " в  книжном  магазине.  Компьютер запрашивает  стоимость  книг,  сумму  денег, "
				+ " внесенную  покупателем;  если  сдачи  не  требуется,  печатает  на  экране "
				+ "«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу»"
				+ " и указывает сумму сдачи; если \r\n" + 
				"денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.");
		
		double x;//Стоимсоть книги
		double y;//Количество денег полученных от покупателя
		double a;//сдача
		double b;//недостача
		
		System.out.println("Ведите стоимость книги:");
		
		x = scannerDouble();
		
		System.out.println("Введите сумму денег полученную от покупателя:");
		
		y = scannerDouble();
		
		if(x == y) {
			
			System.out.println("Спасибо!");
		}
		if(x < y) {
			
			a = y - x;
			
			System.out.println("Возьмите сдачу " + a);
		}
		if(x > y) {
			b = x - y;
			System.out.println("Доплатите " + b);
		}
		
		System.out.println();
	}
	
	public static void task35() {
		
		System.out.println("35. Вычислить число и месяц в невисокосном году по номеру дня.");
		
		double x;
		
		x = 156;//произвольное значение
		
		System.out.println("вы ввели " + x + " день, что соответствует\n");
		
		if(x > 0 && x <= 59) {
			
			if(x <= 31) {
				
				System.out.println( x + "января");
			}
			if(x > 31 && x <= 59) {
				
				x = x - 31;
				
				System.out.println( x + "февраля");
			} 
		}
		if(x > 59 && x <= 151) {
			
			x = x - 59;
			
			if(x <= 31) {
				
				System.out.println( x + "марта");
			}
			if(x > 31 && x <= 61) {
				
				x = x - 31;
				
				System.out.println(x + " апреля" );
			}
			if(x > 61 && x <= 92) {
				
				x = x - 61;
				
				System.out.println(x + " мая" );
			}
		}
		if(x > 151 && x <= 243) {
			
			x = x - 151;
			
			if(x <= 30) {
				
				System.out.println(x + " июня");
			}
			if(x > 30 && x <= 61) {
				
				x = x - 30;
				
				System.out.println(x + " июля" );
			}
			if(x > 61 && x <= 92) {
				
				x = x - 61;
				
				System.out.println(x + " августа" );
			}
		}
		if(x > 243 && x <= 334) {
			
			x = x - 243;
			
			if(x <= 30) {
				
				System.out.println(x + " сентября" );
			}
			if(x > 30 && x <= 61) {
				
				x = x - 30;
				
				System.out.println(x + " октября" );
			}
			if(x > 61 && x <= 91) {
				
				x = x - 61;
				
				System.out.println(x + " ноября" );
			}
		}
		if(x > 334 && x <= 365) {
			
			x = x - 334;
			
			System.out.println(x + " декабря" );
			
		}
		
		System.out.println();
	}
	
	public static void task36() {
		
		System.out.println("36. Вычислить значение функции: F(x) = x^2 - 3x + 9, если х <= 3 и F(x) = 1 / (x^3 + 6), если x > 3 ");
		
		double x;
		double y;
		
		x = 4;//произвольное значение
		
		if(x <= 3) {
			
			y = Math.pow(x, 2) -  (3 * x) + 9;
			
			System.out.println("Значение функции при x <= 3 равно " + y);
		}
		if(x > 3) {
			
			y = 1 / (Math.pow(x, 3) + 6);
			
			System.out.println("Значение функции при x > 3 равно " + y);
		}
		
		System.out.println();
	}
	
	public static void task37() {
		
		System.out.println("37. Вычислить значение функции: F(x) = - x^2 + 3x + 9, если x >= 3 и F(x) = 1 / (x^3 - 6), если x < 3.");
		
		double x;
		double y;
		
		x = 5;//произвольное значение
		
		if(x >= 3) {
			
			y = - Math.pow(x, 2) + 3 * x + 9;
			
			System.out.println("Значение функции F(x) = - x^2 + 3x + 9 при x >= 3 равно " + y);
		}
		if(x < 3) {
			
			y = 1 / (Math.pow(x, 3) - 6);
			
			System.out.println("Значение функции F(x) = 1 / (x^3 - 6) при x < 3 равно " + y);
			
		}
		
		System.out.println();
	}
	
	public static void task38() {
		
		System.out.println("38. Вычислить значение функции: F(x) = x^2, если 0 <= x <= 3 и F(x) = 4, если x > 3, x < 0. ");
		
		double x;
		double y;
		
		x = 12;//произвольное значение
		
		if(x >= 0 && x <= 3) {
			
			y = Math.pow(x, 2);
			
			System.out.println("Значение функции F(x) = x^2 при 0 <= x <= 3 равно " + y);
		}
		if(x > 3 && x < 0) {
			
			y = 4;
			
			System.out.println("Значение функции F(x) = " + y);
			
		}
		System.out.println();
	}
	
	public static void task39() {
		
		System.out.println("39. Вычислить значение функции: F(x) = - x^2 + x - 9, если x >= 8 и F(x) = 1 / (x^4 - 6), если x < 8.");
		
		double x;
		double y;
		
		x = 10;//произвольное значение
		
		if(x >= 8) {
			
			y = - Math.pow(x, 2) + x - 9;
			
			System.out.println("Значение функции F(x) = -x^2 + x - 9 при x >= 8 равно " + y);
		}
		if(x < 8) {
			
			y = 1 / (Math.pow(x, 4) - 6);
			
			System.out.println("Значение функции F(x) = 1 / x^4 - 6 при x < 8 равно " + y);
		}
		
		System.out.println();
	}
	
	public static void task40() {
		
		System.out.println("40. Вычислить значение функции: F(x) = - x^3 + 9, если x <= 13 и F(x) = - 3 / x + 1, если x > 13.");
		
		double x;
		double y;
		
		x = 5;//произвольное занчение
		
		if(x <= 13) {
			
			y = - Math.pow(x, 3) + 9;
			
			System.out.println("Значение функции F(x) = - x^3 + 9 при x <= 13 равно " + y);
		}
		
		if(x > 13) {
			
			y = -(3 / (x + 1));
			
			System.out.println("Значение функции F(x) = - 3 / x + 1 при x > 13 равно " + y);
		}
		
		System.out.println();
	}
	
}

/**
*Выводит строку текста
*@auther IL
*/
public class Main{
	public static void main(String[] args){
		//Упражнение 1
		System.out.println("Starting project");

		//Упражнение 2
		//Объявление и инициализация переменных
		byte v_byte = 127;
		short v_short = 327;
		char v_char = '$';
		int v_int = 282;
		long v_long = 64l;
		float v_float = 32.24f;
		double v_double = 11.345d;
		boolean v_boolean = true;

		//Вывод переменных 
		System.out.println("This is a byte: " + v_byte);
		System.out.println("This is a short: " + v_short);
		System.out.println("This is a char: " + v_char);
		System.out.println("This is a int: " + v_int);
		System.out.println("This is a long: " + v_long);
		System.out.println("This is a float: " + v_float);
		System.out.println("This is a double: " + v_double);
		System.out.println("This is a boolean: " + v_boolean);

		//Объявление переменных с ошибками
		v_byte = 20;
		v_short = 29;
		v_char = 'a'; //необходимо добавить одинарные кавычки
		v_int = 65999;
		v_long = 4294967296l; //необходимо добавить "l" в конце 
		v_float = 0.33333334f;//необходимо добавить "f" в конце
		v_double = 0.3333333333333333d;//необходимо добавить "d" в конце
		v_boolean = true;//несоответствие типа переменной и типа присваемого значения

		//Упражнение 2
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}

		long begin = new java.util.Date().getTime();
		int i = 0;
		for (i = 1; i < 100000001; i++){
		}
		long end = new java.util.Date().getTime();
		System.out.println("");
		System.out.println("time i: " + (end - begin));

		long begin2 = new java.util.Date().getTime();
		long j = 0;
		for (j = 1; j < 100000001; j++) {
		}
		long end2= new java.util.Date().getTime();
		System.out.println("time j: " + (end2 - begin2));

		//Задание 5-1
		int[] mas = {12, 43, 12, -65, 778, 1123, 32, 76};

		int max = 0;
		for(int i = 0; i < mas.length; i++){
			if (mas[i] > mas[max]){
				max = i;
			}
		}
		System.out.println("Max: " + mas[max]);

		//Задание 5-2
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix.length; j++){
				matrix[i][j] = (int)Math.round(Math.random()*10);
				System.out.print(matrix[i][j] + " " );
			}
			System.out.println("");
		}

		System.out.println("");

		int[][] tMatrix = new int [3][3];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix.length; j++){
				tMatrix[i][j] = matrix[j][i];
				System.out.print(tMatrix[i][j] + " " );
			}
			System.out.println("");
		}
	}
}
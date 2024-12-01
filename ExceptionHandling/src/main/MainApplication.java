package main;

import java.io.IOException;
import java.util.Arrays;

import main.exception.CustomException;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("=======********Exception Handling******=========");
		
		System.out.println("===try-catch block====");
		try {
			int num = 100/0;
			System.out.println(num);
		}catch(ArithmeticException exception) {
			System.out.println(exception);
		}
		System.out.println();
		System.out.println("==== multiple catch blocks =========");
		try {
			String str = null;
			System.out.println(str.length());
		}catch(ArithmeticException exception) {
			System.out.println("arithmetic exception occured!! : "+exception);
		}catch(IndexOutOfBoundsException exception) {
			System.out.println("index out of bound exception occured!! : "+exception);
		}catch(NullPointerException exception) {
			System.out.println("null pointer exception occured!! : "+exception);
		}catch(Exception exception) {
			System.out.println("unexpected exception occured!! : "+exception);
		}
		
		System.out.println();
		System.out.println("===== nested try-catch blocks ==========");
		try {
			try {
				int a = 30;
				int b = 20;
				int sum = a+b;
				int div = sum/0;
				System.out.println(div);
			}catch(ArithmeticException exception) {
				System.out.println("arithmetic exception occured!! : "+exception.getMessage());
			}
			
			try {
				int[]arr = new int[5];
				arr[0] = 12;
				arr[4] = 5;
				arr[6] = 90;
				System.out.println(Arrays.toString(arr));
			}catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("array index out of bound exception occured!! : "+exception.getMessage());
			}
			
			try {
				String name = null;
				if(name.equals("Mahesh")) {
					System.out.println("Name is : "+name);
				}else {
					System.out.println("Invalid input");
				}
			}catch(NullPointerException exception) {
				System.out.println("null pointer exception occured!! : "+exception.getMessage());
			}
			
			
			String str = "Welcome to my youtube channel";
			String[]words = str.split(" ");
			String word = words[3]; // youtube
			System.out.println("word is : "+word);
			char ch = word.charAt(8);
			System.out.println("the 8th char is : "+ch);
			
		}catch(StringIndexOutOfBoundsException exception) {
			System.out.println("string index out of bound exception occured!! : "+exception.getMessage());
		}catch(Exception exception) {
			System.out.println("unexpected exception occured!! : "+exception);
		}
		System.out.println();
		
		System.out.println("======finally block ===========");
		try {
			String str = null;
			System.out.println(str.length());
		}catch(ArithmeticException exception) {
			System.out.println("arithmetic exception occured!! : "+exception);
		}catch(IndexOutOfBoundsException exception) {
			System.out.println("index out of bound exception occured!! : "+exception);
		}catch(NullPointerException exception) {
			System.out.println("null pointer exception occured!! : "+exception);
		}catch(Exception exception) {
			System.out.println("unexpected exception occured!! : "+exception);
		}finally {
			System.out.println("finally block always be executed!!");
		}
		System.out.println();
		
		System.out.println("=======throw and throws keywords ============");
		
		try {
			throw new RuntimeException("runtime exception occured!!");
//			method(14);
		}catch(RuntimeException exception) {
			System.out.println("runtime exception occured : "+exception);
		}catch(Exception exception) {
			System.out.println("unexpected exception occured : "+exception);
		}
		System.out.println();
		
		System.out.println("=======exception propagation, throws keyword and custom exception ==========");
		try {
			method(14);
		}catch(RuntimeException exception) {
			System.out.println("runtime exception occured : "+exception);
		}catch(CustomException exception) {
			System.out.println("custom exception occured!! : "+exception);
		}catch(Exception exception) {
			System.out.println("unexpected exception occured : "+exception);
		}
		System.out.println();
		
		
		
		System.out.println("rest of the code");
	}

	private static void method(int age) throws IOException, CustomException{
		
//		if(age<18) {
//			throw new RuntimeException("invalid age");
//		}
		method2();
	}

	private static void method2() throws IOException, CustomException {
		method3();
	}

	private static void method3() throws IOException, CustomException {
//		throw new IOException("IO Exception occured!!");
		throw new CustomException("Custom Exception occured!!");
	}
}

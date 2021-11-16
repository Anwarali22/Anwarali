package tamilhacks.java;

public class practices1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Basic java program 

		package com.tamilhacks; 
		import java.util.Scanner; 
		public class Main 
		{ 
		     public static void main(String[] args) 
		    { 
		         // write your code here
		         System.out.println("Tamil hacks") ; 
		     } 
		} 
		
		//primitive data types

		byte number = 20 ;  
		short number2 = 150; 
		int number3 = 1999; 
		long number4 = 123456789789L; 
		float number5 = 11.5F;
		double number6 = 1111.99999999; 
		char alphabet = 'b' ; 
		boolean bool = false ; 
		System.out.println(bool); 
		System.out.println(number); 
		
		
		// reference data types 

		 int number = 10; 
		 //5 = 0 ,1, 2, 3, 4 
		 int[] numbers = {10,11,12,13,15}; 
		 // numbers[0] = 10; 
		 // numbers[1] = 11; 
		char name[] = {'a' ,'b' ,'s' ,'a'}; 
		int len = name.length; 
		char name1[] = name.clone();  
		System.out.println(Arrays.toString(name1)); 
		System.out.println((name[0])); 
		System.out.println(len);
		
		
		//STRINGS 

		String channelName = "tamil Hacks" + " youtube channel"; System.out.println(channelName.endsWith("channels")); 
		System.out.println(channelName); 
		int numberOne = 1000 ; 
		int ageOfPerson = 25 ; 
		int numbers[] = { 1, 2, 3,}; 
		int numbersOf2Dim[][] = { {1,2 } ,{ 1,3} }; 
		byte number = 5; 
		number = 10;
		System.out.println(number); 
		
		//constant 

		final int ageOfPerson1 = 18; 
		 //ageOfPerson1 = 21; 
		//operations 

		byte number1 = 20; 
		 int number2 = 10; 
		 int number3 = number2 + number1; 
		 number2 *= 10; 
		 int number4 = (5 + 5 )- 10 *5 *6 /9 /8 % 20; 
		 int number5 = 2 / 2; 
		//BODMAS //logical opertorss && , || , !! 

		 int ageOfPerson = 21; 
		 boolean indianCitizen = false; 
		 // condition true false
		 String name = ageOfPerson >= 18 ? "eligible" : "not eligible";
		 int number10 = 10; 
		 // -- number10 ; 
		 int number11 = ++ number10;
		System.out.println(number10);
		System.out.println( number11 ); 
		//MATH 

		 int number = 100; 
		 float number1 = 101.13f; 
		 System.out.println(Math.log(number)); 
		 String name ; int number1; 
		 int number2; 
		//Scanner

		Scanner input = new Scanner(System.in); 
		 System.out.println("enter a name :"); 
		 name = input.nextLine(); 
		 number1 = input.nextInt(); 
		 number2 = input.nextInt(); 
		 System.out.println("hi ," + name + " " + name.toUpperCase() + " " + name.length());   System.out.println(number1 + number2); 
		//if conditions 

		 int pen = 10; 
		 int specialPen = 20; 
		 int cost ; 6
		 Scanner input = new Scanner(System.in);
		 cost = input.nextInt(); 
		 if (cost > specialPen) //cost > 20 
		 System.out.println("you can buy the special pen");  
		 else if (cost > pen) 
		{ //cost >10
		     System.out.println("you can buy the pen"); 
		     System.out.println("you have " + cost); 
		} 
		 else 
		 System.out.println("you have less money to buy the pen"); 
		//switch 

		int number = 10; 
		 String name ; 
		 Scanner input = new Scanner(System.in); 
		 name = input.nextLine(); 
		 switch (name)
		{ 
		     case "karthik" :
		         System.out.println("hi, "+name); 
		         break; 
		     case "raj" : 
		         System.out.println("hi, "+name); 
		         break; 
		     case "arun" : 
		         System.out.println("hi, "+name); 
		         break; 
		     case "bharath" : 
		         System.out.println("hi, "+name); 
		         break; 
		     default:
		         System.out.println("your name is not in list"); 
		} 
		 //loops 

		 //for loop , while , do while , for-each loop 
		// 0 < 5 
		for ( int initial = 1 ; initial > 0 ; initial -- )
		{ 
		     System.out.println("hi dude");
		}
		//while loop 

		int number = 3;
		while(number > 10)
		{ 
		    //3>0 //2>0 //1>0 //0>0 
		     System.out.println("while loop"); 
		     number -- ; 
		}
		 //do while loop 

		int number1 = 3;
		 do
		{ 
		     System.out.println("do while loop"); 
		     number1 -- ; 
		}
		while (number1 > 10);
		 //0 , 0<5 , 0+1 =1 , 1<5 , 2<5 , 3<5 , 4<5 , 5<5
		//for each – arrays 

		 String vegetables[] = {"onion" , "carrot" ,"beans"}; 
		 for(int i = vegetables.length-1 ; i > 0 ; i--)
		{ 
		    System.out.println(vegetables[i]); 
		} 
		for(String vegetable : vegetables)
		{
		     System.out.println(vegetable); 
		} 

	}

}

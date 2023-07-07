public class FirstJavaLole {
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Hello World");
		System.out.println("I am learning Java.");
		System.out.println("awesome saucesome");	
		System.out.println("whu's 9. plus 10.");
		System.out.println(21);

		System.out.println("-----------------------------------------------------");
		System.out.print("This is a print command.");
		System.out.println(" I, HOWEVER, AM A PRINTLN COMMAND. no line break here!");

		System.out.println("-----------------------------------------------------");
		String myName = "John Egburt";
			System.out.println(myName);	
		int myInt = 13;
			System.out.println(myInt);	
			System.out.println("changing 'myInt' with myInt = Number;");
			myInt = 20;
			System.out.println(myInt);

		System.out.println("-----------------------------------------------------");
		String johnVariable = "John ";
		System.out.println("Hello, " + johnVariable);

		String johnLastNameVariable = "Egbert";
		String fullName = johnVariable + johnLastNameVariable;
		System.out.println(fullName);

		System.out.println("-----------------------------------------------------");
		System.out.println("assigning multiple values with int x = Number, y = Number, . . .");
			int x = 5, y = 6, z = 7;
			System.out.println(x);
			System.out.println(" ");
			System.out.println(y);
			System.out.println(" ");
			System.out.println(z);

		System.out.println("-----------------------------------------------------");
		System.out.println("writing ASCII characters using the char datatype!");
		char myAscii1 = 42;
		char myAscii2 = 51;
			System.out.print(myAscii1);
			System.out.print(myAscii2);
			System.out.println(myAscii1);


		System.out.println("-----------------------------------------------------");
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			System.out.println("the length of the txt string is: " + txt.length());

		System.out.println("-----------------------------------------------------");
		System.out.println(" ");
		String txt1 = "Hello World";
		System.out.println("toUpperCase and toLowerCase");
		System.out.println(txt1.toUpperCase()); //outputs "HELLO WORLD"
		System.out.println(txt1.toLowerCase()); //outputs "hello world"

		System.out.println("-----------------------------------------------------");
		System.out.println(" ");
		System.out.println("indexOf shows index (POSITION) of the first instance of a specified string of text (INCLUDING WHITESPACES)");
		String txt2 = "Please locate where 'locate' occurs!";
		System.out.println(txt2);
		System.out.println(txt2.indexOf("locate")); //outputs 7

		System.out.println("-----------------------------------------------------");
		System.out.println("concatenation");
		String firstName = "John";
		String lastName = "Egbert";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));



		System.out.println("-----------------------------------------------------");
		System.out.println("adding strings and numbers");
			System.out.println("	if you add two numbers, the result will be a number");
			int num1 = 10;
			int num2 = 20;
			int numAdd = num1 + num2;
			System.out.println("		10 + 20 = " + numAdd);

			System.out.println("	if you add two strings, the result will be a string concatenation");
			String numString1 = "10";
			String numString2 = "20";
			String numStringAdd = numString1 + numString2;
			System.out.println("		10 + 20 = " + numStringAdd);

			System.out.println("	if you add a number and a string, the result will be a string concatenation");
			System.out.println("		int num1 + String numString2 = " + num1 + numString2); //outputs 1020

		System.out.println("-----------------------------------------------------");
		System.out.println("special characters");
		System.out.println("	backslash \\ lets you add double quotes, single quotes and backlsash lol");
		System.out.println("	this is \"poggers\"");
		System.out.println("	it\'s alright (also seems to be working without the backspace but it prolly has a purpose");
		System.out.println("	backspace \\ aw yeahhh");

		System.out.println("-----------------------------------------------------");
		int numMath1 = 20;
		int numMath2 = 15;
		System.out.println("Math.max(numMath1 = 20, numMath2 = 15");
		int numMax = Math.max(numMath1, numMath2);
		System.out.println("	" + numMax);

		System.out.println(" ");

		int numMath3 = 18;
		int numMath4 = 4;
		System.out.println("Math.min(numMath3 = 18, numMath4 = 4");
		int numMin = Math.min(numMath3, numMath4);
		System.out.println("	" + numMin);

		System.out.println(" ");

		System.out.println("other commands:\n" + 
			"	Math.sqrt(x);\n" + 
					"		returns the square root of x\n" + "\n" +
			"	Math.abs(x);\n" + 
					"		returns the absolute (positive) value of x\n" + "\n" +
			"	Math.random(x);\n" + 
					"		returns a random number between 0.0 (inclusive) and 1.0 (exclusive)\n" +
			"	more control: e.g. 0 to 100\n" + 
					"		int randomNum = (int)(Math.random() * 101;");


		System.out.println("-----------------------------------------------------");

		System.out.println("BOOLEANS ! ! ! ! wtf !!\n");
		
		int bool1 = 10;	
		int bool2 = 30;
		System.out.print("is 30 larger than 10?\n" + "	");
		System.out.println(bool2 > bool1);

		System.out.print("is 10 larger than 30?\n" + "	");
		System.out.println(bool1 > bool2);
		System.out.println("\n" + "System.out.println(bool1 > bool2);");

		System.out.println("-----------------------------------------------------");
		System.out.println("IF-STATEMENTS ! ! ! ! \n");

		System.out.println("	is 13 smaller than 99?");
		int ifX1 = 13;
		int ifY1 = 99;
		if (ifX1 < ifY1){
			System.out.println("		this is true WOOO \n");
		}

		System.out.println("	is 55 larger than 44?");
		int ifX2 = 55;
		int ifY2 = 44;
		if (ifX2 > ifY2){
			System.out.println("		this is false AAAA \n");
		}

		System.out.println("~~~~~~aaa!!!~~~~~~");
		System.out.println("if statements, change variable ifElseIfElse! \n");
		int ifElseIfElse = 109;
		System.out.print("	rn the variable is " + ifElseIfElse + "\n");

		if (ifElseIfElse == 50){
			System.out.println("	-> the variable is equal to 50 POG!!");
		}
		else if (ifElseIfElse < 50){
			System.out.println("	 -> the variable is smaller than 50 AHH!!");
		}
		else {
			System.out.println("	-> the variable is larger than 50 WHOAH!!");
		}

	System.out.println("~~~~~~example of SHORT HAND IF ELSE!!! aka TERNARY OPERATOR~~~~~~\n");
		
		System.out.println("CHECK CODE I GUESS FUCKO LOL");
			int timeExample = 20;
			if (timeExample < 18){
				System.out.println("gooda day.");
			} else {
				System.out.println("gooda evening.\n");
			}


			System.out.println("	--- IS THE SAME AS ---\n");

			String timeExampleResult = (timeExample < 18) ? 	"gooda day." : "gooda evening.";
			System.out.println(timeExampleResult);




		System.out.println("-----------------------------------------------------");
			System.out.println("SWITCH-STATEMENTS ! ! ! ! \n");


			int day = 4;
			System.out.println("the variable says " + day);
			
			switch (day) {
				case 1:
					System.out.println("Monday");
					break;

				case 2:
					System.out.println("Tuesday");
					break;

				case 3:	
					System.out.println("Wednesday");
					break;

				case 4:
					System.out.println("Thursday");
					break;

				case 5:
					System.out.println("Friday");
					break;

				case 6:	
					System.out.println("Saturday");
					break;

				case 7:
					System.out.println("Sunday");
					break;
			}


			

		System.out.println("-----------------------------------------------------");
			System.out.println("WHILE-LOOPS ! ! ! ! \n");

			System.out.println("	loops through a block of code as long as a specified condition is TRUE\n");

					int i = 0;
					while (i <= 10) {
						System.out.println("		" +i);
						i++;
					}

			System.out.println("\n" + "\n" + "\n");
			System.out.println("	a do/while loop will execute the code block once, BEFORE checking if the\n" + "condition is true, then it will repeat the loop as long as the condition is true.\n");

					int ii = 0;
					do {
						System.out.println("		" + ii);
						ii++;
					}
					while (ii <= 5);

			System.out.println("e.g i just misspelled the variable so everything was \n" + "wrong but it STILL put 0 (first \"do\" loop)");
		}
	}
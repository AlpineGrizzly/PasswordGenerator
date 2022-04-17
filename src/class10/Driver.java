package class10;

import java.util.Scanner;

public class Driver {
	
	public static String generatePassword(int length, int comp) {
		char[] chars = new char[length];
		int rng;
		//String symbols = " ~`!@#$%^&*()_-+={[}]|\:;'<,>.?/ ";
		switch (comp) {
			case 1: for (int i = 0; i < chars.length; i++) {
						chars[i] = (char)('a' + (Math.random() * 26));			
					}
					return new String(chars);
			case 2:	for (int i = 0; i < chars.length; i++) {
						rng = (int)(Math.random() * 2);
						if(rng == 0) {
							chars[i] = (char)('a' + (Math.random() * 26));
						}else {
							chars[i] = (char)('A' + (Math.random() * 26));
						}
					}
					return new String(chars);
			case 3: for (int i = 0; i < chars.length; i++) {
						rng = (int)(Math.random() * 3);
						if(rng == 0) {
							chars[i] = (char)('0' + (Math.random() * 10));
						}else if(rng == 1) {
							chars[i] = (char)('a' + (Math.random() * 26));
						}else {
							chars[i] = (char)('A' + (Math.random() * 26));
						}
					}
					return new String(chars);
			case 4: for (int i = 0; i < chars.length; i++) { 
						rng = (int)(Math.random() * 4);
						if(rng == 0) {
							chars[i] = (char)('0' + (Math.random() * 10));
						}else if(rng == 1) {
							chars[i] = (char)('a' + (Math.random() * 26));
						}else if(rng == 2){
							chars[i] = (char)('A' + (Math.random() * 26));
						}else {
							chars[i] = (char)('!' + (Math.random() * 14)); //partially takes in some of the ascii characters, not all
						}
					}
					return new String(chars);	
			default: return "Error"; //Invalid option 
		}
			
	}

	public static void main(String[] args) {
		String genPass;
		int len;
		int comp;
		int option;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print(" ------------------- \n "
							+ "Password Generator \n "
							+ "------------------- \n "
							+ "1. Generate Password \n "
							+ "2. Exit \n > ");
			option = in.nextInt();
			if(option == 2) {
				System.out.print("Exiting....");
				break;
			}else{
				System.out.print("Length> ");
				len = in.nextInt();
				System.out.print("Complexity (1,2,3,4)> ");
				comp = in.nextInt();
				genPass = generatePassword(len, comp);
				System.out.println("Generated Password: " + genPass);
			}
			in.nextLine();
		}
		in.close();
	}
}
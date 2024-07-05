package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Animals animals = new Animals("abdullah",27,"Farooqui");
		animals.setName("bills");
		String nam = animals.getName();

		int[] array = new int[5];
        String age = String.valueOf(animals.getAge());
        System.out.println(age + " " + nam);
		// Fill the array as required
		fillArray(array);

		// Print the array to verify
		printArray(array);
	}

	public static void fillArray(int[] array) {
		// Example values: -2, 1, 0
		for(int i = 0;i<array.length;i++){
			array[i] = i+1;
		}
	}

	public static void printArray(int[] array) {
		for (int val : array) {
			System.out.print(val + " ");
		}
		System.out.println();

//		SpringApplication.run(DemoApplication.class, args);
//		int val = 10;
//		String str = "string";
//		char plus = '+';
//		System.out.println("Java learning " + val + str + plus);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("abdullah");
//		System.out.print(("what is your name? \n"));
//		String name = scanner.nextLine();
//		String str2 = String.format("%s name ",name);
//		System.out.print(str2.toUpperCase());
//		scanner.close();

	}

}

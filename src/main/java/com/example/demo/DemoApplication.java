package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Animals animals = new Animals("abdullah",27,"Farooqui");
		NotAnimals notAnimals = new NotAnimals("","NadanParinday");

		animals.setName("bills");

		String nam = animals.getName();
		notAnimals.setName(nam);
        String notanimalname = notAnimals.getName();
        System.out.println(notanimalname);
		String[] array = new String[5];
        String age = String.valueOf(animals.getAge());
        System.out.println(age + " " + nam);
		// Fill the array as required
		fillArray(array);

		// Print the array to verify
		printArray(array);


	}

	public static void fillArray(String[] array) {
		NotAnimals notAnimals = new NotAnimals("","Grahams");

        Arrays.setAll(array, i -> notAnimals.getName()+i+1);
	}

	public static void printArray(String[] array) {
		for (String val : array) {
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

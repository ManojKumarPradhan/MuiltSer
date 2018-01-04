package com.bigob.colltest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ReadDataFromFile {

	private static int i = 1;
	private static Map<String, Set<String>> map = null;
	private static final String FILE01 = "src/main/java/com/bigob/colltest/file1.txt";
	private static final String FILE02 = "src/main/java/com/bigob/colltest/file2.txt";
	private static final String FILE03 = "src/main/java/com/bigob/colltest/file3.txt";

	public static void main(String[] args) {
		uniqueData().forEach(ReadDataFromFile::resultPrint);
	}

	private static Map<String, Set<String>> uniqueData() {
		List<String[]> listS = null;
		map = new HashMap<>();
		listS = new ArrayList<>();
		try {
			readFile(listS, new Scanner(new File(FILE01)));
			readFile(listS, new Scanner(new File(FILE02)));
			readFile(listS, new Scanner(new File(FILE03)));
		} catch (FileNotFoundException e) {
			System.out.println("File not found or please correct the path");
		}
		listS.forEach(ReadDataFromFile::extractList);
		return map;
	}

	private static List<String[]> readFile(List<String[]> list, Scanner scanner) {
		while (scanner.hasNext()) {
			list.add(scanner.nextLine().split(","));
		}
		return list;
	}

	private static void resultPrint(String string, Set<String> strings) {
		System.out.print(string + "\t:");
		strings.forEach(ReadDataFromFile::printdata1);
		System.out.println();
		i = 1;
	}

	private static void printdata1(String string) {
		if (i++ == 1)
			System.out.print(" " + string);
		else
			System.out.print(", " + string);
	}

	private static void extractList(String[] sArray) {
		Set<String> set = new HashSet<>();
		set.add(sArray[1]);
		if (map.containsKey(sArray[0])) {
			if (!map.get(sArray[0]).equals(sArray[1])) {
				set = map.get(sArray[0]);
				set.add(sArray[1]);
			}
		}
		map.put(sArray[0], set);
	}
}

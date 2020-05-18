package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int counter = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				counter++;
			}
		}
		return counter;
	}

	public static double findTallest(List<Double> peeps) {
		double temp = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > temp) {
				temp = peeps.get(i);
			}

		}
		return temp;
	}

	public static String findLongestWord(List<String> words) {
		int numOfChars = 0;
		String current = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > numOfChars) {
				current = words.get(i);
				numOfChars = words.get(i).length();
			}
		}
		return current;
	}

	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals("... --- ...")) {
				return true;
			}

		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean boo = true;
		while (boo) {
			boo = false;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i) > results.get(i + 1)) {
					double temp = results.get(i);
					double temp1 = results.get(i + 1);
					results.set(i, temp1);
					results.set(i + 1, temp);
					boo = true;
				}
			}

		}
		return results;
	}

	public static List<String> sortDNA(List<String> sequences) {
		boolean boo = true;
		while (boo) {
			boo = false;
			for (int i = 0; i < sequences.size() - 1; i++) {
				if (sequences.get(i).length() > sequences.get(i + 1).length()) {
					String temp = sequences.get(i);
					String temp1 = sequences.get(i + 1);
					sequences.set(i, temp1);
					sequences.set(i + 1, temp);
					boo = true;
				}
			}

		}
		return sequences;
	}
	public static List<String> sortWords(List<String> words) {
		boolean boo = true;
		while (boo) {
			boo = false;
			for (int i = 0; i < words.size() - 1; i++) {
				if (words.get(i).compareTo(words.get(i + 1))>0) {
					String temp = words.get(i);
					String temp1 = words.get(i + 1);
					words.set(i, temp1);
					words.set(i + 1, temp);
					boo = true;
				}
			}

		}
		return words;
	}

}

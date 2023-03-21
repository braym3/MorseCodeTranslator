package com.qa.morsecodetranslator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MorseTranslator {

	private Map<String, Character> morseAlphabet = new HashMap<String, Character>();
	private String[] morseChars = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
			".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
			"--.." };

	public MorseTranslator() {
		int n = 0;
		for (int i = 'A'; i <= 'Z'; i++) {
			morseAlphabet.put(morseChars[n], (char) i);
			n++;
		}
	}

	public void printMorseAlphabet() {
		for (Entry<String, Character> i : morseAlphabet.entrySet()) {
			System.out.println(i);
		}
	}

	public String translate(String morse) {
		String s = "";
		// Split string on / (new word)
		String[] words = morse.split(" / ");
		// Split words on spaces (new character)
		for (String w : words) {
			String[] characters = w.split(" ");
			// add alphabet equivalent for each morse character
			for (String c : characters) {
				try {
					s += morseAlphabet.get(c);
				} catch (Exception e) {
					System.out.println("Invalid morse character");
				}

			}
			// add space in between words
			s += " ";
		}

		return s;
	}

}

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

	public String englishToMorse(String message) {
		String result = "";
		Character c = null;
		// for each char in message, add morse char (& space if not last char) - if
		// message char is space add " / "
		for (int i = 0; i < message.length(); i++) {
			try {
				c = message.charAt(i);

				// if current char is a space - add " / " to result string
				if (c.equals(' ')) {
					result += " / ";
				} else {
					// find the key (morse) for current char value
					// for
				}
			} catch (Exception e) {

			}
		}
		return result;
	}

	public String translate(String morse) {
		String result = "";
		// Split string on / (new word)
		String[] words = morse.split(" / ");

		// Split words on spaces (new character)
		for (String w : words) {
			String[] characters = w.split(" ");

			// add alphabet equivalent for each morse character to the result string
			for (String c : characters) {
				try {
					result += morseAlphabet.get(c);
				} catch (Exception e) {
					System.out.println("Invalid morse character");
				}
			}

			// add space in between words
			result += " ";
		}

		return result;
	}

}

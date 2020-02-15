package com.tutorialspoint;

public class TextEditor {

	private SpellChecker spellChecker;
	
	private String name;
	
	public void setspellChecker (SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getspellChecker() {
		return spellChecker;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	
}

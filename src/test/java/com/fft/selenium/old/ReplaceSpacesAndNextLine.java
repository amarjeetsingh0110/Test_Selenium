package com.fft.selenium.old;

public class ReplaceSpacesAndNextLine {
public static void main(String[] args) {
	String in = "This is my text.\n\tAnd here is a new line";
	System.out.println(in);

	String out = in.replace("\n", ":");
	System.out.println(out);
}
}

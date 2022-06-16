package testcases;

import java.util.regex.Pattern;

public class Username {
	public String validUsername(String username) {
		System.out.println(Pattern.matches("[A-Za-z]{6}", username));
		return username;
	}
}
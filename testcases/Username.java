package testcases;

import java.util.regex.Pattern;

public class Username {
	public String validUsername(String username) {
		System.out.println(Pattern.matches("[A-Z]+[A-Za-z]{6}", username));
		return username;
	}
	public String validPassword(String password) {
		System.out.println(Pattern.matches("^([A-Z]?)"+"([a-z]?)"+"([0-9]?)"+"([@!$]?.{8,20})", password));
		return password;
	}
}
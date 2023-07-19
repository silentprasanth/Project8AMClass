package org.exl;

public class VowelsCount {

	public static void main(String[] args) {
	    String s="welcome";
	    int vowels=0;
	    int nonvowels=0;
	    for(int i=0;i<s.length();i++) {
	    	char c=s.charAt(i);
	    	if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
	    		vowels++;
	    	}
	    	else {
	    		nonvowels++;
	    	}
	    }
	    System.out.println(vowels);
	    System.out.println(nonvowels);
	}

}

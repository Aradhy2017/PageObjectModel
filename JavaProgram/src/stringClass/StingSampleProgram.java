package stringClass;

public class StingSampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str ="JavaBasic";
        System.out.println("length of string "+str.length());
        System.out.println("Character at 3rd position: "+str.charAt(3));
        System.out.println("Substring from index : "+str.substring(3));
        System.out.println("Substring from 2 to 5:"+str.substring(2, 5));
        System.out.println("Substring from 2 to 6:"+str.substring(2, 9));
        String s2 = "Java";
        String s3 = "Basic";
        System.out.println("First value of s2: "+s2);
        System.out.println("Second value of s3: "+s3);
        System.out.println("Concated string :"+s2.concat(s3));
        String p1="Pune";
        String p2="Mumbai";
        String s4=s2.concat(s3);
        System.out.println(s4);
        String s5 =p1.concat(p2);
        System.out.println(s5);
        String s6=s4.concat(s5);
        System.out.println(s6);
        String s8 = "Learn Share Learn Share";
        System.out.println("length of string: "+s8.length());
        System.out.println("Index of 'Share' starts from: " + s8.indexOf("Share"));
        System.out.println(" Index of a  = " +s8.indexOf('a',3));
        System.out.println(" Index of e  = " +s8.indexOf('e',11));
        System.out.println("Last Index of :" +s8.lastIndexOf("Learn",18));
        System.out.println(" Index of e  = " +s8.lastIndexOf('e',11));
        String s9="Selenium";
        String s10="selenium";
        String s11="Selenium";
        System.out.println("Checking Equality of s9 & s10: " + s9.equals(s10));
        System.out.println("Checking Equality of s9 & s10: " + s9==s10);
        System.out.println("Checking Equality of s9 & s10 with Ignore case: " + s9.equalsIgnoreCase(s10));//
        String word1 = "CoreJava";
        System.out.println("Word1 to lower case "+word1.toLowerCase());
        System.out.println("Word1 to Upper case "+word1.toUpperCase());
        String word2 = "    Learn Share Learn    ";
        System.out.println("To print word2 "+word2);
        System.out.println("The length of word2 is:" +word2.length());
        System.out.println("Trim of word2 is "+word2.trim());
        System.out.println("The length of trim  word2 is:" +word2.trim().length());
        String str1 = "CoreJavaBasic";
        System.out.println("Original String: " + str1);
        System.out.println("Replace string is: "+str1.replace('a','x'));
        String str2 = str1.replace('a' ,'x') ;
        System.out.println("Replace string is: "+str2);
        String str3 =str1.replace("Java","NET");
        System.out.println("Replace java with Net :"+str3);
        String str4 =str1.replaceFirst("a", "w");
        System.out.println(str4);
        String str5="";
        System.out.println("str5 is empty or not :"+str5.isEmpty());
        String str6=new String();
        System.out.println("str6 is empty or not: "+str6.isEmpty());  
        
        
	}

}

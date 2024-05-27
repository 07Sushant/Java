package q29133;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class AnagramChecker{
public static void main(String[]  args){ 
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
String str2 = sc.nextLine();
if(areAna(str1, str2))
{
System.out.println(str1 + " and " + str2 + " are anagrams");
}
else{
System.out.println(str1 + " and " + str2 + " are not anagrams");

}
}
public static boolean areAna(String str1, String str2)
{
str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
str2 = str2.replaceAll("[^a-zA-Z0-9]", "");
if(str1.length() != str2.length())
{
return false;
}
char[] charArray1 = str1.toCharArray();
char[] charArray2 = str2.toCharArray();
Arrays.sort(charArray1);
Arrays.sort(charArray2);
return Arrays.equals(charArray1, charArray2);
}
}



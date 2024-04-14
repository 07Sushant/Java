public static List<String> restoreIpAddresses(String s) {
List<String> result = new ArrayList<>();
if (s == null || s.length() < 4 || s.length() > 12) {
return result;
}
backtrack(result, s, "", 0, 0);
return result;
}

private static void backtrack(List<String> result, String s, String current, int segmentStart, int dots) {
if (dots == 3) {
String segment = s.substring(segmentStart);
if (isValidSegment(segment)) {
result.add(current + segment);
}
return;
}

for (int i = 1; i <= 3 && segmentStart + i <= s.length(); i++) {
String segment = s.substring(segmentStart, segmentStart + i);
if (isValidSegment(segment)) {
backtrack(result, s, current + segment + ".", segmentStart + i, dots + 1);
}
}
}

private static boolean isValidSegment(String segment) {
if (segment.length() > 1 && segment.startsWith("0")) {
return false;
}
int num = Integer.parseInt(segment);
return num >= 0 && num <= 255;
}

public static void main(String[] args) {
String input1 = "25525511135";
String input2 = "25011255255";
String input3 = "25505011535";
String input4 = "25505011535555";

List<String> result1 = restoreIpAddresses(input1);
for (String ipAddress : result1) {
System.out.println(ipAddress);
}

List<String> result2 = restoreIpAddresses(input2);
for (String ipAddress : result2) {
System.out.println(ipAddress);
}

List<String> result3 = restoreIpAddresses(input3);
if (result3.isEmpty()) {
System.out.println("Empty");
}

List<String> result4 = restoreIpAddresses(input4);
if (result4.isEmpty()) {
System.out.println("Invalid");
}
}
}
package week1.day2;

public class LearnNew {

	public static void main(String[] args) {

		String text = "youmybemylove";

		int len = text.length();
		Boolean startstng=text.startsWith("love");
		System.out.println(startstng);
		String replacedstng=text.replace("love","baby");
		System.out.println(replacedstng);
	String repFirst=text.replaceFirst("love","kid");
	System.out.println(repFirst);
	String allReplace=text.replaceAll("love","Jaan");
	System.out.println(allReplace);
	String constrng=text.concat(" forever");
	System.out.println(constrng);

			Boolean containStng=text.contains("love");
			System.out.println(containStng);
		int num=text.indexOf("o");
		System.out.println(num);
			
		System.out.println(text.isEmpty());
		System.out.println(text.valueOf("love"));
			
		}

	}

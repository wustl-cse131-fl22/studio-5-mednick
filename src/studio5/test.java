package studio5;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub String result = "";
		// TODO: Finish this method

		System.out.println(substituteAll("MyStringi", 'i', "HHH"));

	}

	public static String substituteAll(String source, char target, String replacement) {
		// TODO: Finish this method
		/*
		String result = "";
		int length = source.length();
		while(length>0) {
		int t = source.indexOf(target);
			result = (source.substring(0, t) + replacement);
			source = (source.substring(t + 1));
		}
		*/
		String result = "";
		String starget = "" + target;
		return source.replace(starget, replacement);
	}

}

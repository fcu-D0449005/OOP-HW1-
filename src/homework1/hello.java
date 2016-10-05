package homework1;

public class hello {

	public static void main(String[] args) {
		String lyrics="Let it go! Let it go! Cannot hold it back anymore";
		String lyrics1="it";
		String lyrics2="\"her\"";
		String Result;
		Result = lyrics.replace(lyrics1,lyrics2);
		String Result1="Cannot";
		String Result2="Can't";
		String Result3;
		Result3 = Result.replace(Result1,Result2);
		System.out.println(Result3);
	}
}

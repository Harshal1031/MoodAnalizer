package projectdemoJunit;

public class MoodAnalyzer {

	public Object moodForSad(String str) {
		String str2="I am in Sad Mood";
		if(str.equals(str2))
		return "SAD";
		else
			return null;
	}

	public Object moodForAny(String string) {
		if(string.equals("I am in Any Mood"))
			return "HAPPY";
		else
			return null;
	}

}

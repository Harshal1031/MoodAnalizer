package projectdemoJunit;

public class MoodAnalyzer {
	private static final Exception NullPointerException = null;
	String msg;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String msg) {
		this.msg = msg;
	}

	public Object moodForSad(String str) {
		String str2 = "I am in Sad Mood";
		if (str.equals(str2))
			return "SAD";
		else
			return null;
	}

	public Object moodForAny(String string) {
		if (string.equals("I am in Any Mood"))
			return "HAPPY";
		else
			return null;
	}

	public Object testMoodForSadwithConstructor() {
		if (this.msg.equals("I am in Sad Mood") || this.msg.equals("I am in Happy Mood"))
			return "SAD";
		else
			return null;
	}

	public Object testMoodForNoOrNullUsingConstructor() {
		try {
			if (this.msg.equals(null)) {
				throw new NullPointerException();
			}

		} catch (NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
            return "HAPPY";
		}
		return "SAD";
	}

}

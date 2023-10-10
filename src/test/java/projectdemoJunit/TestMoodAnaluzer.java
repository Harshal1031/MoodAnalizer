package projectdemoJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoodAnaluzer {
     MoodAnalyzer mood=new MoodAnalyzer();
	@Test
	public void testMoodForSad() {
      String str="I am in Sad Mood";
      assertEquals("SAD" ,mood.moodForSad(str));
	}
	
	@Test
	public void tesMoodForAny() {
	      assertEquals("HAPPY" ,mood.moodForAny("I am in Any Mood"));

	}
	@Test
	public void testMoodForSadUsingConstructor() {
	     MoodAnalyzer mood2=new MoodAnalyzer("I am in Sad Mood");
	     assertEquals("SAD",mood2.testMoodForSadwithConstructor());

	}
	@Test
	public void testMoodForHappyUsingConstructor() {
	     MoodAnalyzer mood2=new MoodAnalyzer("I am in Happy Mood");
	     assertEquals("SAD",mood2.testMoodForSadwithConstructor());

	}
	@Test
	public void testMoodForNoOrNullUsingConstructor() {
	     MoodAnalyzer mood2=new MoodAnalyzer(null);
	     assertEquals("HAPPY",mood2.testMoodForNoOrNullUsingConstructor());

	}


	
	
	

}

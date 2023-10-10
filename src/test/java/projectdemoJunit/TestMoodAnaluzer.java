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
	
	
	

}

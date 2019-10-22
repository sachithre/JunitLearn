import static org.junit.Assert.*;


import org.junit.Test;

public class StringHelperTest {
StringHelper helper = new StringHelper();
	
	//input AACD --> output CD
	@Test
	public final void testTruncateAInFirst2Positions_Ainfirst2Positions() {
		//expected , actual
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD")); 	
	}
	
	//input ACD --> output CD
		@Test
		public final void testTruncateAInFirst2Positions_AinfirstPositions() {
			assertEquals("CD", helper.truncateAInFirst2Positions("ACD")); 		
		}
		
	//input CDFG --> output CDFG
		@Test
		public final void testTruncateAInFirst2Positions_ANotInAnyPositions() {
			assertEquals("CDFG", helper.truncateAInFirst2Positions("CDFG")); 		
		}
		
	//input CDAF --> output CDAF
		@Test
		public final void testTruncateAInFirst2Positions_AInAnyPositionsExceptFrist2Positions() {
			assertEquals("CDAF", helper.truncateAInFirst2Positions("CDAF")); 
		}
		
	//input CDAA --> output CDAA
		@Test
		public final void testTruncateAInFirst2Positions_AInLast2Positions() {
			assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA")); 

		}
		
	//input ABCD --> output false
		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeCase() {
			assertFalse( helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		}
		
	//input ABAB -- output true
		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveeCase() {
			assertTrue( helper.areFirstAndLastTwoCharactersTheSame("ABAB"));	
		}
		
	//input AB --> output true
		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_OnlyTwoLetters() {
			assertTrue( helper.areFirstAndLastTwoCharactersTheSame("AB"));	
		}
				
	//input A --> output false
		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_SingleLetter() {
			assertFalse( helper.areFirstAndLastTwoCharactersTheSame("A"));	
		}

}

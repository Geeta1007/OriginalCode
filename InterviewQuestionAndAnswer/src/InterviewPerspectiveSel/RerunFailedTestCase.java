package InterviewPerspectiveSel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTestCase {
	
	
//	1. manually rerun testng failed testcase under test output folder
//	2. using IRetryAnalyzer  // this we need to manually give in each test //class - RetryListener
//	3. using IAnnotationTransformer // this listener we can mention only once in textNg xml file. also need RetryAnalyzer class // class - Transformer
//	listener should be defined as class-name not as only name
	
		@Test
		public void testCase1() {
			Assert.assertEquals(false, true);
		}
		
		@Test
		public void testCase2() {
			Assert.assertEquals(false, true);
		}
		
//		@Test(retryAnalyzer=RetryListener.class)
//		public void testCase3() {
//			Assert.assertEquals(false, true);
//		}
	}

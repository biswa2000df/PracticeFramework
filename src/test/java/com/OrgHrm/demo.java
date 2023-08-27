package com.OrgHrm;

import org.testng.annotations.Test;

public class demo extends Base {
	GmailLoginPage loginPage;

	  public demo() {
		  init();
	
	  }

	@Test
	public void test1() {
//		init();
		loginPage = new GmailLoginPage(driver);

		loginPage.SearchBar("iphone");
		loginPage.SearchBtn();

	}

}

package tescases;



import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import Base.utilities.BaseClass;
import objectfactory.PageElements;


public class Testcase1 extends BaseClass{
	
	
	@Test
	public void login() throws Exception {
		Reporter.log("Test case started",true);
		
	logg=r.createTest("TC1");
	logg.info("Starting applictaion");
		PageElements logss=PageFactory.initElements(driver,PageElements.class);
		
		String use = d.config("Sheet1", 0, 0);
		String pwd=d.config("Sheet1", 0, 1);
		
		logss.action(use,pwd);
		logg.info("login success");
		
		Reporter.log("Test case executed succesfully...",true);
	}
	
	@Test
	public void login1() throws Exception {
		Reporter.log("Test case started",true);
		
	logg=r.createTest("TC2");
		logg.info("login success");
		org.testng.Assert.fail();
		Reporter.log("Test case executed succesfully...",true);
	}

}

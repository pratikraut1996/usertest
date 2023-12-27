package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
@Test
	//public static void main(String[] args) {
public void tc002() {
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewemp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
		

	}
}





	



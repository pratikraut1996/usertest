package testNG_Example;

import org.testng.annotations.Test;

public class Exp_testng01 {
@Test
public void login() {
	System.out.println("Login completed");
	}
@Test
public void logout() {
	System.out.println("Logout completed");
}
@Test
public void Addemp() {
	System.out.println("Add new emp");
}
@Test
public void delemp() {
	System.out.println("delete emp");
}
}

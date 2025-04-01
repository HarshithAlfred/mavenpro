package Test_java;

import org.testng.Assert;
import org.testng.annotations.Test;

import Dev_java.App;


public class Apptest {
@Test

public void test1()
{
	App myapp=new App();
	Assert.assertEquals(0,myapp.userLogin("shri","shri123"));
}

@Test
public void test2()
{
	App myapp=new App();
	Assert.assertEquals(1,myapp.userLogin("shri","shri@123"));
}
}

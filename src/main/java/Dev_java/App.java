package Dev_java;

import java.util.ResourceBundle;

public class App {
public int userLogin(String in_user, String in_password)
{
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String userNAme=rb.getString("username");
	String password=rb.getString("password");
	
	if(in_user.equals(userNAme) && in_password.equals(password))
		return 1;
	else
		return 0;
}
}

package dataprovider.login;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import base.dataproviderbase.JsonReader;

public class LoginDP {

	@DataProvider(name = "realizarLoginComSucesso")
	
	public static Object[][] realizarLoginComSucesso() throws IOException {
		/* Object[][] ob = JsonReader.getdata("src/test/java/datajson/login/realizarLoginComSucesso.json", "realizarLoginComSucesso");
		 System.out.println(ob);*/
		 return JsonReader.getdata("src/test/java/datajson/login/realizarLoginComSucesso.json", "realizarLoginComSucesso");
	}

}

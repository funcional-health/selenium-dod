package execution.login;

import java.io.IOException;

import org.testng.annotations.Test;

import base.testbase.Hooks;
import dataprovider.login.LoginDP;
import testcase.login.LoginTC;

 
public class Login extends Hooks {

	LoginTC loginTC;
	LoginDP loginDP;
 	 	
    @Test(priority = 0 , dataProvider = "realizarLoginComSucesso",dataProviderClass=LoginDP.class)
    public void realizarLoginComSucesso(
    		String usuario,
    		String idtLogin,
    		String idtSenha, 
    		String senha,
    		String idtEntrar,
    		String url) throws IOException{

		 loginTC = new LoginTC();
		 loginTC.realizarLoginComSucesso(usuario, idtLogin, idtSenha, senha, idtEntrar, url);		 
	     
    }
}

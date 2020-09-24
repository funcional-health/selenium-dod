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
    		String url,
    		String nomecampo,
    		String elemento_id,
    		String tipodado,
			String rn_obrigatoriedade,
			String msg_obrigatoriedade
    		) throws IOException{

    	
		 loginTC = new LoginTC();
		 loginTC.realizarLoginComSucesso(usuario, idtLogin, idtSenha, senha, idtEntrar, url, nomecampo,elemento_id,tipodado,rn_obrigatoriedade,msg_obrigatoriedade);
		 /*JSONParser parser = new JSONParser();
		 JSONObject json  = null;
		 try {
			json = (JSONObject) parser.parse(elementos);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
/*		 JsonObject obj = new JsonParser().parse(el).getAsJsonObject();
		System.out.println(obj);*/
		 //Gson g = new Gson();
		// Elemento  elemento = g.fromJson(el, Elemento.class);
		// System.out.println(elemento);
		
		 
		 	
		 
	     
    }
}

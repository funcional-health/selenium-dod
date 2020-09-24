package testcase.login;

import java.util.ArrayList;
import java.util.Iterator;

import pageobject.login.LoginPO;

public class LoginTC {
	LoginPO loginPO;
	
	public LoginTC() {
		loginPO = new LoginPO();
	}
	
	//autenticação com sucesso
	
	public void realizarLoginComSucesso(
			String idtLogin,
			String usuario,
			String idtSenha,
			String idtEntrar,
			String senha,
			String url,
			ArrayList<Object> elementos) {

		loginPO.setTxtUsuario(idtLogin,usuario);
		loginPO.setTxtSenha(idtSenha,senha);
		loginPO.entrar(idtEntrar);
		loginPO.Navegando(url);
		//loginPO.submitSenha();
		Iterator<Object> iter =  elementos.iterator();
		while (iter.hasNext()){
			Object elemento = iter.next();
			System.out.println(elemento);
		/*	switch(elemento.tipodado) {
				
				"campointeiro":
					System.println(elemento.tipodados);
				break;*/
			
				
		}
	}
	

}

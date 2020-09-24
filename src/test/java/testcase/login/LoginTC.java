package testcase.login;

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
			String url) {

		loginPO.setTxtUsuario(idtLogin,usuario);
		loginPO.setTxtSenha(idtSenha,senha);
		loginPO.entrar(idtEntrar);
		loginPO.Navegando(url);
		//loginPO.submitSenha();
	}
	

}

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
			String url,
			String nomecampo,
			String elemento_id,
    		String tipodado,
			String rn_obrigatoriedade,
			String msg_obrigatoriedade) {

		loginPO.setTxtUsuario(idtLogin,usuario);
		loginPO.setTxtSenha(idtSenha,senha);
		loginPO.entrar(idtEntrar);
		loginPO.Navegando(url);
		//System.out.println(tipodado);
		switch(tipodado){
			case "numerico":
				loginPO.verifyCharacterAccepted(elemento_id,nomecampo);
				break;
		}
				
		
		/*Iterator<String> keys = elementos.
		for ( Iterator<String> Keys = elementos.keys(); Keys.hasNext(); ) {
		    System.out.println( elementos.get( Keys.next() ).toString() );
		}*/
		//Iterator<Object> iter =  elementos.iterator();
		//
		}
}
	

package pageobject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.testbase.TestBase;

public class LoginPO extends TestBase {
	
	
	public void setTxtUsuario (String idtLogin,String text) {
	By txtUsuario = By.id(idtLogin);
		waitAllRequest();
		setText(txtUsuario, "Usuário", text);
		}
	
	public void setTxtSenha(String idtSenha,String text) {
    By txtSenha = By.id(idtSenha);
    setText(txtSenha, "Senha", text);
   }
	
	public void entrar(String idtEntrar) {
		By btnEntrar = By.className(idtEntrar);
		clickButton(btnEntrar, "Senha");
	}
	
	
	public void Navegando (String url) {
		getDriver().navigate().to(url);
	}
	
	/*public void submitSenha() {
	submitInput(txtSenha, "Senha");}*/

	
	
	public void verifyCharacterAccepted(String elemento_id , String nomecampo) {
		By elementoid = By.id(elemento_id);
		setText(elementoid, nomecampo , "ABC");
	    verifyByElementAttribute(elementoid, "value", nomecampo, "");
	    //verifyByElementText(elementoid, nomecampo, "");
		//verifyByElementText(elementoid, "campo testado", "");
		}
	
	
}

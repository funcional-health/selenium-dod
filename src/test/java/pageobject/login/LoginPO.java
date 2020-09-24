package pageobject.login;

import org.openqa.selenium.By;
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

	By pnAviso = By.id("swal2-content");
	public void VerifyTextPnAviso(String text) {
	verifyByElementText(pnAviso, "Aviso", text);}
	
	
}

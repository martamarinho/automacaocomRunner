package ElementosAdvantegeDemo;

import org.openqa.selenium.By;

public class ElementosdeTela {

	private By btnLogar = By.id("menuUser");

	private By btnCriarConta = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");

	private By cpUseNameCadastro = By.name("usernameRegisterPage");

	private By cpUserEamilCadastro = By.name("emailRegisterPage");

	private By cpSenhaCadastro = By.name("passwordRegisterPage");

	private By cpConfirmSenhaCadastro = By.name("confirm_passwordRegisterPage");

	private By checkBoxAceitarPoliCadastro = By.name("i_agree");

	private By btnRegistrar = By.id("register_btn");

	private By btnLogado = By.id("menuUserSVGPath");

	private By btnMinhaConta = By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]");

	private By btnDeletarConta = By.xpath("//*[@id=\"myAccountContainer\"]/div[6]/button");

	private By msgDeletarConta = By.xpath("//*[@id=\"deleteAccountPopup\"]/div[2]");

	private By btnSimDeletarConta = By.xpath("//*[@id=\"deleteAccountPopup\"]/div[3]/div[1]");

	private By btnNotebook = By.xpath("//*[@id=\"see_offer_btn\"]");
	
	
	
	public By getBtnMinhaConta() {
		return btnMinhaConta;
	}

	public void setBtnMinhaConta(By btnMinhaConta) {
		this.btnMinhaConta = btnMinhaConta;
	}

	public By getBtnDeletarConta() {
		return btnDeletarConta;
	}

	public void setBtnDeletarConta(By btnDeletarConta) {
		this.btnDeletarConta = btnDeletarConta;
	}

	public By getMsgDeletarConta() {
		return msgDeletarConta;
	}

	public void setMsgDeletarConta(By msgDeletarConta) {
		this.msgDeletarConta = msgDeletarConta;
	}

	public By getBtnSimDeletarConta() {
		return btnSimDeletarConta;
	}

	public void setBtnSimDeletarConta(By btnSimDeletarConta) {
		this.btnSimDeletarConta = btnSimDeletarConta;
	}

	public By getBtnCriarConta() {
		return btnCriarConta;
	}

	public By getCpUseNameCadastro() {
		return cpUseNameCadastro;
	}

	public void setCpUseNameCadastro(By cpUseNameCadastro) {
		this.cpUseNameCadastro = cpUseNameCadastro;
	}

	public By getCpUserEamilCadastro() {
		return cpUserEamilCadastro;
	}

	public void setCpUserEamilCadastro(By cpUserEamilCadastro) {
		this.cpUserEamilCadastro = cpUserEamilCadastro;
	}

	public By getCpSenhaCadastro() {
		return cpSenhaCadastro;
	}

	public void setCpSenhaCadastro(By cpSenhaCadastro) {
		this.cpSenhaCadastro = cpSenhaCadastro;
	}

	public By getCpConfirmSenhaCadastro() {
		return cpConfirmSenhaCadastro;
	}

	public void setCpConfirmSenhaCadastro(By cpConfirmSenhaCadastro) {
		this.cpConfirmSenhaCadastro = cpConfirmSenhaCadastro;
	}

	public By getCheckBoxAceitarPoliCadastro() {
		return checkBoxAceitarPoliCadastro;
	}

	public void setCheckBoxAceitarPoliCadastro(By checkBoxAceitarPoliCadastro) {
		this.checkBoxAceitarPoliCadastro = checkBoxAceitarPoliCadastro;
	}

	public By getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(By btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public By getBtnLogado() {
		return btnLogado;
	}

	public void setBtnLogado(By btnLogado) {
		this.btnLogado = btnLogado;
	}

	public void setBtnLogar(By btnLogar) {
		this.btnLogar = btnLogar;
	}

	public void setBtnCriarConta(By btnCriarConta) {
		this.btnCriarConta = btnCriarConta;
	}

	public By getBtnLogar() {
		return btnLogar;
	}

	public By getBtnNotebook() {
		return btnNotebook;
	}

}

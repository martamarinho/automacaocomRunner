package Steps;

import java.io.IOException;

import ElementosAdvantegeDemo.ElementosdeTela;
import MetodosAdvantegeDemo.MetodosdeTela;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;

public class Steps {

	MetodosdeTela m = new MetodosdeTela();
	ElementosdeTela e = new ElementosdeTela();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		m.abrirNavegador(string);
	}

	@Quando("eu clicar no icon de logar")
	public void eu_clicar_no_icon_de_logar() {
		m.clicar(e.getBtnLogar());
	}

	@Quando("clicar para criar nova conta")
	public void clicar_para_criar_nova_conta() throws InterruptedException {
		m.pausar(4000);
		m.clicar(e.getBtnCriarConta());
	}

	@Quando("preencher dados obrigatorios")
	public void preencher_dados_obrigatorios() throws InterruptedException, IOException {
		m.pausar(4000);
		m.preencher(e.getCpUseNameCadastro(), " testequarteto");
		m.preencher(e.getCpUserEamilCadastro(), "quarteto@quarteto.com");
		m.preencher(e.getCpSenhaCadastro(), "Quarteto1");
		m.preencher(e.getCpConfirmSenhaCadastro(), "Quarteto1");
		String formulario = "campospreenchidos";
		m.tirarPrint("./formulario/" + formulario + ".png");
	}

	@Quando("clicar no check box de politicas")
	public void clicar_no_check_box_de_politicas() throws InterruptedException {
		// m.scroll(e.getCheckBoxAceitarPoliCadastro());
		m.pausar(2000);
		m.clicar(e.getCheckBoxAceitarPoliCadastro());
	}

	@Quando("criar conta")
	public void criar_conta() {
		m.clicar(e.getBtnRegistrar());
	}

	@Quando("clicar para acessar minha conta")
	public void clicar_para_acessar_minha_conta() throws InterruptedException {
		m.pausar(2000);
		m.clicar(e.getBtnLogado());
		m.clicar(e.getBtnMinhaConta());
	}

	@Quando("clicar para deletar a conta")
	public void clicar_para_deletar_a_conta() throws InterruptedException, IOException {
		m.pausar(2000);
		m.clicar(e.getBtnDeletarConta());
		m.validartexto(e.getMsgDeletarConta(), "Are sure you want to delete account?");
		m.clicar(e.getBtnSimDeletarConta());

	}

	@Então("a conta sera deletada com sucesso")
	public void a_conta_sera_deletada_com_sucesso() throws IOException, InterruptedException {
		m.pausar(2000);
		String evidencia = "contadeletada";
		m.tirarPrint("./Evidencia/" + evidencia + ".png");

/////////////////////////////////scroll///////////////////////////////////////////////////
	}

	@Quando("dar um scroll ate o btn do notebook")
	public void dar_um_scroll_ate_o_btn_do_notebook() {
		// m.scroll("//*[@id=\"see_offer_btn\"]");
	}

	@Quando("clicar no botao para comprar o notebook")
	public void clicar_no_botao_para_comprar_o_notebook() throws IOException, InterruptedException {
		m.pausar(6000);
		m.clicar(e.getBtnNotebook());
		m.pausar(2000);
		String notebook = "notebook";
		m.tirarPrint("./notebook/" + notebook + ".png");
	}

	@Entao("serei direcionado a tela de compra do produto")
	public void serei_direcionado_a_tela_de_compra_do_produto() {

	}
}
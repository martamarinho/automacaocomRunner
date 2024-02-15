#language : pt
@tag
Funcionalidade: criar minha conta e deletar conta no site advantage
  @tag1
  Cenario: criar e deletar conta
   Dado que eu esteja no site "https://www.advantageonlineshopping.com/#/"
   Quando eu clicar no icon de logar 
   E clicar para criar nova conta 
   E preencher dados obrigatorios
   E clicar no check box de politicas 
   E criar conta 
   E clicar para acessar minha conta
   E clicar para deletar a conta 
   Então a conta sera deletada com sucesso
   
   @tag2 
   Cenario: dar scroll 
   Dado que eu esteja no site "https://www.advantageonlineshopping.com/#/"
   Quando dar um scroll ate o btn do notebook
   E clicar no botao para comprar o notebook 
   Entao serei direcionado a tela de compra do produto


   
# CadastroDeCliente
Atividade: trabalhando com códigos, telas e github de forma conjunta

Olá professor Márcio, segue neste repositório git:

- Projeto Java
- Diagrama
- Script MySQL

OBS.: PARA TESTAR O PROJETO NA SUA MÁQUINA, SERÁ NECESSÁRIO ALTERAR 
O CAMINHO DO HOST NA CLASSE: "ConnectionFactory.java" E EXECUTAR O SCRIPT 
DO REPOSITÓRIO. NELE CONSTA ALGUNS INSERTS, POIS EU HAVIA CADASTRADO 
ALGUMAS VEZES PARA TESTAR!

*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=*#-=

##SOBRE##	

-DESCRIÇÃO:

Este projeto será, em breve, um PDV (Ponto de Vendas) de uma loja de artigos
de pesca fictícia chamada Golden Fish Store. No presente momento (vide data) o
sistema é capaz de cadastrar clientes, cadastrar usuários e realizar o login. O sistema
está sendo desenvolvido em Java no front-end e back-end; e o SGBD MySQL para 
armazenamento dos dados cadastrados.

-LOGO:

 Desenvolvida em parceria com a plataforma on-line Tailor Brands (tailorbrands.com).

![logo_loja_2](https://user-images.githubusercontent.com/64413261/98609816-f68c6180-22cc-11eb-9bd4-48bee6e96f7f.PNG)

........................................................
ATUALIZAÇÃO: 21/10/2020  :
.......................................................:
Primeira Versão do Projeto Final:

##JAVA##

*TELAS: 

-CadastroCliente.java
-frmCadastroUsuario.java
-frmLogin.java

*CLASSES:
				-Pessoa.java;           -> MODEL
				-Usuario.java;         -> MODEL
				--------------------------
				-ClientDAO.java;     ->DAO
				-UsuarioDAO.java.  -> DAO
				--------------------------
				-ConnectionFactory.java. -> CONNECTION FACTORY

*OUTROS:
				-Arquivos de imagem;
				-Bibliotecas;
				-Diagrama de Classes.				
				![diagrama_atualizado_10-10](https://user-images.githubusercontent.com/64413261/98609590-58989700-22cc-11eb-95b9-1d753814853f.PNG)

##MYSQL##

*TABELAS:
				-tbcliente;  -> 4 colunas (id, nome, cpf, sexo).
				-tbusuario; -> 3 colunas (idUsuario, nomeUsuario, senhaUsuario).

*DIAGRAMAS:
				-DER (diagrama de entidade e relacionamento).
				![DER](https://user-images.githubusercontent.com/64413261/98609522-30109d00-22cc-11eb-8b32-386791c1b30c.PNG)	
				
........................................................
ATUALIZAÇÃO: 06/12/2020  :
.......................................................:		

##JAVA##

*TELAS: 
				-frmTelaPrincipal.java; 
				-frmLogin.java;
				-internalCadCli.java;
				-internalCadProd.java;
				-internalCadUsu.java;
				-internalCatalogo.java;
				-intrnalIniciaVenda.java;
				-internalPDV.java;
				-internalPagamento.java.

*CLASSES:
				-Pessoa.java;           -> MODEL
				-Usuario.java;         -> MODEL
				-Venda.java;           -> MODEL
				-ItensVenda.           -> MODEL
				--------------------------
				-ClientDAO.java;     ->DAO
				-UsuarioDAO.java;    -> DAO
				-VendaDAO.java;      -> DAO
				-ItensVendaDAO.java. -> DAO
				--------------------------
				-ConnectionFactory.java. -> CONNECTION FACTORY

*OUTROS:
				-Arquivos de imagem;
				-Bibliotecas;

##MYSQL##

*TABELAS:
				-tbcliente;  -> 4 colunas (id, nome, cpf, sexo).
				-tbusuario; -> 3 colunas (idUsuario, nomeUsuario, senhaUsuario).
				-tbProduto; -> 5 colunas (idProduto, nomeProduto, descricao, custo, venda).
				-tbVenda;  -> 5 colunas (idVenda, idClienteFK, data, tempo, formaPagamento).
				-tbItensVenda; -> colunas (idItemVenda, idVendaFK, idProdutoFK, quantidade, valorUnit, valorItem).
*DIAGRAMAS:
				-DER (diagrama de entidade e relacionamento).
				-Diagrama de Classes
				![DER](https://user-images.githubusercontent.com/64413261/98609522-30109d00-22cc-11eb-8b32-386791c1b30c.PNG)
				![diagrama_atualizado_06-12](https://embed.creately.com/HaZkRuoOyOV?type=svg)

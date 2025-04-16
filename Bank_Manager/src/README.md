===== GERENCIADOR DE PRODUTOS EM JAVA =====

- Crie um novo repositório no GitHub
- Clone esse repositório em seu computador
- Crie um projeto Java dentro desse repositório e envie o projeto base ao GitHub
- Crie um gerenciador de bancário em Java, que deve conter:
	- Cadastrar contas
	- Realizar depósitos
	- Realizar saques
	- Consultar saldo
	- Consultar histórico de movimentações
	- Transferir entre contas
- Para relacionar o valor do saldo com a conta bancária e o histórico de movimentações, utilize matrizes:
	[
		["Conta do Ivens", 1.000,00],
		["Conta da Tamires", 3.000,00].
	]
- Ao finalizar o projeto, crie um arquivo readme que exemplifica como utilizar o seu sistema
- Envie o link ao professor

===== COMO UTILIZAR O SISTEMA =====
Para as demais operações funcionarem, primeiro deverá existir ao menos uma conta criada, para isso, utilize a opção "1" do programa para cadastrar uma conta, comece cadastrando o nome do titular da conta, em seguida o número da conta e se terá algum saldo inicial, caso sim, informar o valor
Com a segunda opção, será possível realizar um depósito na conta, basta informar o número da conta e o valor do depósito logo em seguida.
Com a terceira opção, será possível realizar o saque de valores da conta informando o numero da conta e o valor para retirada, caso o saldo fique negativo com essa operação, o sistema irá alertar e questionar se quer continuar com a operação. Negando retornará ao menu, e continuando será realizado o saque ainda assim.
Com a quarta opção, será possível consultar o saldo de uma conta apenas digitando o número da conta desejada.
Com a quinta opção, poderá ser visualizado o histórico de todas as operações (Criação de conta, depósitos, saques e transferências) que já foram realizadas desde o inicio do programa.
Com a sexta opção, poderá ser realizado uma transferência entre uma conta e outra, para isso, deverá ter sido informado ao menos duas contas (Criadas pela opção "1"), primeiro deverá ser informado de qual conta e qual valor deverá ser transferido, depois para qual conta receber.
Com a sétima opção, poderá ser encerrado o programa.
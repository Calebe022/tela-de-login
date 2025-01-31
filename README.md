<h2 align="left">Relatório do Projeto: Tela de Login em Java</h2>

###

<h2 align="left">Introdução</h2>

###

<p align="left">Este projeto foi desenvolvido em Java utilizando a biblioteca Swing, com o objetivo de criar uma tela de login simples e funcional. A aplicação consiste em um formulário onde o usuário pode inserir seu e-mail e senha, e o sistema verifica a validade dessas informações. Caso as entradas sejam válidas, o sistema exibe uma mensagem de sucesso; caso contrário, uma mensagem de erro é mostrada ao usuário.</p>

###

<h2 align="left">Desenvolvimento</h2>

###

<p align="left">O projeto foi implementado utilizando a biblioteca Swing para a criação da interface gráfica. A tela foi organizada utilizando o layout GridBagLayout, permitindo o controle preciso da posição dos componentes na interface.</p>

###

<h4 align="left">Janela Principal: A janela tem título "Tela de Login" e dimensões de 350x220 pixels, com um fundo azul claro, proporcionando uma aparência simples e agradável.</h4>

###

<h4 align="left">Componentes da Interface:</h4>

###

<p align="left">Um título centralizado com o texto "Login" em fonte Arial, negrito, tamanho 20.<br>Campos de entrada para o e-mail e senha com validação de formato e caracteres permitidos.<br>Um botão de login, que executa a autenticação dos dados inseridos pelo usuário.<br>Uma área para mensagens de erro em caso de falhas nas validações.</p>

###

<h4 align="left">Validações:</h4>

###

<p align="left">E-mail: A validação verifica se o e-mail contém o símbolo @ e se está em formato minúsculo.<br>Senha: A senha deve ser composta apenas por letras e números, utilizando uma expressão regular para garantir que apenas esses caracteres sejam permitidos.<br>Se ambos os campos forem válidos, uma mensagem de sucesso é exibida utilizando a classe JOptionPane.</p>

###

<h4 align="left">Funcionalidade de Autenticação: A lógica de autenticação foi implementada no método autenticarUsuario(). Se as entradas forem válidas, o sistema exibe uma mensagem de sucesso e fecha a janela. Caso contrário, uma mensagem de erro específica será exibida na tela.</h4>

###

<h2 align="left">Conclusão</h2>

###

<p align="left">Este projeto demonstrou a criação de uma interface gráfica simples, mas funcional, utilizando Swing. A validação dos campos de e-mail e senha é essencial para garantir que os dados inseridos estejam em conformidade com os requisitos estabelecidos. O código é facilmente extensível e pode ser integrado a sistemas maiores, onde a autenticação real pode ser feita com um banco de dados. Além disso, o uso de uma interface gráfica melhora a interação do usuário com o sistema, tornando a aplicação mais amigável e eficiente.<br><br>Este projeto serve como base para o desenvolvimento de sistemas de autenticação mais complexos, como aqueles que envolvem integração com bancos de dados ou autenticação via redes sociais.</p>

###

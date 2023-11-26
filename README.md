O tema do projeto é: “Gerenciamento de livros”

Instruções
1. O sistema deve ser uma solução desktop com interface gráfica e banco de dados.
2. A interface gráfica deve ser desenvolvida utilizando-se classes do pacote javax.swing.
3. O banco de dados deve ser gerenciado pelo MySQL ou pelo PostgreSQL.
4. O sistema deve ter controle de acesso: somente usuários autenticados podem ter acesso a suas funcionalidades.
5. Deve haver dois tipos de usuários no sistema: usuários administradores e comuns.
6. Um usuário administrador será cadastrado diretamente na base de dados, previamente.
7. Administradores devem ter acesso às seguintes funcionalidades.
a. Cadastro de usuários. Usuários têm, pelo menos, nome, idade, sexo e até dois tipos de livros preferidos. Os tipos são previamente cadastrados e são eles: romance, ficção e técnico.
8. Usuários comuns têm acesso a duas funcionalidades:
  a. Cadastro de livro. Quando um usuário comum faz login, ele é capaz de cadastrar livros que tenha lido. Livros têm, pelo menos, título, autor e tipo. A cada livro cadastrado, um usuário deve associar uma nota de 0 a 10, indicando o quanto ele gostou daquele livro.
  b. Visualização de livros. Usuários comuns devem ser capazes de ver a lista completa de livros cadastrados por todos os usuários do sistema. Ela deve ser ordenada de acordo com a média das notas recebidas, ou seja, livros melhor avaliados aparecem primeiro. A nota média   de um livro é igual ao somatório de todas as notas recebidas dividido pelo número de usuários que já o avaliaram. Se houver empate, os livros que tiveram mais avaliações devem aparecer primeiro. Se empatar novamente, o desempate deve ser feito pelo título do livro.

# GIT Bash

### Códigos úteis e suas funcionalidades

* **mkdir " exemplo"**    _// cria uma nova diretório(pasta)_ 
* **ls**                              _// lista todos os itens contidos dentro do diretório_ 
* **cd "exemplo"**         _// navega para o diretório desejado_ 
* **git init**                     _// inicia um novo diretório .git, oculto, com uma estrutura pronta, o que permite que o git comece de fato a gerenciar o nossos códigos_ 
* **ls -a**                      _//mostra os arquivos ocultos_ 
* **git status**          _// Verifica estado dos arquivos/diretórios_
* **cd ..**                  _// volta um nível nos diretórios_
* **git add * ** 
* **git commit -m "mensagem do commit"**
* **git config --list**   _// retorna a lista de configurações utilizadas pelo GIT (Atenção ao user.nickname e ao user.email)_
* **git config --global --unset user.email** _//reseta seu email configurado_
* **git config --global --unset user.nickname** _//reseta seu nickname configurado_
* **git config --global user.email "seuemail"** //inseri seu email nas configuracoes
* **git config --global user.nickname "seunick"** _// inseri seu nickname nas configuracoes_
* **git push origin master** 
* **git pull origin master** _//puxa o repositorio do github para o seu local - atentar a mensagens de conflitos de merge_
* **git clone url**  _// você faz o download para seu diretorio local de um diretorio contido dentro do github quando se clona, ele vem como um repositorio e não como uma pasta simples. vem todo com a parte do git incluso. você verifica isso se a pasta git esta oculta._
* **git remote -v** _//permite que você veja para onde esse repositorio esta sendo apontado_


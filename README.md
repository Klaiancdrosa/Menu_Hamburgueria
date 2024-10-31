# **App Menu Hamburgueria**
&gt; Desenvolvido para demonstrar a utilização de sistema de trocas de telas e imagens.

## Descrição
O **App Menu Hamburgueria** permite ao usuário trocar entre imagens selecionada e telas do cardápio.

## Funcionalidades
- [x] Interface simples e intuitiva

## Tecnologias Utilizadas
- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **RelativeLayout** para interface responsiva
- [x] **TextView** e **Image Button** para exibição de dados
      
## Como Rodar o Projeto
Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:
```bash
git clone https://github.com/Klaiancdrosa/Menu_Hamburgueria.git
```
2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.
   
## Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java
| | | | |── br.ulbra.menuhamburgueria
│ │ │ │ | ├── MainActivity.java # Atividade aonde ocorre as trocas de imagens e telas da tela principal.
│ │ │ │ | ├── MenuHActivity2.java # Atividade aonde ocorre as trocas de imagens e telas da tela secundária. 
| │ │ │ ├── res
| | | | ├── drawable # imagens e icones utilizados na tela principal
│ │ │ │ ├── layout
│ │ │ │ | ├── activity_main.xml # Layout da primeira tela do cardápio  
│ │ │ │ │ ├── activity_main2.xml # Layout da segunda tela do cardápio  
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

## Design e Prototipage
A interface do app foi criada usando **RelativeLayout**;
O design é minimalista e fácil de usar, com foco na simplicidade e entendimento.

## Telas do App Menu Hamburgueria
**Telas do Cardápio**
Tela que permite ao usuário visualizar o cardápio da hamburgueria que permite a mudança entre tela e troca de imagens.

![image](https://github.com/user-attachments/assets/d24ec3da-c492-40b9-8a84-e30db1ef154e)

![image](https://github.com/user-attachments/assets/74c3d427-5672-465e-a610-8e510f703b7b)

## Desenvolvedores
**Klaian Conceição da Rosa** - Desenvolvedor - [GitHub](https://github.com/Klaiancdrosa)

## Licenças
Este projeto está licenciado sob os termos da licença MIT. Para mais detalhes, veja o arquivo
[LICENSE](LICENSE).

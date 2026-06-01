# 📚 Sistema de Gestão de Biblioteca Acadêmica

Sistema desenvolvido em Java com foco na aplicação de conceitos de **Programação Orientada a Objetos (POO)**, simulando o funcionamento de uma biblioteca universitária. O sistema permite o gerenciamento completo de acervo, usuários, empréstimos e devoluções via interface em console.

---

## ✨ Funcionalidades

- **Cadastro de livros** — título, autor, ISBN, ano de publicação e editora
- **Cadastro de usuários** — alunos e professores, com nome, matrícula, CPF e e-mail
- **Consulta de disponibilidade** — verificação em tempo real se um livro está disponível
- **Empréstimos** — registro com número do empréstimo, usuário, livro(s), data e status
- **Devoluções** — atualização automática do status do empréstimo e do exemplar
- **Listagem do acervo** — exibe ISBN, título, autor, editora e status de cada livro

---

## 🛠️ Tecnologias

| Tecnologia | Detalhe |
|---|---|
| Linguagem | Java (JDK 25) |
| Paradigma | Programação Orientada a Objetos |
| Estruturas de dados | `HashMap` |
| Interface | Console (texto) |
| IDE recomendada | IntelliJ IDEA, Eclipse ou VS Code |

---

## 🏗️ Estrutura do Projeto

```
Sistema-de-Gestao-de-Biblioteca-Academica/
├── src/
│   └── (classes Java do sistema)
├── .idea/                  # Configurações do IntelliJ IDEA
├── .gitignore
├── LICENSE
└── README.md
```

---

## 🧩 Modelagem (UML)

O projeto segue a seguinte estrutura de classes:

```
Usuario (abstrata)
├── Aluno
└── Professor

Livro
Emprestimo
```

- **`Usuario`** — classe base com atributos comuns a alunos e professores
- **`Aluno`** e **`Professor`** — herdam de `Usuario`, com atributos específicos
- **`Livro`** — representa um exemplar do acervo, com controle de disponibilidade
- **`Emprestimo`** — associa um usuário a um ou mais livros, com data e status

---

## 🚀 Como executar

### Pré-requisitos

- [JDK 8 ou superior](https://www.oracle.com/java/technologies/downloads/) instalado
- Uma IDE Java (IntelliJ IDEA, Eclipse, BlueJ ou VS Code com extensão Java)

### Passos

```bash
# 1. Clone o repositório
git clone https://github.com/arthursantos082/Sistema-de-Gestao-de-Biblioteca-Academica.git

# 2. Abra o projeto na sua IDE preferida

# 3. Compile e execute a classe principal (Main ou equivalente)
```

> Se estiver usando o terminal com `javac`:
> ```bash
> cd src
> javac *.java
> java SistemaBiblioteca
> ```

---

## 📋 Requisitos do Sistema

- Java JDK 8 ou superior
- Sistema operacional: Windows, Linux ou macOS
- Sem dependências externas

---

## 📄 Licença

Distribuído sob a licença **GPL-3.0**. Veja o arquivo [LICENSE](./LICENSE) para mais detalhes.

---

## 👤 Autor

**Arthur Santos**
- GitHub: [@arthursantos082](https://github.com/arthursantos082)

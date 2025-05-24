# 📘 Estudo de JPA com Java

Este repositório contém exercícios e exemplos práticos de JPA (Java Persistence API), utilizados para estudo na disciplina de Linguagem de Programação III.

---

## 📚 Conteúdo do Repositório

- ✅ Criação de entidades: `Categoria`, `Produto`, `Fornecedor`, `Pessoa`, `Endereco`, `Telefone`
- ✅ Mapeamento de relacionamentos com JPA (`@OneToOne`, `@OneToMany`, `@ManyToOne`, etc.)
- ✅ Criação de DAOs com métodos:
  - `inserir`
  - `alterar`
  - `excluir`
  - `buscarPorId`
  - `listarTodos`
- ✅ Configuração do `persistence.xml` para integração com banco de dados MySQL

---

## 💡 O que é JPA?

**JPA (Java Persistence API)** é uma especificação padrão do Java para persistência de dados em banco de dados relacionais.  
Ela permite mapear objetos Java para tabelas no banco de dados de forma simples e reutilizável.

### Principais anotações:
| Anotação        | Descrição |
|-----------------|-----------|
| `@Entity`       | Define a classe como uma entidade JPA. |
| `@Id`           | Indica o identificador (chave primária). |
| `@GeneratedValue` | Gera valores automaticamente (ex: `AUTO`, `IDENTITY`). |
| `@OneToMany` / `@ManyToOne` / `@OneToOne` / `@ManyToMany` | Define os relacionamentos. |
| `@JoinColumn`   | Define qual campo faz o join entre entidades. |

---

## 🛠️ Requisitos para rodar o projeto

- NetBeans (ou Eclipse/IntelliJ)
- JDK 17 ou superior
- MySQL
- Driver JDBC MySQL no classpath
- Biblioteca JPA (pode usar Hibernate como implementação)

---

## 🏁 Executando

1. Clone este repositório:
   ```bash
   git clone https://github.com/AmandaCampoos/JPA.git

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
### 🔄 Operações Básicas (CRUD)

```
EntityManager em = // obtido do EntityManagerFactory

// Create
em.persist(objeto);

// Read
Cliente c = em.find(Cliente.class, id);

// Update
em.merge(objeto);

// Delete
em.remove(objeto);

```
## ♻️ Tipos de Arquivos em Aplicação Java com JPA

### Descrição dos Arquivos Principais

#### 1. Entity Classes
**O que são**: Classes Java que representam tabelas no banco de dados  
**Finalidade**: Mapear objetos para registros no banco de dados (ORM)  
**Características**:
- Cada instância representa uma linha na tabela
- Anotadas com `@Entity`
- Campos mapeados para colunas com `@Column`
- Possuem um ID único com `@Id`  
**Exemplo**: `Cliente.java`, `Produto.java`

#### 2. Classes DAO (Data Access Object)
**O que são**: Classes Java comuns (não são Entity Classes)  
**Finalidade**: Contém métodos para operações CRUD no banco de dados  
**Características**:
- Implementam a lógica de acesso a dados
- Usam o EntityManager para interagir com o banco
- Isolam a lógica de persistência do resto da aplicação  
**Exemplo**: `TelefoneDao.java`, `ClienteDao.java`

#### 3. Arquivo persistence.xml
**O que é**: Arquivo de configuração XML (não é uma classe)  
**Finalidade**: Configurar a conexão com o banco e a implementação do JPA  
**Onde fica**: `src/main/resources/META-INF/persistence.xml`  
**Contém**:
- Configurações da conexão (URL, usuário, senha)
- Biblioteca JPA utilizada (ex: EclipseLink)
- Lista das Entity Classes
- Propriedades específicas do provedor JPA

### Fluxo Básico
1. **Entity Classes** definem a estrutura dos dados  
2. **persistence.xml** configura como conectar e gerenciar esses dados  
3. **Classes DAO** implementam as operações usando as Entity Classes e a configuração do persistence.xml




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

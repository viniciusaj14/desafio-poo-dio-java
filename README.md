# Desafio POO (DIO)

Projeto implementado do zero para praticar os pilares de **Programacao Orientada a Objetos (POO)** em Java.

## Pilares aplicados
- Abstracao (`Conteudo` como classe base para `Curso` e `Mentoria`)
- Encapsulamento (atributos privados com getters/setters)
- Heranca (`Curso`/`Mentoria` estendem `Conteudo`)
- Polimorfismo (chamada `calcularXp()` via tipo `Conteudo`)

## Tecnologias
- Java 17+
- GitHub + Git

## Estrutura do projeto
```text
src/
├── Main.java
└── br/com/dio/desafio/dominio/
    ├── Conteudo.java
    ├── Curso.java
    ├── Mentoria.java
    ├── Bootcamp.java
    └── Dev.java
```

## Fluxo de funcionamento (Main.java)
1. Cria cursos e mentoria.
2. Monta um bootcamp e adiciona conteudos.
3. Um dev se inscreve, progride e acumula XP.

## Como executar

### IDE (recomendado)
1. Abra o projeto na sua IDE (IntelliJ/Eclipse/VS Code com extensao Java).
2. Execute `Main.java` com JDK 17 ou superior.

### Terminal
```bash
cd src
javac br/com/dio/desafio/dominio/*.java Main.java
java Main
```

## Proximos passos (sugestoes)
- Exportar certificado de conclusao.
- Permitir multiplos devs com ranking por XP.
- Persistencia em arquivo/BD.

---
Repositorio criado por Vinicius Alves Jeronimo para entrega do desafio.

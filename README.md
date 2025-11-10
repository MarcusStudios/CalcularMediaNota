# Calculadora de Média Escolar

Um programa simples em Java que calcula a média de três notas e determina se o aluno foi aprovado ou reprovado.

## 📋 Descrição

Este programa solicita três notas ao usuário, valida se estão dentro do intervalo permitido (0 a 10), calcula a média aritmética e informa se o aluno foi aprovado (média ≥ 7) ou reprovado (média < 7).

## 🚀 Funcionalidades

- Entrada de três notas via console
- Validação de notas (devem estar entre 0 e 10)
- Cálculo automático da média aritmética
- Determinação de aprovação/reprovação
- Exibição da média com duas casas decimais

## 💻 Tecnologias

- Java
- Scanner (para entrada de dados)

## 📦 Como Executar

1. Certifique-se de ter o JDK instalado em sua máquina
2. Clone este repositório:
```bash
git clone [seu-repositorio]
```

3. Compile o programa:
```bash
javac Main.java
```

4. Execute o programa:
```bash
java Main
```

## 🎯 Como Usar

1. Execute o programa
2. Digite a primeira nota quando solicitado
3. Digite a segunda nota
4. Digite a terceira nota
5. O programa exibirá:
   - "Nota inválida!" se alguma nota estiver fora do intervalo 0-10
   - A média calculada
   - Se o aluno foi aprovado ou reprovado
   - Mensagem de confirmação

## 📊 Exemplo de Uso
```
Qual é a primeira nota?
8.5
Qual é a segunda nota?
7.0
Qual é a terceira nota?
9.0
Aprovado, a sua média é: 8.17
Notas registradas com sucesso!...
```

## ⚠️ Observações

- Notas devem estar no intervalo de 0 a 10
- A média mínima para aprovação é 7.0
- Use vírgula ou ponto como separador decimal (dependendo da configuração regional)

## 🐛 Problema Conhecido

O programa possui um bug: quando uma nota é inválida, a mensagem de erro é exibida, mas o cálculo da média e a verificação de aprovação/reprovação continuam sendo executados com os valores inválidos. Uma melhoria futura seria interromper a execução após detectar uma nota inválida.

## 📝 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar e modificar.

## ✍️ Autor

[Seu Nome]

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!

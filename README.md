# Estudos de Lógica de Programação com Java

Este repositório foi criado com o objetivo de compartilhar os estudos e práticas relacionados à lógica de programação utilizando a linguagem **Java**. Abaixo, estão descritas as etapas de configuração do ambiente de desenvolvimento, conceitos introdutórios e exemplos de código para auxiliar iniciantes.

---

## Introdução ao Java

Java é uma linguagem de programação **orientada a objetos** amplamente utilizada para desenvolvimento de aplicações desktop, web, mobile e muito mais. Sua portabilidade e robustez fazem dela uma excelente escolha para aprender lógica de programação.

Se desejar mais detalhes sobre a história e as principais características do Java, acesse:

- [História do Java - Oracle](https://www.oracle.com/java/)
- [Documentação oficial do Java](https://docs.oracle.com/en/java/)

---

## Configuração do Ambiente de Desenvolvimento

Antes de iniciar, é necessário configurar o ambiente para desenvolver e executar códigos Java.

### 1. Instalação do Java Development Kit (JDK)

1. Acesse o site oficial do Java: [Downloads do JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Baixe a última versão do JDK apropriada para o seu sistema operacional (Windows, macOS ou Linux).
3. Durante a instalação, marque a opção para adicionar o JDK ao **PATH** do sistema.
4. Para verificar se a instalação foi bem-sucedida, abra o terminal ou prompt de comando e digite:

   ```bash
   java -version
O retorno esperado deve ser algo como `java version "XX"`.

## 2. Escolha de IDE (Ambiente de Desenvolvimento Integrado)

Recomendamos o uso de uma IDE para facilitar a edição, compilação e execução de códigos Java. Algumas opções populares incluem:

- **IntelliJ IDEA**: IDE robusta e cheia de recursos.
- **Eclipse**: Ideal para projetos de maior escala.
- **Visual Studio Code**: Leve e com suporte ao Java através de extensões.

---

## Fundamentos de Lógica de Programação em Java

### 1. Declaração de Variáveis

No Java, as variáveis precisam ser declaradas explicitamente com seu tipo de dado.

**Exemplo:**

```java
int idade = 25; // Inteiro
double altura = 1.75; // Número com casas decimais
String nome = "João"; // Cadeia de caracteres
boolean aprovado = true; // Valor booleano
```

### 2. Estruturas Condicionais

As estruturas condicionais são usadas para controlar o fluxo do programa com base em condições lógicas.

**Exemplo:**

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```
### 3. Estruturas de Repetição

As estruturas de repetição permitem executar um bloco de código diversas vezes.

**Exemplo com **for**:**

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Contagem: " + i);
}
```

**Exemplo com **while**:**

```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

### 4. Arrays e Coleções

Os arrays permitem armazenar múltiplos valores do mesmo tipo em uma única variável.

**Exemplo:**

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println(numero);
}
```

## Exemplos Práticos

### Exemplo 1: Calculadora Simples

```java
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

        scanner.close();
    }
}
```

### Exemplo 2: Verificador de Números Primos

```java
public class NumeroPrimo {
    public static void main(String[] args) {
        int numero = 29; // Número a ser verificado
        boolean isPrimo = true;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                isPrimo = false;
                break;
            }
        }

        if (isPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
```

## Modularização e Funções

A modularização facilita a organização do código, tornando-o mais legível e reutilizável. Funções em Java são declaradas dentro de classes e podem ser chamadas por outros métodos ou classes.

**Exemplo:**

```java
public class Modularizacao {
    public static void main(String[] args) {
        saudacao("Mundo");
    }

    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }
}
```

Este repositório será constantemente atualizado com novos exemplos, exercícios e tópicos avançados. Sinta-se à vontade para contribuir ou relatar problemas através da aba de Issues.
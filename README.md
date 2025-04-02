# Arrays em Java

Este repositório contém exemplos, exercícios e implementações práticas sobre o uso de arrays em Java, abordando desde conceitos básicos até técnicas avançadas de manipulação.

## 📋 Sobre o Projeto

Este projeto é dedicado ao estudo e prática de arrays em Java, uma estrutura de dados fundamental que permite armazenar múltiplos valores do mesmo tipo em uma única variável. O material cobre desde a declaração e inicialização básica de arrays até operações mais complexas como ordenação, busca e manipulação multidimensional.

## 📊 Conceitos Abordados

### 1. Fundamentos de Arrays
   - Declaração e inicialização
   - Acesso e modificação de elementos
   - Arrays de tipos primitivos vs. objetos
   - Tamanho fixo e suas implicações

### 2. Operações com Arrays
   - Percorrendo arrays (for, enhanced for)
   - Copiando arrays (`System.arraycopy`, `Arrays.copyOf`)
   - Preenchimento (`Arrays.fill`)
   - Comparação (`Arrays.equals`)

### 3. Arrays Multidimensionais
   - Arrays bidimensionais (matrizes)
   - Arrays irregulares (jagged arrays)
   - Arrays com 3 ou mais dimensões

### 4. Algoritmos com Arrays
   - Ordenação (`Arrays.sort`)
   - Busca (`Arrays.binarySearch`)
   - Conversão entre arrays e coleções

### 5. Classes Utilitárias
   - Classe `Arrays`
   - `ArrayList` vs arrays convencionais
   - Arrays em conjunto com Streams (Java 8+)

## 🔧 Tecnologias Utilizadas

- Java
- JDK (Java Development Kit)
- IDE de sua preferência (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## 📂 Estrutura do Projeto

```
Arrays-Java/
├── src/
│   ├── basics/
│   │   ├── ArrayDeclaration.java
│   │   ├── ArrayInitialization.java
│   │   └── ArrayTraversal.java
│   ├── operations/
│   │   ├── ArrayCopy.java
│   │   ├── ArrayFill.java
│   │   ├── ArraySearch.java
│   │   └── ArraySort.java
│   ├── multidimensional/
│   │   ├── Matrix.java
│   │   ├── JaggedArray.java
│   │   └── ThreeDArray.java
│   ├── algorithms/
│   │   ├── CustomSort.java
│   │   ├── CustomSearch.java
│   │   └── ArrayManipulation.java
│   └── util/
│       ├── ArraysUtilDemo.java
│       └── ArrayListDemo.java
├── exercises/
│   ├── BasicArrayExercises.java
│   ├── MatrixExercises.java
│   └── AlgorithmExercises.java
├── solutions/
│   ├── BasicArraySolutions.java
│   ├── MatrixSolutions.java
│   └── AlgorithmSolutions.java
├── .gitignore
├── LICENSE
└── README.md
```

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/Arrays-Java.git
   ```

2. Abra o projeto na sua IDE de preferência

3. Navegue até o exemplo ou exercício que deseja executar

4. Compile e execute o arquivo Java desejado

## 📝 Exemplos Incluídos

### Declaração e Inicialização
```java
// Declaração de array
int[] numeros;

// Inicialização com tamanho
numeros = new int[5];

// Declaração e inicialização combinadas
int[] valores = new int[3];

// Inicialização com valores
int[] sequencia = {1, 2, 3, 4, 5};

// Array de objetos
String[] nomes = {"Ana", "Bruno", "Carlos"};
```

### Percorrendo Arrays
```java
// Usando for tradicional
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento " + i + ": " + numeros[i]);
}

// Usando enhanced for (for-each)
for (String nome : nomes) {
    System.out.println("Nome: " + nome);
}
```

### Arrays Multidimensionais
```java
// Matriz 3x3
int[][] matriz = new int[3][3];

// Inicialização de matriz
int[][] grade = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Percorrendo matriz
for (int i = 0; i < grade.length; i++) {
    for (int j = 0; j < grade[i].length; j++) {
        System.out.print(grade[i][j] + " ");
    }
    System.out.println();
}
```

## 💡 Dicas e Boas Práticas

- Sempre verifique os limites do array para evitar `ArrayIndexOutOfBoundsException`
- Utilize `Arrays.toString()` para exibir o conteúdo de arrays unidimensionais
- Para arrays multidimensionais, use `Arrays.deepToString()`
- Prefira o enhanced for (for-each) quando não precisar do índice
- Considere usar `ArrayList` quando precisar de um tamanho dinâmico
- Utilize a classe `Arrays` para operações comuns como ordenação e busca
- Sempre inicialize arrays de objetos com valores não-nulos para evitar `NullPointerException`

## 🧪 Exercícios Propostos

1. Crie um programa que encontre o maior e o menor valor em um array
2. Implemente um algoritmo de ordenação (bubble sort, selection sort) manualmente
3. Crie uma função que inverta um array sem usar arrays auxiliares
4. Desenvolva um programa que soma duas matrizes
5. Implemente um algoritmo para verificar se um array contém números duplicados

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com novos exemplos, exercícios ou melhorias nos existentes.

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona novo exemplo de array'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

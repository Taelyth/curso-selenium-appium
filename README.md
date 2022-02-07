# Testes — Selenium + Appium
Projeto criado para acompanhar as aulas do curso [Formação em Teste de Software][Iterasys] em **Java** utilizando **JUnit, Selenium e Appium**.

O projeto contém um exemplo simples de **Appium** com um App de Calculadora e de **Selenium** com o site [Iterasys][Iterasys].

---

### Pré-Requisitos
- Nesse projeto utilizamos o **Gradle** com as seguintes bibliotecas:

```java
testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.2'
testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.2'
implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '3.141.59'
implementation group: 'io.appium', name: 'java-client', version: '7.5.1'
```

- O APK utilizado para os testes de Appium é a **Calculadora do Google**.
- Para rodar os testes em Appium é necessário usar o **AVD Manager**, já disponível na **IDE IntelliJ**, ou baixá-lo de forma separada.
- É necessário abrir o emulador e instalar o APK da Calculadora.
- A URL usada nos testes de Selenium é essa: [Iterasys][Iterasys].


---

### Glossário

`Calc.java` Código simples de Appium com um teste de soma na calculadora.

`BuscaSeleniumPuro.java` Código simples de Selenium, com o teste de busca no site da [Iterasys][Iterasys].

---

### Créditos
[<img src="assets\Iterasys-Logo.png" width="20%"/>][Iterasys]


<!-- links -->
[Iterasys]: https://iterasys.com.br/

<!-- imagens -->
[Iterasys-Logo]: assets/Iterasys-Logo.png (Iterasys-logo)
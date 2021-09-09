// 1 - Pacote - Conjunto de Classses
package site;

// 2 - Bibliotecas
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 3 - Classes
public class BuscaSeleniumPuro {
    // 3.1 - Atributos
    String url = "https://iterasys.com.br/";
    private static WebDriver driver;

    // 3.2 - Funções e Métodos
    @BeforeAll
    public static void iniciar()
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/92/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void CarregarPaginaInicial()
    {
        driver.get(url);
        //driver.manage().window().maximize();
    }

    @AfterAll
    public static void finalizar()
    {
        driver.quit();
    }

    @Test
    public void buscaCurso()
    {
        String nomeCursoMantis = "Mantis";
        String precoCursoMantis = "R$ 49,99";

        By caixaBusca = By.cssSelector("#searchtext");
        By botaoComprar = By.cssSelector("span.comprar");
        By nomeCurso = By.cssSelector("span.item-title");
        By precoCurso = By.cssSelector("span.new-price");


        driver.findElement(caixaBusca).sendKeys("Mantis" + Keys.ENTER);
        driver.findElement(botaoComprar).click();
        Assertions.assertEquals(nomeCursoMantis,driver.findElement(nomeCurso).getText());
        Assertions.assertEquals(precoCursoMantis, driver.findElement(precoCurso).getText());

    }

}

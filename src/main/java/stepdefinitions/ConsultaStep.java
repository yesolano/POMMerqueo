package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ConsultaPage;


public class ConsultaStep {
	
	WebDriver driver;
	ConsultaPage consultaPage;
	
	String url = "https://www.merqueo.com";
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		consultaPage = new ConsultaPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Given("^que el usuario esta en la pagina inicial de merqueo$")
	public void queElUsuarioEstaEnLaPaginaInicialDeMerqueo(){
		driver.get(url);
	}

	@When("^el usuario ingresa el producto \"([^\"]*)\"$")
	public void elUsuarioIngresaElProducto(String producto){

	}

	@And("^el usuario hace clic en el boton de busqueda$")
	public void elUsuarioHaceClicEnElBotonDeBusqueda(){
	   
	}

	@And("^el usuario esta en la pagina de resultados de busqueda$")
	public void elUsuarioEstaEnLaPaginaDeResultadosDeBusqueda(){
	  
	}

	@And("^el usuario selecciona la cantidad \"([^\"]*)\" a llevar del producto$")
	public void elUsuarioSeleccionaLaCantidadALlevarDelProducto(int cantidad){

	}

	@Then("^el producto es agregado al carrito de compra$")
	public void elProductoEsAgregadoAlCarritoDeCompra(){

	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}

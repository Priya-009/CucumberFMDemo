package CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features="C:\\Users\\Priya\\eclipse-workspace\\CucumberFMDemo\\src\\test\\java" ,
  glue="StepDefinations"

       )
public class testRunner {

}
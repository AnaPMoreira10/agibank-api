package logic;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/logic",
        glue = {"logic"},
        tags = "@agibank",
        plugin = {"pretty", "html:target/report.html"}
)
public class Runner {
}

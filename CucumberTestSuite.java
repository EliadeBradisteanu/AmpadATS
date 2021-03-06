@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        // plugin = {"pretty"},
        features = "src/test/resources/features",
        glue= {"stepdefinitions"},
        //plugin = {"pretty", "html:target/cucumber-html-report",	"json:target/cucumber.json"},
        monochrome = true,  //display the console output in a proper readable format
        // strict = true, //it will check if any step is not defined in step definition file
        dryRun = false,    //to check the mapping is proper between feature file and step def file
        tags = "@Ampada" //{"@Ampada", "not @End2End" , "not @SmokeTest"}
)
public class CucumberTestSuite {}
package runners;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.jupiter.api.extension.ExtendWith;

@Cucumber
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // features klasörü yolunu doğru belirttiğinden emin ol
@ConfigurationParameter(key = "cucumber.plugin", value = "json:target/cucumber.json") // JSON raporu oluşturmak için
@ConfigurationParameter(key = "cucumber.glue", value = "stepdefinitions") // Step definitions klasör yolunu doğru belirt
public class Runner {
    // Boş bırakılabilir çünkü testlerin çalışma biçimi tamamen Cucumber ve JUnit 5 ile entegre
}

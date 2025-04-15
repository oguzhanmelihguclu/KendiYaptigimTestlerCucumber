package runners;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.ConfigurationParameter;

@Cucumber
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // features klasörü yolunu doğru belirttiğinden emin ol
@ConfigurationParameter(key = "cucumber.plugin", value = "json:target/cucumber.json") // JSON raporu oluşturmak için
@ConfigurationParameter(key = "cucumber.glue", value = "stepdefinitions") // Adım tanımlarının yerini belirt
public class Runner {
    // Runner sınıfı
}
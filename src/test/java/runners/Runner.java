package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME, value = "src/test/resources/features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "stepdefinitions")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@wip")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "pretty, json:target/cucumber-report/cucumber.json") // JSON raporu oluşturacak şekilde güncellendi.
public class Runner {

    /*
        Cucumber'daki Runner Class'ı içinde hiçbir kod yazılmaz.

        Görevi TestNG'deki .xml dosyaları gibi toplu çalıştırmayı sağlamaktır.

        Runner class'ı görevini
        kullanacağımız notasyonlar ile gerçekleştirir.
     */
    /*
        @IncludeEngines("cucumber")  : Class'ın cucumber ile çalışmasını sağlar
        @SelectClasspathResource("src/test/java") : Java class'larını bulacağı dosya yolu

        Constants.FEATURES_PROPERTY_NAME : "src/test/resources/features"
        çalıştırılacak feature dosyalarının yerini gösterir

        Constants.GLUE_PROPERTY_NAME : "stepdefinitions"
        belirlenen feature dosyalarını çalıştırmak için
        kullanılacak step definition'ların bulunduğu package'in dosya yolu

        EĞER sadece bu notasyonları kullanırsak,
        features klasörü içindeki tüm feature'ları çalıştırır.

        İstediğimiz feature'ları çalıştırmak için
        cucumber 2 alternatif sunar:
        1- istediğiniz feature'ları bir klasör içine koyup
           sadece o klasörü çalıştırmasını isteyebilirsiniz.
        2- istediğiniz Feature veya Scenario'ları bir tag ile belirleyip,
           Constants.FILTER_TAGS_PROPERTY_NAME : "@smoke"

        EĞER Runner dosyası ile çalıştırdığımız feature dosyalarını
        SADECE eksik step definition'ları bulmak ve method'larını oluşturmak için
        çalıştırıyorsak

        Constants.EXECUTION_DRY_RUN_PROPERTY_NAME : "true" yaparız

        dryRun değeri true iken Runner SADECE eksik adım kontrolü yapar
        Feature veya Scenario'ları çalıştırmaz
        eksik adım varsa failed deyip eksik adımları verir
        eksik adım yoksa passed deyip çalışmayı bitirir
     */
}

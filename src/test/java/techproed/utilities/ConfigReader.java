package techproed.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    /*
        .properties uzantili dosyaya erisebilmek icin Properties class'indan obje olusturmamiz gerekir.
        Bu olusturdugumuz obje ile akisa aldigimiz dosya yolunu properties.load(fis) methodu ile
        properties dosyasindaki bilgileri objemize yükler ve properties dosyasindaki key degerini
        return ederiz.Bunu yapmak icin parametreli bir method olusturur, girdigimiz key'in degerini
        bize döndürür.
     */
    static Properties properties;

    public static String getProperty(String key) {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);   // --> fis'in okudugu bilgileri properties'e yükler.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key); // --> String olarak girdiğim key'in değerini return eder.

    }


}

package hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    private String diretory = "uploadDiretory";

    public String getLocation() {
        return diretory;
    }

    public void setLocation(String diretory) {
        this.diretory = diretory;
    }

}

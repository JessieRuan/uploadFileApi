package hello;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init();
    
    void deleteAll();

    void store(MultipartFile file);

    void store(String metaData);

    Path load(String filename);

    Resource loadAsResource(String filename);
    
    Stream<Path> loadAll();

    


}

package hello;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetadataDao extends CrudRepository<Metadata, Long> {
	
	public Metadata findByFileName(String fileName);
	
	@Query("SELECT m FROM Metadata m WHERE DATEDIFF('SECOND',  CURRENT_TIMESTAMP(), DATEADD('HOUR', 1, m.created)) > 0")
	public List<Metadata> getListOfMetadataFromLastHour();

}

package software.spence.Movies;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface MovieRepository extends CrudRepository <Movie, Integer>{

}



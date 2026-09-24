package tech.djnd.sample.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    @Query(value = "update User u set u.sessionId = :sessionId where u.id = :userId")
   int updateSessionIdById(@Param("userId") Long userId, @Param("sessionId") String sessionId);
}

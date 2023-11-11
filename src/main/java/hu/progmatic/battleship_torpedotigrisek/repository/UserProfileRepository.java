package hu.progmatic.battleship_torpedotigrisek.repository;


import hu.progmatic.battleship_torpedotigrisek.model.User;
import hu.progmatic.battleship_torpedotigrisek.model.UserProfile;
import hu.progmatic.battleship_torpedotigrisek.service.UserProfileService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findByUserName(String userName);

}

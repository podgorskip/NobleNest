package app.estateagency.jpa.repositories;

import app.estateagency.jpa.entities.OwnerMeeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerMeetingRepository extends JpaRepository<OwnerMeeting, Long> {
}

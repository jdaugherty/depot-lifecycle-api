package depotlifecycle.repositories;

import depotlifecycle.domain.Release;
import depotlifecycle.domain.Release;
import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface ReleaseRepository extends CrudRepository<Release, Long> {
    boolean existsByReleaseNumber(@NotNull @NonNull String releaseNumber);

    @NonNull
    Optional<Release> findByReleaseNumber(@NotNull @NonNull String releaseNumber);
}

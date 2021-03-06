package depotlifecycle.repositories;

import depotlifecycle.domain.Party;
import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface PartyRepository extends CrudRepository<Party, Long> {
    Optional<Party> findByCompanyId(@NotNull @NonNull String companyId);
}

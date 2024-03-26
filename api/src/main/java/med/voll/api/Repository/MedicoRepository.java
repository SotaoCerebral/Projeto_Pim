package med.voll.api.Repository;
import org.springframework.data.domain.Page;
import med.voll.api.domain.medico.Medico;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico,Long> {

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}

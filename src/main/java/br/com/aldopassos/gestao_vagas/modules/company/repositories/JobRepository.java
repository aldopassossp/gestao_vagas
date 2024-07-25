package br.com.aldopassos.gestao_vagas.modules.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import br.com.aldopassos.gestao_vagas.modules.company.entities.JobEntity;

import java.util.List;
import java.util.UUID;

@RestController
public interface JobRepository extends JpaRepository<JobEntity,UUID>{
    
    List<JobEntity> findByDescriptionIgnoreCaseContaining(String filter);
    
    List<JobEntity> findByCompanyId(UUID companyId);
}

package br.com.aldopassos.gestao_vagas.modules.company.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aldopassos.gestao_vagas.modules.company.entities.JobEntity;
import br.com.aldopassos.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ListAllJobsByCompanyService {
    
    @Autowired
    private JobRepository jobRepository;

    public List<JobEntity> execute(UUID companyId){
        
        return this.jobRepository.findByCompanyId(companyId);
    }
}

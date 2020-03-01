package org.nsbedfw.jobboard.services;

import org.nsbedfw.jobboard.domain.Candidate;
import org.nsbedfw.jobboard.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public void addCandidate(Candidate candidate) {
        candidateRepository.save(candidate);
    }

    public List<Candidate> getAllCandidates(){
        return candidateRepository.findAll();
    }


    public void delete(String candidateId) {
        Candidate candidate = candidateRepository.findById(candidateId).orElse(null);
        candidateRepository.delete(candidate);
    }
}

package com.cleverlance.academy.aggregator.sevice;

import com.cleverlance.academy.aggregator.client.api.DefaultApi;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.repository.IdentificationRepository;
import com.cleverlance.academy.aggregator.repository.JpaIdentificationRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IdentificationServiceImpl implements IdentificationService {
    
    private final JpaIdentificationRepository identificationRepository;
    private final DefaultApi defaultApi;
    private final ClientIdentificationMapper clientIdentificationMapper;

    public IdentificationServiceImpl(JpaIdentificationRepository identificationRepository, DefaultApi defaultApi, ClientIdentificationMapper clientIdentificationMapper) {
        
        this.identificationRepository = identificationRepository;
        this.defaultApi = defaultApi;
        this.clientIdentificationMapper = clientIdentificationMapper;
    }

    @Cacheable("identification")
    @Override
    public List<Identification> getIdentification(Integer pageSize, Integer pageNumber) {
        Page<Identification> result = this.identificationRepository.findAll(PageRequest.of(pageNumber, pageSize));
        return result.get().collect(Collectors.toList());
        /*this.defaultApi.getApiClient().setBasePath("https://tofu-iot-server.herokuapp.com");
        com.cleverlance.academy.aggregator.client.model.Identification response = this.defaultApi.getIdentification();
        return List.of(this.clientIdentificationMapper.toIdentification(response));*/
    }

    @Override
    public void saveIdentification(Identification identification) {
        this.identificationRepository.saveAndFlush(identification);
    }
    
    
}

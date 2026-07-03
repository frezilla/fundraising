package eu.frezilla.money.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Service
public class ProjectService {
    public final List<ProjectRecord> projects;
    
    public ProjectService() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ProjectRecord[] array 
                = mapper.readValue(
                        new ClassPathResource("projects.json").getInputStream(),
                        ProjectRecord[].class
                );
        projects = new ArrayList<>();
        projects.addAll(Arrays.asList(array));
    }
    
    public List<ProjectRecord> getAll() {
        return new ArrayList<>(projects);
    }
    
}

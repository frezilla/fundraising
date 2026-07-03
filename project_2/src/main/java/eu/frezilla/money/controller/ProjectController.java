package eu.frezilla.money.controller;

import eu.frezilla.money.service.ProjectRecord;
import eu.frezilla.money.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    
    @Autowired private ProjectService projectService;
    
    @GetMapping
    public ResponseEntity<List<ProjectRecord>> getAll() {
        return ResponseEntity.ok(projectService.getAll());
    }
    
}

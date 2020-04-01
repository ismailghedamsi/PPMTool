package com.ismail.ppmt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismail.ppmt.domain.Project;
import com.ismail.ppmt.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	public Project saveOrUpdateProject(Project project) {
		return projectRepository.save(project);
	}
}

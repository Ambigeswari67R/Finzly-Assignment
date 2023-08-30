package projectManagement;

import java.util.HashMap;
import java.util.Map;

public class ProjectManagementSystem {
	private Map<String, Project> projects;

    public ProjectManagementSystem() {
        projects = new HashMap<>();
    }

    public void addProject(String name, String description) {
        Project project = new Project(name, description);
        projects.put(name, project);
        System.out.println("Project '" + name + "' added successfully.");
    }

    public void assignTeamMember(String projectName, String teamMember) {
        Project project = projects.get(projectName);
        if (project != null) {
            project.addTeamMember(teamMember);
            System.out.println("Assigned " + teamMember + " to project '" + projectName + "'.");
        } else {
            System.out.println("Project '" + projectName + "' not found.");
        }
    }

    public void viewProjectDetails(String projectName) {
        Project project = projects.get(projectName);
        if (project != null) {
            System.out.println("Project Name: " + project.getName());
            System.out.println("Description: " + project.getDescription());
            System.out.println("Team Members: " + project.getTeamMembers());
        } else {
            System.out.println("Project '" + projectName + "' not found.");
        }
    }

    public void listAllProjects() {
        System.out.println("List of Projects:");
        for (Project project : projects.values()) {
            System.out.println("- " + project.getName());
        }
    }
}



package projectManagement;

import java.util.HashSet;
import java.util.Set;

public class Project {
    private String name;
    private String description;
    private Set<String> teamMembers;

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.teamMembers = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(String teamMember) {
        teamMembers.add(teamMember);
    }

}

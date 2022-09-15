package myorg.project;

public class ProjectManagers {
    public static ProjectManagers getLeadPM() {
        return new ProjectManagers();
    }

    public Task chooseMostImportantTask(Project project) {
        return project.tasks().get(0);
    }

}

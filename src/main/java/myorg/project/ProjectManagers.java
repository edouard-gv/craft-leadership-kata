package myorg.project;

import myorg.devs.BackEndDeveloper;

public class ProjectManagers {
    public static ProjectManagers getProjectManager() {
        return new ProjectManagers();
    }

    public Task chooseMostImportantTask(Project project) {
        return project.tasks().get(0);
    }

    void distributeTasks(Project project) {
        Task firstTask = chooseMostImportantTask(project);
        BackEndDeveloper firstFreeDev = BackEndDeveloper.findFirstFreeDev();
        firstTask.assign(firstFreeDev);
    }
}

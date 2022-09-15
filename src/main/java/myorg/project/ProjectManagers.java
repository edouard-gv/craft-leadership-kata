package myorg.project;

import myorg.devs.BackEndDevs;

public class ProjectManagers {
    public static ProjectManagers getLeadPM() {
        return new ProjectManagers();
    }

    public Task chooseMostImportantTask(Project project) {
        return project.tasks().get(0);
    }

    public void assignTask(Task firstTask, BackEndDevs firstFreeDev) {
        firstTask.assign(firstFreeDev);
    }
}

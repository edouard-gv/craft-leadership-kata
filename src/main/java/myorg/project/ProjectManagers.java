package myorg.project;

import myorg.devs.BackEndDevs;

import java.util.List;

public class ProjectManagers {
    public static ProjectManagers getLeadPM() {
        return new ProjectManagers();
    }

    public Task chooseMostImportantTask(List<Task> project) {
        return project.get(0);
    }

    public void assignTask(Task firstTask, BackEndDevs firstFreeDev) {
        firstTask.assign(firstFreeDev);
    }
}

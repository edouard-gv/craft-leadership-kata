package myorg.project;

import myorg.devs.BackEndDevs;

import java.util.List;

public record Project(List<Task> tasks) {
    void distributeTasks() {
        ProjectManagers leadPM = ProjectManagers.getLeadPM();
        Task firstTask = leadPM.chooseMostImportantTask(this);
        BackEndDevs firstFreeDev = BackEndDevs.findFirstFreeDev();
        leadPM.assignTask(firstTask, firstFreeDev);
    }
}
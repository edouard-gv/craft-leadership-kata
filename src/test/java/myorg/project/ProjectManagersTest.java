package myorg.project;

import myorg.devs.BackEndDevs;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ProjectManagersTest {

    @Test
    public void shouldDistributeTask() {
        Task aTask = new Task();
        Project project = new Project(Arrays.stream(new Task[]{aTask}).toList());
        BackEndDevs firstFreeDev = BackEndDevs.findFirstFreeDev();
        assignTaskToMe(project, firstFreeDev);
        assertThat(aTask.assignee()).isNotNull();
    }

    public void assignTaskToMe(Project project, BackEndDevs firstFreeDev) {
        ProjectManagers leadPM = ProjectManagers.getLeadPM();
        Task firstTask = leadPM.chooseMostImportantTask(project);
        firstFreeDev.assignTaskToMe(firstTask);
    }
}
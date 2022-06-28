package myorg.project;

import myorg.devs.BackEndDevs;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ProjectManagersTest {

    @Test
    public void shouldDistributeTask() {
        Task aTask = new Task();
        List<Task> project = Arrays.stream(new Task[]{aTask}).toList();
        ProjectManagers leadPM = ProjectManagers.getLeadPM();
        Task firstTask = leadPM.chooseMostImportantTask(project);
        BackEndDevs firstFreeDev = BackEndDevs.findFirstFreeDev();
        leadPM.assignTask(firstTask, firstFreeDev);
        assertThat(firstTask.assignee()).isEqualTo(firstFreeDev);
    }

}
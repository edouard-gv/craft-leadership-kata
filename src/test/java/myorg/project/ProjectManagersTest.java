package myorg.project;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ProjectManagersTest {

    @Test
    public void shouldDistributeTask() {
        Task aTask = new Task();
        Project project = new Project(Arrays.stream(new Task[]{aTask}).toList());
        ProjectManagers leadPM = ProjectManagers.getLeadPM();
        leadPM.distributeTasks(project);
        assertThat(aTask.assignee()).isNotNull();
    }
}
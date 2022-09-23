package myorg.project;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ProjectManagerTest {

    @Test
    public void shouldDistributeTask() {
        Task aTask = new Task("Do the project");
        Project project = new Project(Arrays.stream(new Task[]{aTask}).toList());
        ProjectManager projectManager = ProjectManager.getProjectManager();
        projectManager.distributeTasks(project);
        assertThat(aTask.assignee()).isNotNull();
    }
}
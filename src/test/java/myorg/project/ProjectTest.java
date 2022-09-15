package myorg.project;

import myorg.devs.BackEndDevs;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ProjectTest {

    @Test
    public void shouldDistributeTask() {
        Task aTask = new Task();
        Project project = new Project(Arrays.stream(new Task[]{aTask}).toList());
        tick(project);
        assertThat(aTask.assignee()).isNotNull();
    }

    public void tick(Project project) {
        BackEndDevs firstFreeDev = BackEndDevs.findFirstFreeDev();
        firstFreeDev.assignTaskToMe(project);
    }
}
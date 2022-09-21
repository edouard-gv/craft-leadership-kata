package myorg.devs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BackEndDeveloperTest {

    @Test
    public void shouldKnowSpringBoot() {
        for (BackEndDeveloper dev : BackEndDeveloper.getMembers()) {
            assertThat(dev.getCompetencies()).contains("SpringBoot");
        }
    }
}
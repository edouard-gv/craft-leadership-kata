package myorg.devs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BackEndDevsTest {

    @Test
    public void shouldKnowSpringBoot() {
        for (DevTeam dev : BackEndDevs.getMembers()) {
            assertThat(dev.getCompetencies()).contains("SpringBoot");
        }
    }
}
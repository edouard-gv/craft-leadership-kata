package myorg.devs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrontEndDevsTest {

    @Test
    public void shouldKnowAngular() {
        for (DevTeam dev : FrontEndDevs.getMembers()) {
            assertThat(dev.getCompetencies()).contains("Angular");
        }
    }

}
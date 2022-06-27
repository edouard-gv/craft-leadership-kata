package myorg.devs;

import java.util.Arrays;
import java.util.List;

public abstract class DevTeam {
    private final boolean isTechLead;
    private final List<String> competencies;

    public DevTeam(boolean isTechLead, String[] competencies) {
        this.isTechLead = isTechLead;
        this.competencies = Arrays.stream(competencies).toList();
    }

    public List<String> getCompetencies() {
        return competencies;
    }

    public boolean isTechLead() {
        return isTechLead;
    }
}

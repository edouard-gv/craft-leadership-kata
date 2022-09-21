package myorg.devs;

import java.util.Arrays;
import java.util.List;

public class BackEndDeveloper {
    private final List<String> competencies;

    public BackEndDeveloper(String[] competencies) {
        this.competencies = Arrays.stream(competencies).toList();
    }

    public static List<BackEndDeveloper> getMembers() {
        BackEndDeveloper sophie = new BackEndDeveloper(new String[]{"Java", "SpringBoot"});
        BackEndDeveloper kevin = new BackEndDeveloper(new String[]{"Java", "SpringBoot"});
        return Arrays.stream(new BackEndDeveloper[]{sophie, kevin}).toList();
    }

    public static BackEndDeveloper findFirstFreeDev() {
        return BackEndDeveloper.getMembers().get(0);
    }

    public List<String> getCompetencies() {
        return competencies;
    }

}

package myorg.devs;

import myorg.project.Project;
import myorg.project.ProductOwner;
import myorg.project.Task;

import java.util.Arrays;
import java.util.List;

public class BackEndDevs extends DevTeam {

    BackEndDevs(boolean isTechLead, String[] competencies) {
        super(isTechLead, competencies);
    }

    public static List<BackEndDevs> getMembers() {
        BackEndDevs sophie = new BackEndDevs(true, new String[]{"Java", "SpringBoot"});
        BackEndDevs kevin = new BackEndDevs(false, new String[]{"Java", "SpringBoot"});
        return Arrays.stream(new BackEndDevs[]{sophie, kevin}).toList();
    }

    public static BackEndDevs findFirstFreeDev() {
        return getMembers().get(0);
    }

    public void assignTaskToMe(Task firstTask) {
        firstTask.assign(this);
    }

    public void assignTaskToMe(Project project) {
        ProductOwner leadPM = ProductOwner.getLeadPM();
        Task firstTask = leadPM.chooseMostImportantTask(project);
        assignTaskToMe(firstTask);
    }
}

package myorg.devs;

import java.util.Arrays;
import java.util.List;

public class BackEndDevs extends DevTeam {

    BackEndDevs(boolean isTechLead, String[] competencies) {
        super(isTechLead, competencies);
    }

    public static List<FrontEndDevs> getMembers() {
        FrontEndDevs sophie = new FrontEndDevs(true, new String[]{"Java", "SpringBoot"});
        FrontEndDevs kevin = new FrontEndDevs(false, new String[]{"Java", "SpringBoot"});
        return Arrays.stream(new FrontEndDevs[]{sophie, kevin}).toList();
    }
}

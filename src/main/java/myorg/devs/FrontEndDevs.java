package myorg.devs;

import java.util.Arrays;
import java.util.List;

public class FrontEndDevs extends DevTeam {
    public FrontEndDevs(boolean isTechLead, String[] competencies) {
        super(isTechLead, competencies);
    }

    public static List<FrontEndDevs> getMembers() {
        FrontEndDevs matthieu = new FrontEndDevs(true, new String[]{"Angular", "js", "HTML/CSS"});
        FrontEndDevs lola = new FrontEndDevs(false, new String[]{"Angular", "js", "HTML/CSS"});
        return Arrays.stream(new FrontEndDevs[]{matthieu, lola}).toList();
    }


}

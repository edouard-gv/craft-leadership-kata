package myorg.devs;

public abstract class Dev {
    private final boolean isTechLead;

    public Dev(boolean isTechLead) {
        this.isTechLead = isTechLead;
    }

    public boolean isTechLead() {
        return isTechLead;
    }
}

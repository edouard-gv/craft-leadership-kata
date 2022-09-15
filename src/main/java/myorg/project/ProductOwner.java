package myorg.project;

public class ProductOwner {
    public static ProductOwner getLeadPM() {
        return new ProductOwner();
    }

    public Task chooseMostImportantTask(Project project) {
        return project.tasks().get(0);
    }

}

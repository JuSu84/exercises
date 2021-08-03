package cwicz1do30.cwicz30;

public class School {

    public static void main(String[] args) {

        OnlineCourse onlineCourse = new OnlineCourse();

        onlineCourse.setId("JAVA-ONLINE-123");
        onlineCourse.setPrice(2000);
        onlineCourse.setTitle("online");
        onlineCourse.setDescription("fda");
        onlineCourse.setVideoLenght(12);
        onlineCourse.setTimeToFinish(12);

        onlineCourse.printInfo();
    }
}

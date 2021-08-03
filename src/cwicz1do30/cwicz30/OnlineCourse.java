package cwicz1do30.cwicz30;

public class OnlineCourse extends Course{

    private int videoLenght;
    private int timeToFinish;

    public int getVideoLenght() {
        return videoLenght;
    }

    public void setVideoLenght(int videoLenght) {
        this.videoLenght = videoLenght;
    }

    public int getTimeToFinish() {
        return timeToFinish;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }

    @Override
    public void printInfo() {
        System.out.println("Course{" +
                "id='" + getId() + '\'' +
                ", price=" + getPrice() +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}' + videoLenght + " " + timeToFinish);;
    }
}

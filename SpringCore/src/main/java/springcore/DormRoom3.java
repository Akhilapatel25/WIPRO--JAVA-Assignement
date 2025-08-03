package springcore;

public class DormRoom3 {
    private int number;
    private String building;

    public DormRoom3(int number, String building) {
        this.number = number;
        this.building = building;
    }

    public String getLocation() {
        return "Room " + number + ", " + building + " building";
    }
}

public class Computer {
    private String osName;
    private int releaseYear;
    private double battHealth;

    public Computer(String osName, int releaseYear, double battHealth) {
        this.osName = osName;
        this.releaseYear = releaseYear;
        this.battHealth = battHealth;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getBattHealth() {
        return battHealth;
    }

    public void setBattHealth(double battHealth) {
        this.battHealth = battHealth;
    }
}

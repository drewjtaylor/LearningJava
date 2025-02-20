public class AudioBook extends Book {
    private int runTime;

    AudioBook(String title, String[] authors, int runTime) {
        super(title, 0, authors);

        this.runTime = runTime;
    }

    @Override
    public String length() {
        return String.format("%s is %d minutes long.", this.title, this.runTime);
    }

    public int getRunTime() {
        return this.runTime;
    }
}

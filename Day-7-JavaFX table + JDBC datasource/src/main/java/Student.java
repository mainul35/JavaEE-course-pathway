public class Student {

    private int stdId;
    private String stdName;
    private String stdBatch;

    public Student(int stdId, String stdName, String stdBatch) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdBatch = stdBatch;
    }

    public Student() {

    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdBatch() {
        return stdBatch;
    }

    public void setStdBatch(String stdBatch) {
        this.stdBatch = stdBatch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", stdBatch='" + stdBatch + '\'' +
                '}';
    }
}

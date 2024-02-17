public class File {
    private String fileName;

    public File(String newFileName) {
        this.fileName = newFileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String newFileName) {
        this.fileName = newFileName;
    }

    public void print() {
        System.out.println("File: " + fileName);
    }
}
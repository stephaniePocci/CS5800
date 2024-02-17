import java.util.List;

public class Folder {
    private String location;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String newLocation, List<Folder> containedFolders, List<File> containedFiles) {
        this.location = newLocation;
        this.subFolders = containedFolders;
        this.files = containedFiles;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public void addSubFolder(Folder subFolder) {
        this.subFolders.add(subFolder);
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void printContents() {
        printContentsRecursive(this, 0);
    }

    private void printContentsRecursive(Folder folder, int depth) {
        System.out.print(getIndentation(depth));
        System.out.println("Folder: " + folder.location);

        for (Folder subFolder : folder.subFolders) {
            printContentsRecursive(subFolder, depth + 1);
        }

        for (File file : folder.files) {
            System.out.print(getIndentation(depth + 1));
            System.out.println("File: " + file.getFileName());
        }
    }

    private String getIndentation(int depth) {
        return "\t".repeat(Math.max(0, depth)); // Using tabs for indentation
    }
}


//package fileIO;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
//
//
//// file -- A discrete container for data on a storage device
//// path -- is a location of a file in a filesystem
////         -- consist of directory names separated by a / (forward slash)
////         -- when a path starts with / it refers to the filesystem root otherwise its used to separate directories in a path
////         -- . represents the current directory
////         -- .. represents the parent directory
//
//
//
//public class FileReader {
//    //Layout
//    //1 - properties
//    //2 - constructor
//    //3 - custom methods
//    //4 - getters and setters
//
//
//    // Set up our Paths
//    // get the properties for this class
//    // goal: read in a file and parse through it
//
//    private String directoryName;       //i.e 'data', 'src/fileIo'
//    private String fileName;            //i.e 'day18.txt', 'jolts.txt'
//    private String logFileName;         // will hold the login info of everything that we're doing
//    private Path directoryPath;         // path representation of the parent directory of our files
//    private Path filePath;              // path representation for the actual file path
//    private Path logFilePath;           // the Path representation of the log file
//    private List<String> fileLines;     // Holding spot for the content inside of the data file itself
//    private List<String> logFileLines; // Holding spot for the content inside of the log file
//
//
//    //Constructor
//    //Want to send in a directory path name and a file name and a logFile name and generate EVERYTHING
//    // from just those two values
//
//
//    public FileReader(String directoryName, String fileName, String logFileName) throws IOException {
//        this.directoryName = directoryName;
//        this.fileName = fileName;
//        this.logFileName = logFileName;
//        //Instantiating path values
//        this.directoryPath = Paths.get(directoryName); // Paths.get("data")
//        this.filePath = Paths.get(directoryName, fileName); // gets the directory first and then the file name
//        this.logFilePath = Paths.get(directoryName, logFileName);
//
//        // Check if files exist, and create them if they don't currently exist
//
//        //Log File
//        if (Files.notExists(this.logFilePath)) {
//            try {
//                Files.createFile(this.logFilePath)
//            } catch (IOException e) {
//                //Store this exception message in the log file
//                // if there is an issue creating the log file, let's just crash the whole party and throw an IOExceptionh
//                throw newIOExcpetion("Unable to create the logFile (" + this.logFileName + ")!");
//            }
//        }
//        //Directory ofr data file('data'), ('src/fileIO')
//
//        // Data File ('day18.txt')
//
//
//        //Test if the instantiation worked
//        System.out.println(filePath); // display the file path for the passed in arguments;
//
//    }
//
//    //PSVM
//    public static void main(String[] args) {
//        //instantiate a fileReader object an see if it works
//        FileReader thisFileReader = new FileReader("data","day18.txt", "day18.log");
//
//
//        // Set up a new instance to acess the jolts.txt file
//        FileReader joltsReader = new FileReader("src/fileIO", "jolts.txt", "jolts.log");
//    }
//
//
//    //Getters and Setters
//
//    public String getDirectoryName() {
//        return directoryName;
//    }
//
//    public void setDirectoryName(String directoryName) {
//        this.directoryName = directoryName;
//    }
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public String getLogFileName() {
//        return logFileName;
//    }
//
//    public void setLogFileName(String logFileName) {
//        this.logFileName = logFileName;
//    }
//
//    public Path getDirectoryPath() {
//        return directoryPath;
//    }
//
//    public void setDirectoryPath(Path directoryPath) {
//        this.directoryPath = directoryPath;
//    }
//
//    public Path getFilePath() {
//        return filePath;
//    }
//
//    public void setFilePath(Path filePath) {
//        this.filePath = filePath;
//    }
//
//    public Path getLogFilePath() {
//        return logFilePath;
//    }
//
//    public void setLogFilePath(Path logFilePath) {
//        this.logFilePath = logFilePath;
//    }
//
//    public List<String> getFileLines() {
//        return fileLines;
//    }
//
//    public void setFileLines(List<String> fileLines) {
//        this.fileLines = fileLines;
//    }
//
//    public List<String> getLogFileLines() {
//        return logFileLines;
//    }
//
//    public void setLogFileLines(List<String> logFileLines) {
//        this.logFileLines = logFileLines;
//    }
//}

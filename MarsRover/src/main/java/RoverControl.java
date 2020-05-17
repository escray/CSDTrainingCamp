import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RoverControl {
    protected List<String> content;
    File file;

    public RoverControl(String fileName) {
        file = getFile(fileName);
        BufferedReader bufferReader = getBufferReader(file);
        if (bufferReader == null) {
            throw new NonReadBufferException();
        }
        content = getStringList(bufferReader);
    }

    public BufferedReader getBufferReader(File file) {
        BufferedReader br;
        try {
            FileReader reader = new FileReader(file);
            br = new BufferedReader(reader);
        } catch (FileNotFoundException e) {
            return null;
        }
        return br;
    }

    public List<String> getStringList(BufferedReader br) {
        content = new ArrayList<>();
        try {
            String line;
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
        }
        catch (IOException e) {
            return new ArrayList<>();
        }
        return content;
    }

    public File getFile(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) throw new IllegalArgumentException("file is not found!");
        return new File(resource.getFile());
    }

    public String getPostionString(String msg) {
        return msg.split(";")[0].split(":")[1];
    }

    public String getCommandString(String msg) {
        return msg.split(";")[1].split(":")[1];
    }
}

import java.io.FileWriter;
import java.io.IOException;

@Retention (RetentionPolicy.RUNTIME)
@interface SaveTo {
    String path();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Saver {
}

@SaveTo(path="C:/progacademy/hw")
class Container {
    String s = "Hi!";

    @Saver
    public void save(String path) throws IOException {
        FileWriter w = new FileWriter(path);
        try {
            w.write(s);
        } finally {
            w.close();
        }
    }
}

        

package pattern.created.FactoryMethodPattern.practices;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PngReaderFactory extends ImageReaderFactory {
    public PngReaderFactory(String filePath) throws IOException {
        super(filePath);
        this.image = ImageIO.read(new FileInputStream(this.getFilePath()));
    }

    @Override
    public ImageReader createImageReader(String path) throws TypeNotPresentException {

        return null;
    }
}

package pattern.created.FactoryMethodPattern.practices;

import java.awt.image.BufferedImage;
import java.io.File;

abstract class ImageReaderFactory {
    public BufferedImage image;
    private String filePath;
    public ImageReaderFactory(String filePath){
        this.filePath = filePath;
    }
    public abstract ImageReader createImageReader(String path) throws TypeNotPresentException;

    public String getFilePath() {
        return filePath;
    }
    public void formatChange(){

    }
}

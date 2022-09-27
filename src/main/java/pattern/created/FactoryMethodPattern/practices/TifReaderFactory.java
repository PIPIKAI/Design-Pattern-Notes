package pattern.created.FactoryMethodPattern.practices;

public class TifReaderFactory extends ImageReaderFactory {
    TifReaderFactory(String filePath) {
        super(filePath);
    }

    @Override
    public ImageReader createImageReader(String path) {
        return null;
    }
}

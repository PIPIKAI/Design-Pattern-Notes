package pattern.created.FactoryMethodPattern.practices;

public class GifReaderFactory extends ImageReaderFactory {
    public GifReaderFactory(String filePath) {
        super(filePath);
    }

    @Override
    public ImageReader createImageReader(String path) throws TypeNotPresentException {
        return null;
    }
}

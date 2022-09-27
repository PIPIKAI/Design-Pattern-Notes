package pattern.created.FactoryMethodPattern.practices;

public class JpgReaderFactory extends ImageReaderFactory {
    public JpgReaderFactory(String filePath) {
        super(filePath);
    }

    @Override
    public ImageReader createImageReader(String path) throws TypeNotPresentException {
        return null;
    }
}

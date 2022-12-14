package documents;

public class MusicDocument implements IDocument {
    private String documentName;
    private Object documentData;

    public MusicDocument(String documentName, Object documentData) {
        this.documentName = documentName;
        this.documentData = documentData;
    }

    @Override
    public String getDocumentName() {
        return documentName;
    }

    @Override
    public Object getDocumentData() {
        return documentData;
    }
}

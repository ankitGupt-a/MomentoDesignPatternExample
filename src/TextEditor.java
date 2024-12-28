public class TextEditor {
    private String text;

    public void setText(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public TextEditorMomento save() {
        return new TextEditorMomento(text);
    }

    public void restore(final TextEditorMomento textEditorMomento) {
        text = textEditorMomento.getText();
    }
}

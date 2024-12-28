public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextHistory history = new TextHistory();

        editor.setText("This is the first text");
        history.saveState(editor.save());

        editor.setText("This is the Second text");
        history.saveState(editor.save());

        editor.setText("This is the Third text");

        history.getLastState();
        TextEditorMomento lastState = history.getLastState();
        editor.restore(lastState);

        System.out.println(editor.getText());
    }
}
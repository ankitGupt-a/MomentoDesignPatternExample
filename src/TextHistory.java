import java.util.ArrayList;
import java.util.List;

public class TextHistory {
    private final List<TextEditorMomento> history = new ArrayList<>();

    public void saveState(final TextEditorMomento textEditorMomento) {
        history.add(textEditorMomento);
    }

    public TextEditorMomento getLastState() {
        if (history.isEmpty()) {
            return null;
        }

        return history.remove(history.size()-1);
    }

}

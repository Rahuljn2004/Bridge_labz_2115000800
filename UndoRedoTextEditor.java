class TextState {
    String content;
    TextState next, prev;

    public TextState(String content) {
        this.content = content;
        this.next = this.prev = null;
    }
}

class UndoRedoTextEditor {
    TextState current;

    public void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            newState.prev = current;
            current.next = newState;
        }
        current = newState;
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.content);
        } else {
            System.out.println("No previous state.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.content);
        } else {
            System.out.println("No next state.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No content available.");
        }
    }

    public static void main(String[] args) {
        UndoRedoTextEditor editor = new UndoRedoTextEditor();
        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.displayCurrentState();
        editor.undo();
        editor.redo();
    }
}

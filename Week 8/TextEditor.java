import javax.swing.*;

public class TextEditor extends JFrame {

    JTextArea textArea;

    TextEditor() {

        setTitle("Text Editor");
        setSize(600, 400);

        textArea = new JTextArea();

        add(new JScrollPane(textArea));

        JMenuBar bar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem New = new JMenuItem("New");
        JMenuItem Clear = new JMenuItem("Clear");
        JMenuItem Exit = new JMenuItem("Exit");

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        file.add(New);
        file.add(Clear);
        file.add(Exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        bar.add(file);
        bar.add(edit);

        setJMenuBar(bar);

        New.addActionListener(e -> textArea.setText(""));

        Clear.addActionListener(e -> textArea.setText(""));

        Exit.addActionListener(e -> System.exit(0));

        cut.addActionListener(e -> textArea.cut());

        copy.addActionListener(e -> textArea.copy());

        paste.addActionListener(e -> textArea.paste());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}
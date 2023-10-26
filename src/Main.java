import controller.Controller;
import model.dao.impl.FileOperation;
import model.repository.impl.NoteRepository;
import util.connecttoDB.DBConnector;
import view.ConsoleView;

public class Main {
     public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation(DBConnector.DBPATH);
        DBConnector db = new DBConnector();
        db.connect();
        NoteRepository noteRepository = new NoteRepository(fileOperation);
        Controller controller = new Controller(noteRepository);
        ConsoleView console = new ConsoleView(controller);
        console.runProgram();
    }
}
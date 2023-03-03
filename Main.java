package OOP_HomeWork5;

import OOP_HomeWork5.controllers.UserController;
import OOP_HomeWork5.model.FileOperation;
import OOP_HomeWork5.model.FileOperationImpl;
import OOP_HomeWork5.model.Repository;
import OOP_HomeWork5.model.RepositoryFile;
import OOP_HomeWork5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

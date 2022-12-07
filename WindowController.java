import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WindowController {

	// on each button pressed, check if the letter that's on the button's label exists in the hidden word
    @FXML
    void aPressed(ActionEvent event) {
    	if (h.guess('a') || used.getText().indexOf('a') != -1 || underscores.getText().indexOf('a') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "a, ");
    	}
    	
    }

    @FXML
    void bPressed(ActionEvent event) {
    	if (h.guess('b') || used.getText().indexOf('b') != -1 || underscores.getText().indexOf('b') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "c, ");
    	}
    }

    @FXML
    void cPressed(ActionEvent event) {
    	if (h.guess('c') || used.getText().indexOf('c') != -1 || underscores.getText().indexOf('c') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "c, ");
    	}
    }

    @FXML
    void dPressed(ActionEvent event) {
    	if (h.guess('d') || used.getText().indexOf('d') != -1 || underscores.getText().indexOf('d') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "d, ");
    	}
    }

    @FXML
    void ePressed(ActionEvent event) {
    	if (h.guess('e') || used.getText().indexOf('e') != -1 || underscores.getText().indexOf('e') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "e, ");
    	}
    }

    @FXML
    void fPressed(ActionEvent event) {
    	if (h.guess('f') || used.getText().indexOf('f') != -1 || underscores.getText().indexOf('f') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "f, ");
    	}
    }

    @FXML
    void gPressed(ActionEvent event) {
    	if (h.guess('g') || used.getText().indexOf('g') != -1 || underscores.getText().indexOf('g') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "g, ");
    	}
    }

    @FXML
    void hPressed(ActionEvent event) {
    	if (h.guess('h') || used.getText().indexOf('h') != -1 || underscores.getText().indexOf('h') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "h, ");
    	}
    }

    @FXML
    void iPressed(ActionEvent event) {
    	if (h.guess('i') || used.getText().indexOf('i') != -1 || underscores.getText().indexOf('i') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "i, ");
    	}
    }

    @FXML
    void jPressed(ActionEvent event) {
    	if (h.guess('j') || used.getText().indexOf('j') != -1 || underscores.getText().indexOf('j') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "j, ");
    	}
    }

    @FXML
    void kPressed(ActionEvent event) {
    	if (h.guess('k') || used.getText().indexOf('k') != -1 || underscores.getText().indexOf('k') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "k, ");
    	}
    }

    @FXML
    void lPressed(ActionEvent event) {
    	if (h.guess('l') || used.getText().indexOf('l') != -1 || underscores.getText().indexOf('l') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "l, ");
    	}
    }

    @FXML
    void mPressed(ActionEvent event) {
    	if (h.guess('m') || used.getText().indexOf('m') != -1 || underscores.getText().indexOf('m') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "m, ");
    	}
    }

    @FXML
    void nPressed(ActionEvent event) {
    	if (h.guess('n') || used.getText().indexOf('n') != -1 || underscores.getText().indexOf('n') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "n, ");
    	}
    }

    @FXML
    void oPressed(ActionEvent event) {
    	if (h.guess('o') || used.getText().indexOf('o') != -1 || underscores.getText().indexOf('o') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "o, ");
    	}
    }

    @FXML
    void pPressed(ActionEvent event) {
    	if (h.guess('p') || used.getText().indexOf('p') != -1 || underscores.getText().indexOf('p') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "p, ");
    	}
    }

    @FXML
    void qPressed(ActionEvent event) {
    	if (h.guess('q') || used.getText().indexOf('q') != -1 || underscores.getText().indexOf('q') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "q, ");
    	}
    }

    @FXML
    void rPressed(ActionEvent event) {
    	if (h.guess('r') || used.getText().indexOf('r') != -1 || underscores.getText().indexOf('r') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "r, ");
    	}
    }

    @FXML
    void sPressed(ActionEvent event) {
    	if (h.guess('s') || used.getText().indexOf('s') != -1 || underscores.getText().indexOf('s') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "s, ");
    	}
    }

    @FXML
    void tPressed(ActionEvent event) {
    	if (h.guess('t') || used.getText().indexOf('t') != -1 || underscores.getText().indexOf('t') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "t, ");
    	}
    }

    @FXML
    void uPressed(ActionEvent event) {
    	if (h.guess('u') || used.getText().indexOf('u') != -1 || underscores.getText().indexOf('u') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "u, ");
    	}
    }

    @FXML
    void vPressed(ActionEvent event) {
    	if (h.guess('v') || used.getText().indexOf('v') != -1 || underscores.getText().indexOf('v') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "v, ");
    	}
    }

    @FXML
    void wPressed(ActionEvent event) {
    	if (h.guess('w') || used.getText().indexOf('w') != -1 || underscores.getText().indexOf('w') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "w, ");
    	}
    }

    @FXML
    void xPressed(ActionEvent event) {
    	if (h.guess('x') || used.getText().indexOf('x') != -1 || underscores.getText().indexOf('x') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "x, ");
    	}
    }

    @FXML
    void yPressed(ActionEvent event) {
    	if (h.guess('y') || used.getText().indexOf('y') != -1 || underscores.getText().indexOf('y') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "y, ");
    	}
    }

    @FXML
    void zPressed(ActionEvent event) {
    	if (h.guess('z') || used.getText().indexOf('z') != -1 || underscores.getText().indexOf('z') != -1)
    		update();
    	else {
    		draw();
    		used.setText(used.getText() + "z, ");
    	}
    } 
    // draw() responsible for printing out used letters and drawing the stickman on false guesses
    private int buffer;
    private void draw() {
    	//every 4 wrong guessed letters, drop a line
    	if (buffer++ % 4 == 0)
    		used.setText(used.getText() + "\n");
    	h.addMistake();
    	// drawing each line after every wrong guess, eventually building the hangman
    	switch(h.getMistakes()) {
    	case 1: 
    		gc.strokeLine(0, canvas.getHeight(), canvas.getWidth(), canvas.getHeight());
    		break;
    	case 2:
    		gc.strokeLine(canvas.getWidth()/4, canvas.getHeight(), canvas.getWidth()/4, 0);
    		break;
    	case 3:
    		gc.strokeLine(canvas.getWidth()/4, 0, canvas.getWidth()/1.5, 0);
    		break;
    	case 4:
    		gc.strokeLine(canvas.getWidth()/1.5, 0, canvas.getWidth()/1.5, canvas.getHeight()/4);
    		break;
    	case 5:
    		gc.strokeOval(canvas.getWidth()/1.6, canvas.getHeight()/4, 25, 25);
    		break;
    	case 6:
    		gc.strokeLine(canvas.getWidth()/1.48, canvas.getHeight()/2.87, canvas.getWidth()/1.48, canvas.getHeight()/1.8);
    		break;
    	case 7:
    		gc.strokeLine(canvas.getWidth()/1.48, canvas.getHeight()/2.8, canvas.getWidth()/1.6, canvas.getHeight()/2);
    		break;
    	case 8:
    		gc.strokeLine(canvas.getWidth()/1.48, canvas.getHeight()/2.8, canvas.getWidth()/1.36, canvas.getHeight()/2);
    		break;
    	case 9:
    		gc.strokeLine(canvas.getWidth()/1.48, canvas.getHeight()/1.8, canvas.getWidth()/1.61, canvas.getHeight()/1.5);
    		break;
    	case 10:
    		gc.strokeLine(canvas.getWidth()/1.48, canvas.getHeight()/1.8, canvas.getWidth()/1.35, canvas.getHeight()/1.5);
    		close('L'); // 'L' for Lose, didn't find the hidden word in time.
    		break;
    	}
    	
    }
    
    // popping up an ending message and closing the application
    private void close(char res) {
    	switch(res) {
    	case 'W':
    		JOptionPane.showMessageDialog(null, "Congrats! you found the hidden word; " + h.getHidden() + "!");
    		break;
    	case 'L':
    		String answer = "";
    		for (int i = 0; i < h.getHidden().length(); i++) {
				if (h.getHidden().charAt(i) != '_')
					answer += h.getHidden().charAt(i);
				else
					answer += h.getWord().charAt(i);
					
			}
    		JOptionPane.showMessageDialog(null, "Yikes! you ran out of turns :( \nThe word was: " + answer + ".");
    		break;
    	}
    	Stage stage = (Stage)used.getScene().getWindow();
		stage.close();
    }
    
    // updates the hidden word after guessing correctly, when the whole word has been guessed, call for the end() function.
    private void update() {
    	underscores.setText(h.getHidden());
    	if(h.getHidden().indexOf('_') == -1) // 'W' for win, the word has been found!
    		close('W');
    }
    
    @FXML
    void newGameButtonPress(ActionEvent event) {
    	startGame();
    }
    
    @FXML
    private Label used;

    @FXML
    private Label underscores;
    
    @FXML
    private Canvas canvas;
    private GraphicsContext gc;
    
    private Hangman h;
    
    public void startGame() {
    	h = new Hangman();
    	underscores.setText(h.getHidden());
    	gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    	used.setText("");
    	buffer = 0;
    }

    public void initialize() {
    	gc = canvas.getGraphicsContext2D();
    	gc.setFill(Color.BLACK);
    	startGame();
    }
}

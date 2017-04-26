package application;

import org.apache.commons.lang3.ArrayUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;


public class MainWindowController {

	Image Ppl64On = new Image("/imgs/64_active.png");
	Image Ppl64Off = new Image("/imgs/64_default.png");
	
	Image Ppl32On = new Image("/imgs/5_active.png");
	Image Ppl32Off = new Image("/imgs/5_default.png");
	
	Image Ppl16On = new Image("/imgs/4_active.png");
	Image Ppl16Off = new Image("/imgs/4_default.png");
	
	Image Ppl8On = new Image("/imgs/1_active.png");
	Image Ppl8Off = new Image("/imgs/1_default.png");
	
	Image Ppl4On = new Image("/imgs/6_active.png");
	Image Ppl4Off = new Image("/imgs/6_default.png");
	
	Image Ppl2On = new Image("/imgs/3_active.png");
	Image Ppl2Off = new Image("/imgs/3_default.png");
	
	Image Ppl1On = new Image("/imgs/2_active.png");
	Image Ppl1Off = new Image("/imgs/2_default.png");

	@FXML private Label result;
	//@FXML private Label SumOf;
	private int[] Potencia64 = {64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99};
	private int[] Potencia32 = {32,33,	34,	35,	36,37,	38,	39,	40,	41,42,	43,	44,	45,	46,47,	48,	49,	50,	51,52,	53,	54,	55,	56,57,	58,	59,	60,	61,62,	63,	96,	97,	98,99};
	private int[] Potencia16 = {16,	17,	18,	19,	20, 21,	22,	23,	24,	25,26,	27,	28,	29,	30,31,	48,	49,	50,	51,52,	53,	54,	55,	56,57,	58,	59,	60,	61,62,	63,	80,	81,	82,83,	84,	85,	86,	87,88,	89,	90,	91,	92,93,	94,	95};
	private int[] Potencia8 = {8,	9,	10,	11,	12,13,	14,	15,	24,	25,26,	27,	28,	29,	30,31,	40,	41,	42,	43,44,	45,	46,	47,	56,57,	58,	59,	60,	61,62,	63,	72,	73,	74,75,	76,	77,	78,	79,88,	89,	90,	91,	92,93,	94,	95};
	private int[] Potencia4 = {4,	5,	6,	7,	12,13,	14,	15,	20,	21,22,	23,	28,	29,	30,31,	36,	37,	38,	39,44,	45,	46,	47,	52,53,	54,	55,	60,	61,62,	63,	68,	69,	70,71,	76,	77,	78,	79,84,	85,	86,	87,	92,93,	94,	95};
	private int[] Potencia2 = {2,	3,	6,	7,	10,11,	14,	15,	18,	19,22,	23,	26,	27,	30,31,	34,	35,	38,	39,42,	43,	46,	47,	50,51,	54,	55,	58,	59,62,	63,	66,	67,	70,71,	74,	75,	78,	79,82,	83,	86,	87,	90,91,	94,	95,	98,	99};
	private int[] Potencia1 = {1,	3,	5,	7,	9,11,	13,	15,	17,	19,21,	23,	25,	27,	29,31,	33,	35,	37,	39,41,	43,	45,	47,	49,51,	53,	55,	57,	59,61,	63,	65,	67,	69,71,	73,	75,	77,	79,81,	83,	85,	87,	89,91,	93,	95,	97,	99};
	private boolean reset = false;
	@FXML private ImageView circle64 = new ImageView();
	@FXML private ImageView circle32 = new ImageView();
	@FXML private ImageView circle16 = new ImageView();
	@FXML private ImageView circle8 = new ImageView();
	@FXML private ImageView circle4 = new ImageView();
	@FXML private ImageView circle2 = new ImageView();
	@FXML private ImageView circle1 = new ImageView();

	@FXML private Label label64 = new Label();
	@FXML private Label label32 = new Label();
	@FXML private Label label16 = new Label();
	@FXML private Label label8 = new Label();
	@FXML private Label label4 = new Label();
	@FXML private Label label2 = new Label();
	@FXML private Label label1 = new Label();
	
	@FXML private Label labelp64 = new Label();
	@FXML private Label labelp32 = new Label();
	@FXML private Label labelp16 = new Label();
	@FXML private Label labelp8 = new Label();
	@FXML private Label labelp4 = new Label();
	@FXML private Label labelp2 = new Label();
	
	@FXML private Rectangle rec64 = new Rectangle();
	@FXML private Rectangle rec32 = new Rectangle();
	@FXML private Rectangle rec16 = new Rectangle();
	@FXML private Rectangle rec8 = new Rectangle();
	@FXML private Rectangle rec4 = new Rectangle();
	@FXML private Rectangle rec2 = new Rectangle();
	@FXML private Rectangle rec1 = new Rectangle();
	
	
	/////////////////////////////////////

	 Stop[] stops = new Stop[] { new Stop(0, Color.FIREBRICK), new Stop(1, Color.RED)};
     LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
     
     Color c = Color.web("0x007fbd",1.0);
     Color transparent = Color.web("0xFEFEFE",0.0);
     Color greenCSS = Color.web("0xc4d600",1.0);
     
	 Stop[] stops1 = new Stop[] { new Stop(0, Color.GREEN), new Stop(1, Color.LIMEGREEN)};
     LinearGradient lg2 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops1);

	
	@FXML public void reset(){
		circle64.setImage(Ppl64Off);
		circle32.setImage(Ppl32Off);
		circle16.setImage(Ppl16Off);
		circle8.setImage(Ppl8Off);
		circle4.setImage(Ppl4Off);
		circle2.setImage(Ppl2Off);
		circle1.setImage(Ppl1Off);
		//SumOf.setText("");
		label64.setText("");
		label32.setText("");
		label16.setText("");
		label8.setText("");
		label4.setText("");
		label2.setText("");
		label1.setText("");
		labelp64.setText("");
		labelp32.setText("");
		labelp16.setText("");
		labelp8.setText("");
		labelp4.setText("");
		labelp2.setText("");
		rec64.setFill(transparent);
		rec32.setFill(transparent);
		rec16.setFill(transparent);
		rec8.setFill(transparent);
		rec4.setFill(transparent);
		rec2.setFill(transparent);
		rec1.setFill(transparent);
		result.setText("Selecciona un número");
	}

	@FXML
	public void Search(ActionEvent event){
		reset();
		String value = ((Button)event.getSource()).getText();
		//System.out.println("Presione un boton");
		//result.setText(" = " + value);
		//Change String to int for ArrayUtils
		int number = Integer.parseInt(((Button)event.getSource()).getText());
		String SumOfStr = "El número " + value + " es la suma de ";
		boolean flag = true;
		//If statements to activate the Images in the ImageView Object
		if(ArrayUtils.contains(Potencia64,number)){
			label64.setText("64");
			circle64.setImage(Ppl64On);
			rec64.setFill(greenCSS);
			SumOfStr += ("2^6");
			flag = false;
		} else { label64.setText("0"); }
		if(ArrayUtils.contains(Potencia32,number)){
			label32.setText("32");
			circle32.setImage(Ppl32On);
			rec32.setFill(greenCSS);
			if(flag){
				SumOfStr += ("2^5");
				flag = false;
			}	
			else{
				SumOfStr += ("+ 2^5");
			}
		} else { label32.setText("0"); }
		if(ArrayUtils.contains(Potencia16,number)){
			label16.setText("16");
			circle16.setImage(Ppl16On);
			rec16.setFill(greenCSS);
			if(flag){
				SumOfStr += ("2^4");
				flag = false;
			}
			else{
				SumOfStr += ("+ 2^4");
			}
		} else { label16.setText("0"); }
		if(ArrayUtils.contains(Potencia8,number)){
			label8.setText("8");
			circle8.setImage(Ppl8On);
			rec8.setFill(greenCSS);
			if(flag){
				SumOfStr += ("2^3");
				flag = false;
			}
			else{
				SumOfStr += ("+ 2^3");
			}
		}else { label8.setText("0"); }
		if(ArrayUtils.contains(Potencia4,number)){
			label4.setText("4");
			circle4.setImage(Ppl4On);
			rec4.setFill(greenCSS);
			if(flag){
				SumOfStr += ("2^2");
				flag = false;
			}
			else{
				SumOfStr += ("+ 2^2");
			}
		} else { label4.setText("0"); }
		if(ArrayUtils.contains(Potencia2,number)){
			label2.setText("2");
			circle2.setImage(Ppl2On);
			rec2.setFill(greenCSS);
			if(flag){
				SumOfStr += ("2^1");
				flag = false;
			}
			else{
				SumOfStr += ("+ 2^1");
			}
		} else { label2.setText("0"); }
		if(ArrayUtils.contains(Potencia1,number)){
			label1.setText("1");
			circle1.setImage(Ppl1On);
			rec1.setFill(greenCSS);
			if(flag){
				SumOfStr += ("2^0");
				flag = false;
			}
			else{
				SumOfStr += ("+ 2^0");
			}
		} else { label1.setText("0"); }
		SumOfStr += (" =" + value);
		result.setText(SumOfStr);
		labelp64.setText("+");
		labelp32.setText("+");
		labelp16.setText("+");
		labelp8.setText("+");
		labelp4.setText("+");
		labelp2.setText("+");
	}
}


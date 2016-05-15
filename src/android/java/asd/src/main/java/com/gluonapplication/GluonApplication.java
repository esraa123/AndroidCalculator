package asd.src.main.java.com.gluonapplication;




import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GluonApplication extends Application 
{
	 public static String value="";
	 private static double number1 = 0.0;
	 private static String operator = "";

	 static double val=0.0;
	public static double res=0.0;
	public static int c=0;

 @Override 
 // Override the start method in the Application class
 public void start(Stage primaryStage)
 {
	 TextField tf=new TextField("");
	 tf.setPrefSize(360,50);
	 tf.setStyle("-fx-control-inner-background: #c7bde3");
	 
	 TextField tf2=new TextField("");
	 tf2.setPrefSize(360,19);
	 tf2.setStyle("-fx-control-inner-background: #c7bde3");
	 
	 HBox h1=new HBox();
	 Button b7=new Button("7");
	 b7.setPrefSize(70,60);
	 b7.setStyle("-fx-base: #fe847f;");
	 
	 Button b8=new Button("8");
	 b8.setPrefSize(70,60);
	 b8.setStyle("-fx-base:  #fe847f;");

	 Button b9=new Button("9");
	 b9.setPrefSize(70,60);
	 b9.setStyle("-fx-base:  #fe847f;");

	 Button sum=new Button("+");
	 sum.setPrefSize(70,60);
	 sum.setStyle("-fx-base: #ffb59e;");

	 Button sub=new Button("-");
	 sub.setPrefSize(70,60);
	 sub.setStyle("-fx-base: #ffb59e;");

	 Button square=new Button("x²");
	 square.setPrefSize(70,60);
	 square.setStyle("-fx-base: #ffb59e;");

	 Button sin=new Button("Sin()");
	 sin.setPrefSize(70,60);
	 sin.setStyle("-fx-base: #ffb59e;");

	 h1.setSpacing(1);
	 h1.setAlignment(Pos.CENTER);
	 h1.getChildren().addAll(b7,b8,b9,sum,sub,square,sin);
	 
	 HBox h2=new HBox();
	 Button b4=new Button("4");
	 b4.setPrefSize(70,60);
	 b4.setStyle("-fx-base:  #fe847f;;");

	 Button b5=new Button("5");
	 b5.setPrefSize(70,60);
	 b5.setStyle("-fx-base:  #fe847f;");

	 Button b6=new Button("6");
	 b6.setPrefSize(70,60);
	 b6.setStyle("-fx-base: #fe847f;");

	 Button multi=new Button("x");
	 multi.setPrefSize(70,60);
	 multi.setStyle("-fx-base: #ffb59e;");

	 Button div=new Button("/");
	 div.setPrefSize(70,60);
	 div.setStyle("-fx-base: #ffb59e;");

	 Button sqrt=new Button("√");
	 sqrt.setPrefSize(70,60);
	 sqrt.setStyle("-fx-base: #ffb59e;");

	 Button cos=new Button("Cos()");
	 cos.setPrefSize(70,60);
	 cos.setStyle("-fx-base: #ffb59e;");

	 h2.setSpacing(1);
	 h2.setAlignment(Pos.CENTER);
	 h2.getChildren().addAll(b4,b5,b6,multi,div,sqrt,cos);
	
	 HBox h3=new HBox();
	 Button b1=new Button("1");
	 b1.setPrefSize(70,60);
	 b1.setStyle("-fx-base:  #fe847f;");

	 Button b2=new Button("2");
	 b2.setPrefSize(70,60);
	 b2.setStyle("-fx-base:  #fe847f;");

	 Button b3=new Button("3");
	 b3.setPrefSize(70,60);
	 b3.setStyle("-fx-base:  #fe847f;");

	 Button tan=new Button("tan()");
	 tan.setPrefSize(70,60);
	 tan.setStyle("-fx-base: #ffb59e;");

	 Button C=new Button("C");
	 C.setPrefSize(70,60);
	 C.setStyle("-fx-base: #ffb59e;");

	 Button cub=new Button("x^3");
	 cub.setPrefSize(70,60);
	cub.setStyle("-fx-base: #ffb59e;");

	 Button dot=new Button(".");
	 dot.setPrefSize(70,60);
	 dot.setStyle("-fx-base: #ffb59e;");

	 h3.setSpacing(1);
	 h3.setAlignment(Pos.CENTER);
	 h3.getChildren().addAll(b1,b2,b3,dot,C,cub,tan);
	
	 HBox h4=new HBox();
	 Button b0=new Button("0");
	 b0.setPrefSize(70,60);
	 b0.setStyle("-fx-base: #fe847f;");

	 Button equal=new Button("=");
	 equal.setPrefSize(70,60);
	 equal.setStyle("-fx-base: #fe847f;");

	 Button acos=new Button("cos-1()");
	 acos.setPrefSize(70,60);
	 acos.setStyle("-fx-base: #ffb59e;");

	 Button asin=new Button("sin-1()");
	 asin.setPrefSize(70,60);
	 asin.setStyle("-fx-base: #ffb59e;");

	 Button atan=new Button("tan-1()");
	 atan.setPrefSize(70,60);
	 atan.setStyle("-fx-base: #ffb59e;");
	 Button on=new Button("on");
	on.setPrefSize(70,60);
	 on.setStyle("-fx-base:  #fe847f;");
	 
	 Button PI=new Button("PI");
	 PI.setPrefSize(70,60);
	 PI.setStyle("-fx-base:  #fe847f;");

	 h4.setSpacing(1);
	 h4.setAlignment(Pos.CENTER);
	 h4.getChildren().addAll(b0,acos,asin,atan,on,PI,equal);

	 VBox v=new VBox(); 
	 v.setSpacing(1);
	v.getChildren().addAll(tf2,tf,h1,h2,h3,h4);
	
	//---------------------------------------------events-------------------------------------------//

	on.setOnAction(e->{
		b0.setOnAction(new EventHandler<ActionEvent>() {
	

			public void handle(ActionEvent e) {
				value=b0.getText();
		      
				tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);
			}
			 }
			 );

		b1.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b1.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);
					}
			 }
			 );

		b2.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b2.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );
		b3.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b3.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );
		b4.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b4.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );
		b5.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b5.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );

		b6.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b6.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );
		b7.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b7.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );

		b8.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b8.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );

		b9.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=b9.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );

		dot.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				value=dot.getText();
		         tf.setText(tf.getText() + value);
		         tf2.setText(tf2.getText() + value);

			}
			 }
			 );
		
		PI.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
		        double pi = Math.PI;
		         tf.setText(tf.getText() + pi);
		         tf2.setText(tf2.getText() + pi);
		         
					}
			 }
			 );

	//---------------------------------------------------- Opeartion ----------------------------------//
		
	sum.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			
			{
	            operator = "+";
	            number1=Double.parseDouble(tf.getText())+val;
	            val=number1;
	           // val=model.calculate(0,number1, operator);	            
	           tf.setText("");
	            tf2.setText(  tf2.getText()+"+");
	         }
		}
		 }
		 );
	
	sub.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			
			{
	            operator = "-";
	            number1=Double.parseDouble(tf.getText());
	            c++;
	
	            if(c==1){
	            	
	            	 res=model.calculate(number1,0, operator);
	            	 c++;
	            }
	            else{
	        res=model.calculate(res,number1, operator);
	            }	            
	            tf.setText("");
	            tf2.setText(  tf2.getText()+"-");
			}
		
		}
		 }
		 );

	multi.setOnAction(new EventHandler<ActionEvent>() {
	
		public void handle(ActionEvent e) {
			{
	            operator = "x";
	            val=1;
	            
	            number1=Double.parseDouble(tf.getText());
	            c++;
	
	            if(c==1){
	            	
	            	 res=model.calculate(number1,1, operator);
	            	 c++;
	            }
	            
	            else{
	            	
	            res=model.calculate(res,number1, operator);
	            }
	            
	            tf.setText("");
	            tf2.setText(  tf2.getText()+"x");
			}
	}
				
		 }
		 );
	
	div.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			{
	            operator = "/";
	            val=1;
	            
	            number1=Double.parseDouble(tf.getText());
	            c++;
	
	            if(c==1){
	            	
	            	 res=model.calculate(number1,1, operator);
	            	 c++;
	            }
	            else{
	            	
	            res=model.calculate(res,number1, operator);
	            }
	            
	            tf.setText("");
	            tf2.setText(  tf2.getText()+"/");
			}
		 }
	}
	);

	sqrt.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	        double num2 = Double.parseDouble(tf.getText());            	 
            num2=Math.sqrt(num2);
           tf.setText(String.valueOf(num2));
           tf2.setText("√"+value);
       	return;
        }
	 }
		 );
	
	square.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

            double num1 = Double.parseDouble(tf.getText());
            num1=num1*num1;
           tf.setText(String.valueOf(num1));
           tf2.setText("("+value+")²");
       	return;
		}
		 }
		 );

	cub.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

            double num1 = Double.parseDouble(tf.getText());
            num1=num1*num1*num1;
           tf.setText(String.valueOf(num1));
           tf2.setText("("+value+")^3");
       	return;
		}
		 }
		 );
	

	C.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
	    	tf.setText("");
	    	   tf2.setText("");
	    	   val=0;
	    	   res=0;
	    	   value="";
        	return;
    		}
		 }
		 );
	cos.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	        double num2 = Double.parseDouble(tf.getText());            	 
	        double raduis=Math.toRadians(num2);;
	        if(num2==90||num2==270){
	        	tf.setText(String.valueOf(0));
	            tf2.setText("Cos("+num2+")");

	        	return;
	        }
	        else{
	        double angle = Math.cos(raduis);
	        
           tf.setText(String.valueOf(angle));
           tf2.setText("Cos("+num2+")");

       	return;
        }
	 }
		}
		 );

	sin.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	        double num2 = Double.parseDouble(tf.getText());            	 
	        double raduis=Math.toRadians(num2);;
	        if(num2==180||num2==360){
	        	tf.setText(String.valueOf(0));
	            tf2.setText("Sin("+num2+")");

	        	return;
	        }

	        else
	        	{double angle = Math.sin(raduis);
	        
	        	tf.setText(String.valueOf(angle));
	            tf2.setText("Sin("+num2+")");
	
	        	return;
        }
	        }
	 }
		 );

	tan.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	        double num2 = Double.parseDouble(tf.getText());            	 
	        double raduis=Math.toRadians(num2);;
	        if(num2==90||num2==270){
	        	tf.setText("Invalid input");
	        	return;
	        }
	        if(num2==180||num2==360){
	        	tf.setText(String.valueOf(0));
	            tf2.setText("tan("+num2+")");

	        	return;
	        }

	        double angle = Math.sin(raduis)/Math.cos(raduis);
	        	tf.setText(String.valueOf(angle));
	            tf2.setText("tan("+num2+")");

	        	return;
        
	        }
	 }
		 );
	acos.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	        double num2 = Double.parseDouble(tf.getText());            	 
	        double angle = Math.toDegrees(Math.acos(num2));
           tf.setText(String.valueOf(angle));
           tf2.setText("Cos("+num2+")^-1");

       	return;
        }
	 }
		 );

	asin.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	        double num2 = Double.parseDouble(tf.getText());            	 
	      double angle = Math.toDegrees(Math.asin(num2));

           tf.setText(String.valueOf(angle));
           tf2.setText("Sin("+num2+")^-1");

       	return;
        }
	 }
		 );

	atan.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {

	        double num2 = Double.parseDouble(tf.getText());            	 
	        double angle = Math.toDegrees(Math.atan(num2));
	        tf.setText(String.valueOf(angle));
	        tf2.setText("tan("+num2+")^-1");

       	return;
        }
	 }
		 );
	});

	equal.setOnAction(e->{

		new Thread(new Runnable() {
	
	 @Override
	 	public void run() {
		 try{
			 if(operator=="-"){
				 res=res-Double.parseDouble(tf.getText());
				 tf.setText(String.valueOf(res));
				 c=0;			 }
			 
			 else if(operator=="x"){
				 res=res*Double.parseDouble(tf.getText());
				 tf.setText(String.valueOf(res));
				 c=0;
			 }
			 
			 else if (operator=="/")
			 {
				 res=res/Double.parseDouble(tf.getText());
				 tf.setText(String.valueOf(res));
				 c=0;
				 
			 }
			 else
			 {
				 val=val+Double.parseDouble(tf.getText());
				 tf.setText(String.valueOf(val));

			 }
			 val=0;

			 operator = "";
    	 Thread.sleep(2000);
		 }

		 catch (InterruptedException ex) { }
	 
	 		}
			}
		).start();

	});
	
	Scene scene = new Scene(v,480,300);
	primaryStage.setTitle("Tashenrechner"); // Set the stage title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show();
 	}
 
 
 public static void main(String[] args)
 {
     Application.launch(args);
 }
 
}

 class model {

	public static double res=0;
   public static double calculate(double number1, double number2, String operator) {
   	
   	switch (operator) {
           case "+":
               return res= number1 + number2;
           case "-":
               return res=number1 - number2;
           case "x":
               return res =number1 * number2;
           case "/":
               if (number2 == 0.0)
                   return 0;
               
			return res=number1 / number2;
               
           case "%":
               return res=number1 % number2;
           
          }

   	System.out.println("Waring !! Unknown operator - " + operator);
       return 0;
   }
}

package p1;
import java.util.*;
public class Main {
	void college() {
		System.out.println("Select your College: \n1 PIT\n2 PIET\n3 Exit");
		Scanner sc = new Scanner (System.in);
		int college = sc.nextInt();
		switch (college) {
		case 1:
			department();
			break;
		case 2:
			department();
			break;
		case 3:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option!");
		}
		sc.close();
	}
	
	void department() {
		System.out.println("Select your department: \n1 CSE\n2 ECE\n3 Civil\n4 MECH\n5 Go back to college selection\n6 Exit");
		Scanner sc = new Scanner(System.in);
		int dp = sc.nextInt();
		switch (dp) {
		case 1:
			cse_sub_department();
			break;
		case 2:
			ece_sub_department();
			break;
		case 3:
			civil_sub_department();
			break;
		case 4:
			mech_sub_department();
			break;
		case 5:
			college();
			break;
		case 6:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void cse_sub_department() {
	    System.out.println("Select your sub-department: \n1 CC\n2 AI\n3 IOT\n4 BDA\n5 Go back to department section\n6 Exit");
		Scanner sc = new Scanner(System.in);
		int sub_dp = sc.nextInt();
		switch(sub_dp) {
		case 1:
			cse_event_selection();
			break;
		case 2:
			cse_event_selection2();
			break;
		case 3:
			cse_event_selection3();
			break;
		case 4:
			cse_event_selection4();
			break;
		case 5:
			department();
			break;
		case 6:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void cse_event_selection() {
		System.out.println("Welcome to Cloud Computing.");
		System.out.println("Select the Events: \n1 RDBMS\n2 SDLC\n3 Go Back to Sub-Department\n4 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			cse_venue_detail2();
			break;
		case 2:
			cse_venue_detail();
			break;
		case 3:
			cse_sub_department();
			break;
		case 4:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void cse_event_selection2() {
		System.out.println("Welcome to Artificial Intelligence");
		System.out.println("Select the Events: \n1 Google cloud machine learning Engine\n2 TensorFlow\n3 Go back to Sub-Department\n4 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			cse_venue_detail3();
			break;
		case 2:
			cse_venue_detail4();
			break;
		case 3 :
			cse_sub_department();
			break;
		case 4:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void cse_event_selection3() {
		System.out.println("Welcome to Internet Of Things.");
		System.out.println("Select the Events: \n1 Face recognition bot\n2 Li-Fi \n3 Go Back to Sub-Department\n4 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			cse_venue_detail5();
			break;
		case 2:
			cse_venue_detail6();
			break;
		case 3:
			cse_sub_department();
			break;
		case 4:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void cse_event_selection4() {
		System.out.println("Welcome to Big Data Analytics.");
		System.out.println("Select the Events: \n1 Anomoly detection in cloud servers\n2 Text-Mining \n3 Go Back to Sub-Department\n4 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			cse_venue_detail7();
			break;
		case 2:
			cse_venue_detail8();
			break;
		case 3:
			cse_sub_department();
			break;
		case 4:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void cse_venue_detail() {
		System.out.println("SDLC:- \n Software development life cycle.\n bla bla bla bla\n bla bla bla bla");
		System.out.println("Venue details:- \n College: PIT\n Block: A\n Room No: 371\n");
		cse_event_selection();
	}
	void cse_venue_detail2() {
		System.out.println("RDBMS:- \n Relational database management system.\n bla bla bla bla\\n bla bla bla bla");
		System.out.println("Venue details:- \n College: PIES\n Block: A\n Room No: 201\n");
		cse_event_selection();
	}
	void cse_venue_detail3() {
		System.out.println("Google cloud machine learning engine:- \n Train your model components provided by Cloud ML engine\n includes google cloud platform console, gcloud, and REST API.\n bla bla bla bla");
		System.out.println("Venue details:- \n College: PIET\n Block: D\n Room no: 213\n");
		cse_event_selection2();
	}
	void cse_venue_detail4() {
		System.out.println("TensorFlow:- \n An opensource machine learning framework for everyone\n bla bla bla bla\n bla bla bla bla");
		System.out.println("Venue details:- \n College: PIET\n Block: C\n Room no: 119\n");
		cse_event_selection2();
	}
	void cse_venue_detail5() {
		System.out.println("Face recognition bot:- \n We will learn about how to develop this.\n What are it's advantages and disadvantages.");
		System.out.println("Venue details:- \n College: PIT\n Block: A\n Room no: 274\n");
		cse_event_selection3();
	}
	void cse_venue_detail6() {
		System.out.println("Li-Fi:- \n Workshop about Li-Fi and how it is developed.\n How it is better than today's technology?");
		System.out.println("Venue details:- \n College: PIET\n Block: A\n Room no: 339\n");
		cse_event_selection3();
	}
	void cse_venue_detail7() {
		System.out.println("Anomoly detection in cloud servers:- \n Workshop about detections of errors in cloud servers.\n And you'll also learn abot how to resolve them?");
		System.out.println("Venue details:- \n College: PIET\n Block: C\n Room no: 214\n");
		cse_event_selection4();
	}
	void cse_venue_detail8() {
		System.out.println("Text-Mining:- \n Workshop about text mining from a lot of data.\n bla bla bla bla bla");
		System.out.println("Venue details:- \n College: PIET\n Block: A\n Room no: 312\n");
		cse_event_selection4();
	}
	
	void ece_sub_department() {
		System.out.println("Select your sub-department: \n1 Signal Processing\n2 Telecommunication\n3 Computer Engineering\n4 Go back to department section\n5 Exit");
		Scanner sc = new Scanner(System.in);
		int sub_dp = sc.nextInt();
		switch(sub_dp) {
		case 1:
			ece_event_selection();
			break;
		case 2:
			ece_event_selection2();
			break;
		case 3:
			ece_event_selection3();
			break;
		case 4:
			department();
			break;
		case 5:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void ece_event_selection() {
		System.out.println("Welcome to Signal Processing.");
		System.out.println("Select the Events: \n1 Digital video registering\n2 Channel Coding\n3 Go Back to Sub-Department\n4 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			ece_venue_detail();
			break;
		case 2:
			ece_venue_detail2();
			break;
		case 3:
			ece_sub_department();
			break;
		case 4:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void ece_event_selection2() {
		System.out.println("Welcome to Telecommunication.");
		System.out.println("Select the Events: \n1 Voice Recognition System\n2 Nano Size satelite\n3 Go Back to Sub-Department\n4 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			ece_venue_detail3();
			break;
		case 2:
			ece_venue_detail4();
			break;
		case 3:
			ece_sub_department();
			break;
		case 4:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void ece_event_selection3() {
		System.out.println("Welcome to Computer Engineering.");
		System.out.println("Select the Events: \n1 Data Science\n2 Go Back to Sub-Department\n3 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			ece_venue_detail5();
			break;
		case 2:
			ece_sub_department();
			break;
		case 3:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void ece_venue_detail() {
		System.out.println("Digital Video Registering:- \n This study examines the possibility of replacing\n an outdated, analog video recording system to a digital counterpart.");
		System.out.println("Venue details:- \n College: PIMS\n Block: D\n Room No: 171\n");
		ece_event_selection();
	}
	void ece_venue_detail2() {
		System.out.println("Channel Coding:- \n bla bla bla bla bla\n bla bla bla bla bla");
		System.out.println("Venue details:- \n College: PIT\n Block: A\n Room No: 371\n");
		ece_event_selection();
	}
	void ece_venue_detail3() {
		System.out.println("Voice Recognition system:- \n Development and usage of this sytem.\n bla bla bla bla\n bla bla bla bla");
		System.out.println("Venue details:- \n College: PIET\n Block: D\n Room No: 333\n");
		ece_event_selection2();
	}
	void ece_venue_detail4() {
		System.out.println("Nano Size Satelite:- \n Future of satelites.\n success of developing this tech. \n bla bla bla bla");
		System.out.println("Venue details:- \n College: PIES\n Block: A\n Room No: 121\n");
		ece_event_selection2();
	}
	void ece_venue_detail5() {
		System.out.println("Data Science:- \n Combining statastical knowledge with programming code.\n bla bla bla bla");
		System.out.println("Venue details:- \n College: PIT\n Block: A\n Room No: 311\n");
		ece_event_selection3();
	}
	
	void civil_sub_department() {
		System.out.println("Select your sub-department: \n1 Structural Engineering\n2 Environmental Engineering\n3 Go back to department section\n4 Exit");
		Scanner sc = new Scanner(System.in);
		int sub_dp = sc.nextInt();
		switch(sub_dp) {
		case 1:
			civil_event_selection();
			break;
		case 2:
			civil_event_selection2();
			break;
		case 3:
			department();
			break;
		case 4:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void civil_event_selection() {
		System.out.println("Welcome to Structural Engineering.");
		System.out.println("Select the Events: \n1 Seminar on Demolition of buildings\n2 Go Back to Sub-Department\n3 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			civil_venue_detail();
			break;
		case 2:
			civil_sub_department();
			break;
		case 3:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void civil_event_selection2() {
		System.out.println("Welcome to Environmental Engineering.");
		System.out.println("Select the Events: \n1 Seminar on activated carbon adsorbption\n2 Go Back to Sub-Department\n3 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			civil_venue_detail2();
			break;
		case 2:
			civil_sub_department();
			break;
		case 3:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void civil_venue_detail() {
		System.out.println("Demolition of Buildings:- \n Study regarding to demolition\n It's Rules and regulations.");
		System.out.println("Venue details:- \n College: PIET\n Block: C\n Room No: 245\n");
		civil_event_selection();
	}
	void civil_venue_detail2() {
		System.out.println("Activated Carbon adsorbption:- \n how to increase activated Carbon adsorbption\n bla bla bla bla bla.");
		System.out.println("Venue details:- \n College: PIT\n Block: B\n Room No: 159\n");
		civil_event_selection();
	}
	
	void mech_sub_department() {
		System.out.println("Select your sub-department: \n1 CAD\n2 Go back to department section\n3 Exit");
		Scanner sc = new Scanner(System.in);
		int sub_dp = sc.nextInt();
		switch(sub_dp) {
		case 1:
			mech_event_selection();
			break;
		case 2:
			department();
			break;
		case 3:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void mech_event_selection() {
		System.out.println("Welcome to Computer Aided Design.");
		System.out.println("Select the Events: \n1 Workshop on AutoCAD\n2 Go Back to Sub-Department\n3 Exit");
		Scanner sc = new Scanner(System.in);
		int event = sc.nextInt();
		switch (event) {
		case 1:
			mech_venue_detail();
			break;
		case 2:
			mech_sub_department();
			break;
		case 3:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc.close();
	}
	
	void mech_venue_detail() {
		System.out.println("AutoCAD:- \n How to perform AutoCAD.\n It's Benifits over normal CAD.");
		System.out.println("Venue details:- \n College: PIET\n Block: D\n Room No: 345\n");
		mech_event_selection();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.college();
	}
}


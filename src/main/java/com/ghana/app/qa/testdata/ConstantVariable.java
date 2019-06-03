package com.ghana.app.qa.testdata;

public class ConstantVariable {

	// Os Static variable

	// Login To Consulate Side
	public static String username;
	public static String password;

	// Consulate Side
	public static String applicationID = "";
	public static boolean unselectedBoxDoc;
	public static boolean selectedBoxDocAll;
	public static boolean selectedCheckBoxOnDocSingle;

	// Buckets title
	public static String newApplication = "";
	public static String getTextFromApproveButtonFromCN = "";
	public static String getTextFromRejectButtonFromCN = "";
	public static String getTextFromFlagButtonFromCN = "";
	public static String getTextFromApproveFromHCD = "";
	public static String getTextFromRejectButtonFromHCD= "";
	public static String getTextFromFlagButtonFromHCD = "";

	// SignUp page
	public static boolean selectedBoxOnSignUp;
	public static boolean selectedRadioButtonOnSignUp;


	public static boolean genderRadioButton;

	//TestData
	public static String passPortType = "Special"; // Ordinary, Official,Diplomatic, Service,Special
													
	//TestData
	public static int totalPassportTypeInReq=5;
	public static int totalCountryListInReq=250;
	public static int totalPortArrivalInReq=2;
	public static int totalVisaTypeExpecteed=7;
	public static int totalVisaLocationExpected=3;
	public static String nationalityName = "India"; // India,
	public static String portOfArrival = "Kotoka Accra Airport";

	//public   String[] expecPassportType = {"Diplomatic", "Offical", "Ordinary", "Service", "Special"};
	
	// Personal info

	// **Review Application page **Single entry(3 months) visa INR.8500.0

	// Personal info
	public static String visaFees = "transit visa fees1 INR.2000.0";
	// (Single entry(3 months) visa Rs.8500.0, Multiple entry(6 months) visa
	// Rs.17000.0, Multiple entry(12 months) visa Rs.25500.0, Transit (single)
	// visa Rs.4200.0, Transit (multiple) visa Rs.6500.0)
	public static String VisaLocations = "Mumbai";// (New Delhi, Mumbai,
													// Kolkata, )
	public static String selectFormerNationlity = "None";

	public static String firstName = "Rahul";
	public static String middleName = "Vinod";
	public static String lastName = "Patil";
	public static String birthDate = "22102009";

	public static String birthPlace = "Sangamner";
	public static String passportNumber = "A12345BA00";
	public static String passportIssuedDate = "29102018";
	public static String passportExpiryDate = "29102020";
	public static String selectAddressType = "Permanent Address"; // Present
																	// Address

	// Address Info

	public static String FlatNo = "Flat No. 302 Lambodhar Classic";
	public static String StreetName = "Serene Medows, Gangapur Raod";
	public static String Landmark = "Near Media House.";
	public static String pinCode = "444015";
	public static String cityName = "Nashik";
	public static String stateName = "Maharashtra";
	public static String countryName = "India";
	public static String addressType = "Present Address";

	// public static String nationality= "India";
	public static String formerNationality = "India";
	public static String emailId = "arjunthawkar84@gmail.com";

	public static String phoneNumber = "9503152126";

	public static String month = "Dec (12)";
	public static String year = "2020";

	// Emergency contact
	public static String emerContactName = "Sachin";
	public static String emerContactSurname = "Paratha";
	public static String selectRelationship = "Mother";
	public static String emerPhoneNumber = "9552619866";
	public static String profession = "Engineer";
	public static String employer = "infosys";
	public static String employerAddress = "B wing Complex It park, hinjewadi phage 1";
	public static String emerAddress = "";
	public static String emerPincode = "440012";
	public static String emerCityName = "Pune";
	public static String emerState = "Maharashtra";
	public static String emerCountry = "India";
	public static String emerEmployerPhoneNumber = "9856231254";

	// Travel Info
	public static String dateOfDeparture = "08112019";
	public static String ticketNumber = "AF123652";
	public static String roundTicket = "Yes"; // No
	public static String travellingBy = "Air"; // Air, Ship, Road, Train
	public static String JourneyPurpose = "Visit Family"; // Medical, Education,
															// Business,
															// Tourism.
	public static String reachBy = "";

	// Primary Reference
	public static String priFirstName = "Kojo";
	public static String priLastName = "Amankwah";
	public static String primaryAddress = "8 John Wall Way, Ashaiman";
	public static String primaryPinCode = "GA017";
	public static String primaryCity = "Sekondi-Takoradi";
	public static String primaryState = "Brong-Aha[5]fo";
	public static String primaryCountry = "Ghana";
	public static String primaryRefrencePhoneNo = "2332422233";

	// Secondary Reference
	public static String secFirstName = "Ebo";
	public static String secLastName = "Afriyie";
	public static String secondaryAddress = "77436 Fairview Trail, Sekondi-Takoradi";
	public static String secondaryPinCode = "GA015";
	public static String secondaryCity = "Kumasi";
	public static String secondaryState = "Ashanti[4]";
	public static String secondaryCountry = "Ghana";
	public static String secondaryRefrencePhoneNo = "2332422235";
	
	// Consulate variables.
	public static String NEWApplicationCount = "";
	public static String REJApplicationCount = "";
	public static String APPApplicationCount = "";
	public static String HCGApplicationCount = "";
	public static String FLAGApplicationCount = "";
	public static String INTERApplicationCount = "";
	
	// High Commission variables
	public static String mumbaiConsualetApplicationCount = "";
	public static String HCDREJApplicationCount = "";
	public static String HCDAPPApplicationCount = "";
	public static String HCDFLAGApplicationCount = "";
	public static String HCDINTERApplicationCount = "";

}

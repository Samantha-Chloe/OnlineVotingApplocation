package onlinevoterregistrationapp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class OnlineVoterRegistration {

	public static List<VoterApplicant> voters = new ArrayList<>();
	
	public static List<Candidates> candidates = new ArrayList<>();
	
	public static List<VoterForm> voterForm = new ArrayList<>();
	
	public static Scanner sc = new Scanner(System.in);
	
	public static Scanner s1 = new Scanner(System.in);
	
	public static Scanner s2 = new Scanner(System.in);
	
	public static Scanner s3 = new Scanner(System.in);
	
	public static Scanner s4 = new Scanner(System.in);
	
	public static Scanner s5 = new Scanner(System.in);
	
	public static String voterID, candidate_ID;
	
	public static String choose , voter_Pres, voter_Vpres, voter_Secretary;
	
	public static boolean status = true;
	
	public static void main(String[] args) {
	
		OnlineVoterRegistration voter = new OnlineVoterRegistration();
		
		voter.voterOutput();
	
	}
	private void add_voterRegistration(VoterApplicant voter) {
		System.out.println("Voter has been registered.");
		voters.add(voter);
	}
	private void add_CandidateList(Candidates candidate) {
		System.out.println("Candidates has been added.");
		candidates.add(candidate);
	}
	private void add_VoterForm(VoterForm voterForms) {
		System.out.println("Voter's has been successfully saved!");
		voterForm.add(voterForms);
	}
	private VoterApplicant voterRegistration() {
		System.out.println("Enter Voter ID: ");
		voterID = sc.next();
		System.out.println("Enter Last Name: ");
		String Last_Name = sc.next();
		System.out.println("Enter First Name: ");
		String First_Name = s1.next();
		System.out.println("Enter Middle Name: ");
		String Middle_Name = sc.next();
		System.out.println("Age: ");
                String Age = sc.next();
		System.out.println("Address: ");
		String Full_Address = s2.next();
		System.out.println("City: ");
		String City = s3.next();
                System.out.println("Province: ");
		String Province = sc.next();
                System.out.println("Municipality: ");
		String Municipality = sc.next();
		System.out.println("Zip code: ");
		int Zip_Code = sc.nextInt();
		System.out.println("Date of birth: ");
		String Date_of_Birth = s4.next();
		System.out.println("Phone number: ");
		String Phone_Number = s5.next();
		
		
		VoterApplicant voter = new VoterApplicant(voterID, Last_Name, First_Name, Middle_Name, Age, Full_Address, City, Province, Municipality, Zip_Code, Date_of_Birth, Phone_Number);
		return voter;
	}//candidateList
	private Candidates candidatesList() {
		System.out.println("Candidate Number: ");
		candidate_ID = sc.next();
		System.out.println("Candidate Name: ");
		String candidate_Name = sc.next();
		System.out.println("Candidate Partylist: ");
		String candidate_Partylist = sc.next();
		System.out.println("Candidate Position: ");
		System.out.println("*******************************");
		System.out.println("\t[A] - President");
		System.out.println("\t[B] - Vice-President");
		System.out.println("\t[C] - Secretary");
		System.out.println("*******************************");
		String candidate_Position = sc.next();
		
		switch(candidate_Position) {
		case "a":
		case "A":
			// none code to proceed admin_board
			candidate_Position = "President";
			break;
		case "b":
		case "B":
			// none code to proceed admin_board
			candidate_Position = "Vice-President";
			break;
		case "c":
		case "C":
			// none code to proceed admin_board
			candidate_Position = "Secretary";
			break;
		}
		
		Candidates candidate = new Candidates(candidate_ID, candidate_Name, candidate_Partylist, candidate_Position);
		return candidate;
	}
        //VoterForm
	private VoterForm VoteForm() {
		System.out.println("Enter your voter ID: ");
		String voter_ID = sc.next();
		if(voter_ID == voterID) {
			
		}else {
			System.out.println("Voter ID is not been exist or found!");
		}
             
		System.out.println("Enter Pres. Name: ");
		voter_Pres = sc.next();
		System.out.println("Enter V-Pres. Name: ");
		voter_Vpres = sc.next();
		System.out.println("Enter Sec. Name: ");
		voter_Secretary = sc.next();
		
		VoterForm voterForm = new VoterForm(voter_ID, voter_Pres, voter_Vpres, voter_Secretary);
		return voterForm;
	}
	private void ShowVoterApplicant() {
		System.out.println("**********************************************");
		System.out.println("\t\tVOTERS REGISTERED");
		System.out.println("Voter ID: \t\t * \tVoter Name:");
		System.out.println("**********************************************");
		for(VoterApplicant voter : voters) {
			System.out.println(voter.getVoterID() + "\t\t\t\t" + voter.getFirstname());
		}
	}
	private void ShowCandidates() {
		System.out.println("*******************************************************************************************************************");
		System.out.println("\t\tCANDIDATES LIST");
		System.out.println("Candidate #: \t*\tCandidate Name: \t*\tCandidate Position: \t*\tCandidate Part-List:");
		System.out.println("*******************************************************************************************************************");
		for(Candidates candidate : candidates) {
			System.out.println(candidate.getCandidateNumber() + "\t\t\t\t" + candidate.getCandidateName() + "\t\t\t\t" + candidate.getCandidatePosition() + "\t\t\t" + candidate.getCandidatePartlist());
			System.out.println("*******************************************************************************************************************");
		}
	}
	private void ShowVoterForm() {
		System.out.println("************************************************************************************************************************");
		System.out.println("\t\tCANDIDATES LIST");
		System.out.println("Voter ID: \t*\tCandidate Name: \t*\tCandidate Position: \t*\tCandidate Part-List:");
		System.out.println("************************************************************************************************************************");
		for(VoterForm voterForms : voterForm) {
			System.out.println(voterForms.getVoterId() + "\t" + voterForms.getVoterPres() + "\t" + voterForms.getVicePres() + "\t" + voterForms.getVoterSec());
		}
	}
	private void RemoveVoterApplicant() {
		System.out.println("Enter voter ID to remove: ");
		voterID = sc.next();
		
		for(VoterApplicant voter : voters) {
			try {
				if(voter.getVoterID() == voterID) {
					voters.remove(voter);
					System.out.println("Voters Applicant has been successfully removed!");
				}
			}catch(Exception e)
			{
				System.out.println("Wrong input");
			}
		}
	}
	private void RemoveCandidates() {
		System.out.println("Enter candidates ID to remove: ");
		candidate_ID = sc.next();
		
		for(Candidates candidate : candidates) {
			try {
				if(candidate.getCandidateNumber() == candidate_ID) {
					candidates.remove(candidate);
					System.out.println("Voters Applicant has been successfully removed!");
				}
			}catch(Exception e)
			{
				System.out.println("Wrong input");
			}
		}
	}
	private void voterOutput() {
		status = true;
		while(status) {
			System.out.println();
			System.out.println("*****************************************");
			System.out.println("  WELCOME TO ONLINE VOTING APPLICATION");
			System.out.println("*****************************************");
			System.out.println("\t\t[A] - Admin");
			System.out.println("\t\t[B] - Voter");
			System.out.println("*****************************************");
			System.out.print("Login as? ");
			choose = sc.next();
			
			switch(choose) {
			case "a":
			case "A":
				Admin_board();
				status = true;
				break;
			case "b":
			case "B":
				Voter_board();
				status = true;
				break;
				default:
					System.out.println();
					System.out.println("Wrong keyword please try again!");
					status = true;
					break;
			}
		}
	}
	private void Admin_board() {
		status = true;
		while(status) {
			System.out.println();
			System.out.println();
			System.out.println("******************************************");
			System.out.println("\t\tLIST OF VOTERS");
			System.out.println("******************************************");
			System.out.println("  [A] - Add Candidates");
			System.out.println("  [B] - Add Voter");
			System.out.println("  [C] - View Voters");
			System.out.println("  [D] - View Candidates");
			System.out.println("  [E] - Delete Voters");
			System.out.println("  [F] - Delete Candidates");
			System.out.println("  [G] - Show Voters Form");
			System.out.println("  [H] - Back");
			System.out.println("*******************************************");
			System.out.print("Select operation: ");
			choose = sc.next();
			
			switch(choose) {
			case "a":
			case "A":
				add_CandidateList(candidatesList());
				status = true;
				break;
			case "b":
			case "B":
				add_voterRegistration(voterRegistration());
				status = true;
				break;
			case "c":
			case "C":
				ShowVoterApplicant();
				status = true;
				break;
			case "d":
			case "D":
				ShowCandidates();
				status = true;
				break;
			case "e":
			case "E":
				RemoveVoterApplicant();
				status = false;
				break;
			case "f":
			case "F":
				RemoveCandidates();
				status = false;
				break;
			case "g":
			case "G":
				ShowVoterForm();
				status = false;
				break;
			case "h":
			case "H":
				voterOutput();
				status = true;
				break;
			}
		}
	}
	private void Voter_board() {
		System.out.println("**********************************************");
		System.out.println("WELCOME TO ONLINE VOTING APPLICATION");
		System.out.println("**********************************************");
		System.out.println("  [A] - VOTE NOW");
		System.out.println("  [B] - Back");
		System.out.println("**********************************************");
		System.out.print("Select operation: ");
		choose = sc.next();
		
		switch(choose) {
		case "a":
		case "A":
			add_VoterForm(VoteForm());
			break;
		case "b":
		case "B":
			voterOutput();
			break;
		}
	}
}

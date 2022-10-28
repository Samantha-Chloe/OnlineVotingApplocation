package onlinevoterregistrationapp;
public class Candidates {
	private String candidateName, candidatePartylist, candidatePosition;
	private String candidateNumber;
	Candidates(String candidateNumber, String candidateName, String candidatePartylist, String candidatePosition){
		this.candidateNumber = candidateNumber;
		this.candidateName = candidateName;
		this.candidatePartylist = candidatePartylist;
		this.candidatePosition = candidatePosition;
	}
	public String getCandidateNumber() {
		return this.candidateNumber;
	}
	public void setCandidateNumber(String candidateNumber) {
		this.candidateNumber = candidateNumber;
	}
	public String getCandidateName() {
		return this.candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidatePartlist() {
		return this.candidatePartylist;
	}
	public void setCandidatePartylist(String candidatePartylist) {
		this.candidatePartylist = candidatePartylist;
	}
	public String getCandidatePosition() {
		return this.candidatePosition;
	}
	public void setCandidatePosition(String candidatePosition) {
		this.candidatePosition = candidatePosition;
	}
}
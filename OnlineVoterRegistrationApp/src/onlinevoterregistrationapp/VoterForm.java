package onlinevoterregistrationapp;
public class VoterForm {
	private String voterID;
	private String voterPres, voterVpres, voterSec;
	VoterForm(String voterID, String voterPres, String voterVpres, String voterSec){
		this.voterID = voterID;
		this.voterPres = voterPres;
		this.voterVpres = voterVpres;
		this.voterSec = voterSec;
	}
	public String getVoterId() {
		return this.voterID;
	}
	public void setVoterId(String voterID) {
		this.voterID = voterID;
	}
	public String getVoterPres() {
		return this.voterPres;
	}
	public void setVoterPres(String voterPres) {
		this.voterPres = voterPres;
	}
	public String getVicePres() {
		return this.voterVpres;
	}
	public void setVicePres(String voterVpres) {
		this.voterVpres = voterVpres;
	}
	public String getVoterSec() {
		return this.voterSec;
	}
	public void setVoterSec(String voterSec) {
		this.voterSec = voterSec;
	}
}

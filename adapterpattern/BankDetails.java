package br.com.adapterpattern;

public class BankDetails {
	
	private String bankName;
	private String accHolderName;
	private long accNumber;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccHolder() {
		return accHolderName;
	}
	public void setAccHolder(String accHolder) {
		this.accHolderName = accHolder;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	


}

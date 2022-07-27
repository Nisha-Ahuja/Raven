package com.xclaymation.Raven.entities;

public class Certificate {
	
	private String certificateTitle;
	private String certificateImageUrl;
	private String certificateShortDiscription;
	
	public String getCertificateTitle() {
		return certificateTitle;
	}
	public void setCertificateTitle(String certificateTitle) {
		this.certificateTitle = certificateTitle;
	}
	public String getCertificateImageUrl() {
		return certificateImageUrl;
	}
	public void setCertificateImageUrl(String certificateImageUrl) {
		this.certificateImageUrl = certificateImageUrl;
	}
	public String getCertificateShortDiscription() {
		return certificateShortDiscription;
	}
	public void setCertificateShortDiscription(String certificateShortDiscription) {
		this.certificateShortDiscription = certificateShortDiscription;
	}
	
	public Certificate(String certificateTitle, String certificateImageUrl, String certificateShortDiscription) {
		super();
		this.certificateTitle = certificateTitle;
		this.certificateImageUrl = certificateImageUrl;
		this.certificateShortDiscription = certificateShortDiscription;
	}
	
	public Certificate()
	{
		
	}
	
	
	
	
	
	

}

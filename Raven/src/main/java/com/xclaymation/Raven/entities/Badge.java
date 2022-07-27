package com.xclaymation.Raven.entities;

public class Badge {
	private String BadgesTitle;
	private String BadgesImageUrl;
	private String BadgeShortDiscription;
	
	public String getBadgesTitle() {
		return BadgesTitle;
	}
	public void setBadgesTitle(String badgesTitle) {
		BadgesTitle = badgesTitle;
	}
	public String getBadgesImageUrl() {
		return BadgesImageUrl;
	}
	public void setBadgesImageUrl(String badgesImageUrl) {
		BadgesImageUrl = badgesImageUrl;
	}
	public String getBadgeShortDiscription() {
		return BadgeShortDiscription;
	}
	public void setBadgeShortDiscription(String badgeShortDiscription) {
		this.BadgeShortDiscription = badgeShortDiscription;
	}
	public Badge(String badgesTitle, String badgesImageUrl, String badgeShortDiscription) {
		super();
		BadgesTitle = badgesTitle;
		BadgesImageUrl = badgesImageUrl;
		BadgeShortDiscription = badgeShortDiscription;
	}
	
	public Badge()
	{
		
	}

}

package com.ff.fantasyfootball;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"NewsID",
"Source",
"Updated",
"TimeAgo",
"Title",
"Content",
"Url",
"TermsOfUse",
"Author",
"Categories",
"PlayerID",
"TeamID",
"Team",
"PlayerID2",
"TeamID2",
"Team2"
})
public class News {

@JsonProperty("NewsID")
private Integer newsID;
@JsonProperty("Source")
private String source;
@JsonProperty("Updated")
private String updated;
@JsonProperty("TimeAgo")
private String timeAgo;
@JsonProperty("Title")
private String title;
@JsonProperty("Content")
private String content;
@JsonProperty("Url")
private String url;
@JsonProperty("TermsOfUse")
private String termsOfUse;
@JsonProperty("Author")
private String author;
@JsonProperty("Categories")
private String categories;
@JsonProperty("PlayerID")
private Object playerID;
@JsonProperty("TeamID")
private Object teamID;
@JsonProperty("Team")
private Object team;
@JsonProperty("PlayerID2")
private Object playerID2;
@JsonProperty("TeamID2")
private Object teamID2;
@JsonProperty("Team2")
private Object team2;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("NewsID")
public Integer getNewsID() {
return newsID;
}

@JsonProperty("NewsID")
public void setNewsID(Integer newsID) {
this.newsID = newsID;
}

@JsonProperty("Source")
public String getSource() {
return source;
}

@JsonProperty("Source")
public void setSource(String source) {
this.source = source;
}

@JsonProperty("Updated")
public String getUpdated() {
return updated;
}

@JsonProperty("Updated")
public void setUpdated(String updated) {
this.updated = updated;
}

@JsonProperty("TimeAgo")
public String getTimeAgo() {
return timeAgo;
}

@JsonProperty("TimeAgo")
public void setTimeAgo(String timeAgo) {
this.timeAgo = timeAgo;
}

@JsonProperty("Title")
public String getTitle() {
return title;
}

@JsonProperty("Title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("Content")
public String getContent() {
return content;
}

@JsonProperty("Content")
public void setContent(String content) {
this.content = content;
}

@JsonProperty("Url")
public String getUrl() {
return url;
}

@JsonProperty("Url")
public void setUrl(String url) {
this.url = url;
}

@JsonProperty("TermsOfUse")
public String getTermsOfUse() {
return termsOfUse;
}

@JsonProperty("TermsOfUse")
public void setTermsOfUse(String termsOfUse) {
this.termsOfUse = termsOfUse;
}

@JsonProperty("Author")
public String getAuthor() {
return author;
}

@JsonProperty("Author")
public void setAuthor(String author) {
this.author = author;
}

@JsonProperty("Categories")
public String getCategories() {
return categories;
}

@JsonProperty("Categories")
public void setCategories(String categories) {
this.categories = categories;
}

@JsonProperty("PlayerID")
public Object getPlayerID() {
return playerID;
}

@JsonProperty("PlayerID")
public void setPlayerID(Object playerID) {
this.playerID = playerID;
}

@JsonProperty("TeamID")
public Object getTeamID() {
return teamID;
}

@JsonProperty("TeamID")
public void setTeamID(Object teamID) {
this.teamID = teamID;
}

@JsonProperty("Team")
public Object getTeam() {
return team;
}

@JsonProperty("Team")
public void setTeam(Object team) {
this.team = team;
}

@JsonProperty("PlayerID2")
public Object getPlayerID2() {
return playerID2;
}

@JsonProperty("PlayerID2")
public void setPlayerID2(Object playerID2) {
this.playerID2 = playerID2;
}

@JsonProperty("TeamID2")
public Object getTeamID2() {
return teamID2;
}

@JsonProperty("TeamID2")
public void setTeamID2(Object teamID2) {
this.teamID2 = teamID2;
}

@JsonProperty("Team2")
public Object getTeam2() {
return team2;
}

@JsonProperty("Team2")
public void setTeam2(Object team2) {
this.team2 = team2;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
package testJAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row")
public class Post {
    @XmlAttribute(name = "Id", required = true)
    protected String Id;
    
    @XmlAttribute(name = "PostTypeId", required = true)
    protected String PostTypeId;
    
    @XmlAttribute(name = "Body", required = true)
    protected String Body;
    
    @XmlAttribute(name = "Title", required = true)
    protected String Title;
    
    @XmlAttribute(name = "Tags", required = true)
    protected String Tags;
    
	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getPostTypeId() {
		return PostTypeId;
	}

	public void setPostTypeId(String postTypeId) {
		PostTypeId = postTypeId;
	}

	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getTags() {
		return Tags;
	}

	public void setTags(String tags) {
		Tags = tags;
	}
}
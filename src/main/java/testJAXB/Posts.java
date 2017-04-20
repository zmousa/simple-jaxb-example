package testJAXB;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "posts")
public class Posts {
	@XmlElement(name = "row")
    protected List<XPost> posts;

	public List<XPost> getPosts() {
		return posts;
	}

	public void setPosts(List<XPost> posts) {
		this.posts = posts;
	}
 
}
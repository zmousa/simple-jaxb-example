package testJAXB;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Main {
	public static void main(String[] args) throws JAXBException {
		Posts posts = new Posts();
		
		posts.setPosts(new ArrayList<Post>());
	    
		Post post1 = new Post();
	    post1.setId("1");
	    post1.setPostTypeId("2");
	    post1.setBody("body1");
	    post1.setTitle("title1");
	     
	    Post post2 = new Post();
	    post2.setId("2");
	    post2.setPostTypeId("3");
	    post2.setBody("body2");
	    post2.setTitle("title2");
	     
	    posts.getPosts().add(post1);
	    posts.getPosts().add(post2);
	    
	    marshalingPosts(posts);
	    unMarshalingPosts();
	}
	
	private static void marshalingPosts(Posts posts) throws JAXBException
	{
	    JAXBContext jaxbContext = JAXBContext.newInstance(Posts.class);
	    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	     
	    jaxbMarshaller.marshal(posts, System.out);
	     
	    jaxbMarshaller.marshal(posts, new File("/tmp/posts.xml"));
	}
	
	private static void unMarshalingPosts() throws JAXBException 
	{
	    JAXBContext jaxbContext = JAXBContext.newInstance(Posts.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	     
	    Posts posts = (Posts) jaxbUnmarshaller.unmarshal( new File("/tmp/posts.xml") );
	     
	    for(XPost post : posts.getPosts())
	    {
	        System.out.println(post.getId());
	        System.out.println(post.getTitle());
	    }
	}
}

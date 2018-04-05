
import java.net.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

// DOM 
public class readXml {

	public static void main(String[] args) {
		try {
			String urlString="https://en.wikipedia.org/w/api.php?format=xml&action=opensearch&search=linux";
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(conn.getInputStream());
			System.out.println(doc.getDoctype());

		}catch(Exception e){
		}
	}

}

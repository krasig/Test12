package delme2.clientsample;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import delme2.*;

public class ClientSample {

	public static void main(String[] args) {
	        
				System.out.println("***********************");
				System.out.println("Create Web Service Client...");
				WSSystemDataService service1 = new WSSystemDataService();
				System.out.println("Create Web Service...");
				WSSystemData port1 = service1.getWsWSSystemDataPort();
				System.out.println("Call Web Service Operation...");
//				System.out.println("Server said: " + port1.getMainAisId());
//				System.out.println("Server said: " + port1.getFullClassif(null,null));
//				//Please input the parameters instead of 'null' for the upper method!

				System.out.println("Server said: " + port1.version());
//				System.out.println("Server said: " + port1.getFullList(null));
//				//Please input the parameters instead of 'null' for the upper method!
//
//				System.out.println("Server said: " + port1.getOpisClassif(null));
//				//Please input the parameters instead of 'null' for the upper method!
//
//				System.out.println("Server said: " + port1.getModelData(null,null,null));
//				//Please input the parameters instead of 'null' for the upper method!
//
//				System.out.println("Server said: " + port1.getOpisList(null));
				//Please input the parameters instead of 'null' for the upper method!

				

				System.out.println("***********************");
				System.out.println("Call Over!");
				
				
				
				try {
					URL url = new URL("http://10.29.1.165:8080/CAdmin/WSSystemDataService?wsdl");
					QName qname = new QName("http://ssp.indexbg.bg/", "WSSystemDataService");
//				http://wsmf.delo.indexbg.com
					Service service = Service.create(url, qname);

					// Hello helloPort = service.getHelloPort();
					WSSystemData sPort = (WSSystemData) service
							.getPort(WSSystemData.class);
					
					System.out.println(sPort.version());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
}

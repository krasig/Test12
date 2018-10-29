package delme.clientsample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.AddressingFeature;

import indexbg.pdoi.wsclient.admreg.ArrayOfBatchIdentificationInfoType;
import indexbg.pdoi.wsclient.admreg.BatchIdentificationInfoType;
import indexbg.pdoi.wsclient.admreg.IBatchInfoService;
public class MySample {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://iisda.government.bg/Services/RAS/RAS.Integration.Host/BatchInfoService.svc?singleWsdl");
			QName qname = new QName("http://iisda.government.bg/RAS/IntegrationServices", "BatchInfoService");
//		http://wsmf.delo.indexbg.com
			Service service = Service.create(url, qname);

			// Hello helloPort = service.getHelloPort();
			IBatchInfoService sPort = (IBatchInfoService) service
					.getPort(IBatchInfoService.class,new AddressingFeature(true, true));
			
			ArrayOfBatchIdentificationInfoType searchBatchesIdentificationInfo = sPort.searchBatchesIdentificationInfo(null, null, null, null, null, toXMLGregorianCalendar(new Date()), null);
			@SuppressWarnings("unused")
			int a=0;
			
			List<BatchIdentificationInfoType> organizations = searchBatchesIdentificationInfo.getBatchIdentificationInfoType();
			int counter=1;
			for (BatchIdentificationInfoType org : organizations) {
				System.out.println(counter++ +" -- "+org.getIdentificationNumber()+" ("+org.getStatus().name() +") - "+org.getName());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		SearchBatchesIdentificationInfo(
//				null,
//				null,
//				null,
//				null,
//				null,
//				toXMLGregorianCalendarNoTime(new Date()),
//				null);
	}

	
public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
		
		if (date == null){
			return null;
		}
		
		
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = null;

		try {

			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);

		} catch (DatatypeConfigurationException e) {
			System.out.println("Грешка при преобразуване  java.util.Date to javax.xml.datatype.XMLGregorianCalendar");
			return null;

		}

		return xmlCalendar;

	}
public static XMLGregorianCalendar toXMLGregorianCalendarNoTime(Date date) {
	GregorianCalendar gCalendar = new GregorianCalendar();
	gCalendar.setTime(date);
	int g = gCalendar.get(GregorianCalendar.YEAR);
	int m = gCalendar.get(GregorianCalendar.MONTH);
	int d = gCalendar.get(GregorianCalendar.DAY_OF_MONTH);
	gCalendar.set(g, m, d);
	XMLGregorianCalendar xmlCalendar = null;

	try {
		xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar();
		xmlCalendar.setYear(g);
		xmlCalendar.setMonth(m + 1);
		xmlCalendar.setDay(d);
		xmlCalendar.setHour(0);
		xmlCalendar.setMinute(0);
		xmlCalendar.setSecond(0);
		xmlCalendar.setMillisecond(0);

	} catch (DatatypeConfigurationException e) {
		
		return null;
	}

	return xmlCalendar;
	
}
}

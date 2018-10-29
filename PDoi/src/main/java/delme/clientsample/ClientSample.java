package delme.clientsample;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.AddressingFeature;
//import javax.wsdl.Binding;
import javax.xml.ws.*;
import javax.xml.ws.handler.*;
import org.apache.cxf.ws.rm.feature.RMFeature;
import org.apache.cxf.ws.rm.manager.AcksPolicyType;
import org.apache.cxf.ws.rm.manager.DestinationPolicyType;
import org.apache.cxf.ws.rmp.v200502.RMAssertion;
import org.apache.cxf.ws.rmp.v200502.RMAssertion.AcknowledgementInterval;

import delme.*;
import indexbg.pdoi.wsclient.admreg.BatchInfoService;
import indexbg.pdoi.wsclient.admreg.IBatchInfoService;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        BatchInfoService service1 = new BatchInfoService();
	        System.out.println("Create Web Service...");
	        
	        
	        RMFeature feature = new RMFeature();
	        RMAssertion rma = new RMAssertion();
	        RMAssertion.BaseRetransmissionInterval bri = new RMAssertion.BaseRetransmissionInterval();
	        bri.setMilliseconds(4000L);
	        rma.setBaseRetransmissionInterval(bri);
	        AcknowledgementInterval ai = new AcknowledgementInterval();
	        ai.setMilliseconds(2000L);
	        rma.setAcknowledgementInterval(ai);
	        feature.setRMAssertion(rma);
	        DestinationPolicyType dp = new DestinationPolicyType();
	        AcksPolicyType ap = new AcksPolicyType();
	        ap.setIntraMessageThreshold(0);
	        dp.setAcksPolicy(ap);
	        feature.setDestinationPolicy(dp);
	        
	        
	        
	        
	        
	        
	        
	        /////////////////////
	        IBatchInfoService port1 = service1.getWSHttpBindingIBatchInfoService();
	        
	        	        BindingProvider bindingProvider = (BindingProvider) port1;      
	        final Binding binding = bindingProvider.getBinding();

	        List<Handler> handlerList = binding.getHandlerChain();
	        if (handlerList == null)
	            handlerList = new ArrayList<Handler>();

	        handlerList.add(new ActionHandler());

	        binding.setHandlerChain(handlerList);
	        
	        
//	        System.out.println("Call Web Service Operation...");
//	        System.out.println("Server said: " + port1.getBatchDetailedInfo(null,null,null));
//	        //Please input the parameters instead of 'null' for the upper method!
//	
//	        System.out.println("Server said: " + port1.searchBatchVersions(null,null,null));
//	        //Please input the parameters instead of 'null' for the upper method!
//	
//	        System.out.println("Server said: " + port1.getTerritorialAdmStructure(null));
//	        //Please input the parameters instead of 'null' for the upper method!
//	
	        System.out.println("Server said: " + port1.searchBatchesIdentificationInfo(null,null,null,null,null,toXMLGregorianCalendarNoTime(new Date()),null));
//	        //Please input the parameters instead of 'null' for the upper method!
//	
//	        System.out.println("Create Web Service...");
//	       
//	        IBatchInfoService port2 = service1.getWSHttpBindingIBatchInfoService(feature);
//	        System.out.println("Call Web Service Operation...");
//	        System.out.println("Server said: " + port2.getBatchDetailedInfo(null,null,null));
//	        //Please input the parameters instead of 'null' for the upper method!
//	
//	        System.out.println("Server said: " + port2.searchBatchVersions(null,null,null));
//	        //Please input the parameters instead new AddressingFeature() of 'null' for the upper method!
//	
//	        System.out.println("Server said: " + port2.getTerritorialAdmStructure(null));
//	        //Please input the parameters instead of 'null' for the upper method!
//	
//	        System.out.println("Server said: " + port2.searchBatchesIdentificationInfo(null,null,null,null,null,null,null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
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

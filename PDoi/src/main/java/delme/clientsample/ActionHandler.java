package delme.clientsample;

import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class ActionHandler implements SOAPHandler<SOAPMessageContext> 
{   
    @Override
    public boolean handleMessage(SOAPMessageContext context) 
    {
        // Auto-generated method stub
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) 
    {
        // Auto-generated method stub
        return false;
    }

    @Override
    public void close(MessageContext context) 
    {
        // Auto-generated method stub
    }

    @Override
    public Set<QName> getHeaders() 
    {
        Set<QName> set = new HashSet<QName>();
        // Make sure the '[{http://www.w3.org/2005/08/addressing}]Action' header 
        // is handled in case the device set the 'MustUnderstand' attribute to '1'
        set.add(new QName("http://www.w3.org/2005/08/addressing", "Action"));
        return set;
    }   
}
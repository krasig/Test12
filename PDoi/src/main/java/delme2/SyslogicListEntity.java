
package delme2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for syslogicListEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syslogicListEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ssp.indexbg.bg/}trackableEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeClassifPod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codeClassifVod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codeList" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codePod" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codeVod" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dateDo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateOt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syslogicListEntity", propOrder = {
    "codeClassifPod",
    "codeClassifVod",
    "codeList",
    "codePod",
    "codeVod",
    "dateDo",
    "dateOt",
    "id"
})
public class SyslogicListEntity
    extends TrackableEntity
{

    protected Long codeClassifPod;
    protected Long codeClassifVod;
    protected long codeList;
    protected long codePod;
    protected long codeVod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOt;
    protected Long id;

    /**
     * Gets the value of the codeClassifPod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeClassifPod() {
        return codeClassifPod;
    }

    /**
     * Sets the value of the codeClassifPod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeClassifPod(Long value) {
        this.codeClassifPod = value;
    }

    /**
     * Gets the value of the codeClassifVod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeClassifVod() {
        return codeClassifVod;
    }

    /**
     * Sets the value of the codeClassifVod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeClassifVod(Long value) {
        this.codeClassifVod = value;
    }

    /**
     * Gets the value of the codeList property.
     * 
     */
    public long getCodeList() {
        return codeList;
    }

    /**
     * Sets the value of the codeList property.
     * 
     */
    public void setCodeList(long value) {
        this.codeList = value;
    }

    /**
     * Gets the value of the codePod property.
     * 
     */
    public long getCodePod() {
        return codePod;
    }

    /**
     * Sets the value of the codePod property.
     * 
     */
    public void setCodePod(long value) {
        this.codePod = value;
    }

    /**
     * Gets the value of the codeVod property.
     * 
     */
    public long getCodeVod() {
        return codeVod;
    }

    /**
     * Sets the value of the codeVod property.
     * 
     */
    public void setCodeVod(long value) {
        this.codeVod = value;
    }

    /**
     * Gets the value of the dateDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDo() {
        return dateDo;
    }

    /**
     * Sets the value of the dateDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDo(XMLGregorianCalendar value) {
        this.dateDo = value;
    }

    /**
     * Gets the value of the dateOt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOt() {
        return dateOt;
    }

    /**
     * Sets the value of the dateOt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOt(XMLGregorianCalendar value) {
        this.dateOt = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}

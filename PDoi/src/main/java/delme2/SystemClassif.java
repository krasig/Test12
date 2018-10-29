
package delme2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for systemClassif complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemClassif"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ssp.indexbg.bg/}multilangEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codeClassif" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codeExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeParent" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codePrev" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dateDo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateOt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dopInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="levelNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="noDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pored" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemClassif", propOrder = {
    "code",
    "codeClassif",
    "codeExt",
    "codeParent",
    "codePrev",
    "dateDo",
    "dateOt",
    "dopInfo",
    "id",
    "levelNumber",
    "noDelete",
    "pored"
})
public class SystemClassif
    extends MultilangEntity
{

    protected long code;
    protected long codeClassif;
    protected String codeExt;
    protected long codeParent;
    protected long codePrev;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOt;
    protected String dopInfo;
    protected Long id;
    protected int levelNumber;
    protected boolean noDelete;
    protected Long pored;

    /**
     * Gets the value of the code property.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeClassif property.
     * 
     */
    public long getCodeClassif() {
        return codeClassif;
    }

    /**
     * Sets the value of the codeClassif property.
     * 
     */
    public void setCodeClassif(long value) {
        this.codeClassif = value;
    }

    /**
     * Gets the value of the codeExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeExt() {
        return codeExt;
    }

    /**
     * Sets the value of the codeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeExt(String value) {
        this.codeExt = value;
    }

    /**
     * Gets the value of the codeParent property.
     * 
     */
    public long getCodeParent() {
        return codeParent;
    }

    /**
     * Sets the value of the codeParent property.
     * 
     */
    public void setCodeParent(long value) {
        this.codeParent = value;
    }

    /**
     * Gets the value of the codePrev property.
     * 
     */
    public long getCodePrev() {
        return codePrev;
    }

    /**
     * Sets the value of the codePrev property.
     * 
     */
    public void setCodePrev(long value) {
        this.codePrev = value;
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
     * Gets the value of the dopInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDopInfo() {
        return dopInfo;
    }

    /**
     * Sets the value of the dopInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDopInfo(String value) {
        this.dopInfo = value;
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

    /**
     * Gets the value of the levelNumber property.
     * 
     */
    public int getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     */
    public void setLevelNumber(int value) {
        this.levelNumber = value;
    }

    /**
     * Gets the value of the noDelete property.
     * 
     */
    public boolean isNoDelete() {
        return noDelete;
    }

    /**
     * Sets the value of the noDelete property.
     * 
     */
    public void setNoDelete(boolean value) {
        this.noDelete = value;
    }

    /**
     * Gets the value of the pored property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPored() {
        return pored;
    }

    /**
     * Sets the value of the pored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPored(Long value) {
        this.pored = value;
    }

}

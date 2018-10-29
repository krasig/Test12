
package delme2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the delme2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFullClassif_QNAME = new QName("http://ssp.indexbg.bg/", "getFullClassif");
    private final static QName _GetFullClassifResponse_QNAME = new QName("http://ssp.indexbg.bg/", "getFullClassifResponse");
    private final static QName _GetFullList_QNAME = new QName("http://ssp.indexbg.bg/", "getFullList");
    private final static QName _GetFullListResponse_QNAME = new QName("http://ssp.indexbg.bg/", "getFullListResponse");
    private final static QName _GetMainAisId_QNAME = new QName("http://ssp.indexbg.bg/", "getMainAisId");
    private final static QName _GetMainAisIdResponse_QNAME = new QName("http://ssp.indexbg.bg/", "getMainAisIdResponse");
    private final static QName _GetModelData_QNAME = new QName("http://ssp.indexbg.bg/", "getModelData");
    private final static QName _GetModelDataResponse_QNAME = new QName("http://ssp.indexbg.bg/", "getModelDataResponse");
    private final static QName _GetOpisClassif_QNAME = new QName("http://ssp.indexbg.bg/", "getOpisClassif");
    private final static QName _GetOpisClassifResponse_QNAME = new QName("http://ssp.indexbg.bg/", "getOpisClassifResponse");
    private final static QName _GetOpisList_QNAME = new QName("http://ssp.indexbg.bg/", "getOpisList");
    private final static QName _GetOpisListResponse_QNAME = new QName("http://ssp.indexbg.bg/", "getOpisListResponse");
    private final static QName _Version_QNAME = new QName("http://ssp.indexbg.bg/", "version");
    private final static QName _VersionResponse_QNAME = new QName("http://ssp.indexbg.bg/", "versionResponse");
    private final static QName _MyServiceFault_QNAME = new QName("http://pnr.indexbg.bg/", "MyServiceFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: delme2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFullClassif }
     * 
     */
    public GetFullClassif createGetFullClassif() {
        return new GetFullClassif();
    }

    /**
     * Create an instance of {@link GetFullClassifResponse }
     * 
     */
    public GetFullClassifResponse createGetFullClassifResponse() {
        return new GetFullClassifResponse();
    }

    /**
     * Create an instance of {@link GetFullList }
     * 
     */
    public GetFullList createGetFullList() {
        return new GetFullList();
    }

    /**
     * Create an instance of {@link GetFullListResponse }
     * 
     */
    public GetFullListResponse createGetFullListResponse() {
        return new GetFullListResponse();
    }

    /**
     * Create an instance of {@link GetMainAisId }
     * 
     */
    public GetMainAisId createGetMainAisId() {
        return new GetMainAisId();
    }

    /**
     * Create an instance of {@link GetMainAisIdResponse }
     * 
     */
    public GetMainAisIdResponse createGetMainAisIdResponse() {
        return new GetMainAisIdResponse();
    }

    /**
     * Create an instance of {@link GetModelData }
     * 
     */
    public GetModelData createGetModelData() {
        return new GetModelData();
    }

    /**
     * Create an instance of {@link GetModelDataResponse }
     * 
     */
    public GetModelDataResponse createGetModelDataResponse() {
        return new GetModelDataResponse();
    }

    /**
     * Create an instance of {@link GetOpisClassif }
     * 
     */
    public GetOpisClassif createGetOpisClassif() {
        return new GetOpisClassif();
    }

    /**
     * Create an instance of {@link GetOpisClassifResponse }
     * 
     */
    public GetOpisClassifResponse createGetOpisClassifResponse() {
        return new GetOpisClassifResponse();
    }

    /**
     * Create an instance of {@link GetOpisList }
     * 
     */
    public GetOpisList createGetOpisList() {
        return new GetOpisList();
    }

    /**
     * Create an instance of {@link GetOpisListResponse }
     * 
     */
    public GetOpisListResponse createGetOpisListResponse() {
        return new GetOpisListResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link VersionResponse }
     * 
     */
    public VersionResponse createVersionResponse() {
        return new VersionResponse();
    }

    /**
     * Create an instance of {@link MyServiceFault }
     * 
     */
    public MyServiceFault createMyServiceFault() {
        return new MyServiceFault();
    }

    /**
     * Create an instance of {@link SystemClassif }
     * 
     */
    public SystemClassif createSystemClassif() {
        return new SystemClassif();
    }

    /**
     * Create an instance of {@link Multilang }
     * 
     */
    public Multilang createMultilang() {
        return new Multilang();
    }

    /**
     * Create an instance of {@link SyslogicListEntity }
     * 
     */
    public SyslogicListEntity createSyslogicListEntity() {
        return new SyslogicListEntity();
    }

    /**
     * Create an instance of {@link SystemClassifOpis }
     * 
     */
    public SystemClassifOpis createSystemClassifOpis() {
        return new SystemClassifOpis();
    }

    /**
     * Create an instance of {@link SyslogicListOpisEntity }
     * 
     */
    public SyslogicListOpisEntity createSyslogicListOpisEntity() {
        return new SyslogicListOpisEntity();
    }

    /**
     * Create an instance of {@link AnyTypeArray }
     * 
     */
    public AnyTypeArray createAnyTypeArray() {
        return new AnyTypeArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullClassif }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFullClassif }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getFullClassif")
    public JAXBElement<GetFullClassif> createGetFullClassif(GetFullClassif value) {
        return new JAXBElement<GetFullClassif>(_GetFullClassif_QNAME, GetFullClassif.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullClassifResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFullClassifResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getFullClassifResponse")
    public JAXBElement<GetFullClassifResponse> createGetFullClassifResponse(GetFullClassifResponse value) {
        return new JAXBElement<GetFullClassifResponse>(_GetFullClassifResponse_QNAME, GetFullClassifResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFullList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getFullList")
    public JAXBElement<GetFullList> createGetFullList(GetFullList value) {
        return new JAXBElement<GetFullList>(_GetFullList_QNAME, GetFullList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFullListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getFullListResponse")
    public JAXBElement<GetFullListResponse> createGetFullListResponse(GetFullListResponse value) {
        return new JAXBElement<GetFullListResponse>(_GetFullListResponse_QNAME, GetFullListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMainAisId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMainAisId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getMainAisId")
    public JAXBElement<GetMainAisId> createGetMainAisId(GetMainAisId value) {
        return new JAXBElement<GetMainAisId>(_GetMainAisId_QNAME, GetMainAisId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMainAisIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMainAisIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getMainAisIdResponse")
    public JAXBElement<GetMainAisIdResponse> createGetMainAisIdResponse(GetMainAisIdResponse value) {
        return new JAXBElement<GetMainAisIdResponse>(_GetMainAisIdResponse_QNAME, GetMainAisIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelData }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getModelData")
    public JAXBElement<GetModelData> createGetModelData(GetModelData value) {
        return new JAXBElement<GetModelData>(_GetModelData_QNAME, GetModelData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelDataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelDataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getModelDataResponse")
    public JAXBElement<GetModelDataResponse> createGetModelDataResponse(GetModelDataResponse value) {
        return new JAXBElement<GetModelDataResponse>(_GetModelDataResponse_QNAME, GetModelDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpisClassif }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOpisClassif }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getOpisClassif")
    public JAXBElement<GetOpisClassif> createGetOpisClassif(GetOpisClassif value) {
        return new JAXBElement<GetOpisClassif>(_GetOpisClassif_QNAME, GetOpisClassif.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpisClassifResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOpisClassifResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getOpisClassifResponse")
    public JAXBElement<GetOpisClassifResponse> createGetOpisClassifResponse(GetOpisClassifResponse value) {
        return new JAXBElement<GetOpisClassifResponse>(_GetOpisClassifResponse_QNAME, GetOpisClassifResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpisList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOpisList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getOpisList")
    public JAXBElement<GetOpisList> createGetOpisList(GetOpisList value) {
        return new JAXBElement<GetOpisList>(_GetOpisList_QNAME, GetOpisList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpisListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOpisListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "getOpisListResponse")
    public JAXBElement<GetOpisListResponse> createGetOpisListResponse(GetOpisListResponse value) {
        return new JAXBElement<GetOpisListResponse>(_GetOpisListResponse_QNAME, GetOpisListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "version")
    public JAXBElement<Version> createVersion(Version value) {
        return new JAXBElement<Version>(_Version_QNAME, Version.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ssp.indexbg.bg/", name = "versionResponse")
    public JAXBElement<VersionResponse> createVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_VersionResponse_QNAME, VersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyServiceFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MyServiceFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://pnr.indexbg.bg/", name = "MyServiceFault")
    public JAXBElement<MyServiceFault> createMyServiceFault(MyServiceFault value) {
        return new JAXBElement<MyServiceFault>(_MyServiceFault_QNAME, MyServiceFault.class, null, value);
    }

}

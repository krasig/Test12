package indexbg.pdoi.wsclient.edelivery;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4-jbossorg-1
 * 2018-08-08T16:25:35.190+03:00
 * Generated source version: 3.2.4-jbossorg-1
 *
 */
@WebService(targetNamespace = "https://edelivery.egov.bg/services/integration", name = "IEDeliveryIntegrationService")
@XmlSeeAlso({ObjectFactory.class})
public interface IEDeliveryIntegrationService {

    @WebMethod(operationName = "GetSentMessageStatus", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessageStatus")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessageStatus", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessageStatusResponse")
    @RequestWrapper(localName = "GetSentMessageStatus", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentMessageStatus")
    @ResponseWrapper(localName = "GetSentMessageStatusResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentMessageStatusResponse")
    @WebResult(name = "GetSentMessageStatusResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.DcMessageDetails getSentMessageStatus(
        @WebParam(name = "messageId", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Integer messageId,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetRegisteredInstitutions", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetRegisteredInstitutions")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetRegisteredInstitutions", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetRegisteredInstitutionsResponse")
    @RequestWrapper(localName = "GetRegisteredInstitutions", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetRegisteredInstitutions")
    @ResponseWrapper(localName = "GetRegisteredInstitutionsResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetRegisteredInstitutionsResponse")
    @WebResult(name = "GetRegisteredInstitutionsResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.ArrayOfDcInstitutionInfo getRegisteredInstitutions();

    @WebMethod(operationName = "GetReceivedMessagesList", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessagesList")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessagesList", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessagesListResponse")
    @RequestWrapper(localName = "GetReceivedMessagesList", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetReceivedMessagesList")
    @ResponseWrapper(localName = "GetReceivedMessagesListResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetReceivedMessagesListResponse")
    @WebResult(name = "GetReceivedMessagesListResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.ArrayOfDcMessage getReceivedMessagesList(
        @WebParam(name = "onlyNew", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Boolean onlyNew,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetSentMessagesList", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessagesList")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessagesList", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessagesListResponse")
    @RequestWrapper(localName = "GetSentMessagesList", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentMessagesList")
    @ResponseWrapper(localName = "GetSentMessagesListResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentMessagesListResponse")
    @WebResult(name = "GetSentMessagesListResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.ArrayOfDcMessage getSentMessagesList(
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "SendMessage", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/SendMessage")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/SendMessage", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/SendMessageResponse")
    @RequestWrapper(localName = "SendMessage", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.SendMessage")
    @ResponseWrapper(localName = "SendMessageResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.SendMessageResponse")
    @WebResult(name = "SendMessageResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public java.lang.Integer sendMessage(
        @WebParam(name = "message", targetNamespace = "https://edelivery.egov.bg/services/integration")
        indexbg.pdoi.wsclient.edelivery.DcMessageDetails message,
        @WebParam(name = "receiverType", targetNamespace = "https://edelivery.egov.bg/services/integration")
        indexbg.pdoi.wsclient.edelivery.EProfileType receiverType,
        @WebParam(name = "receiverUniqueIdentifier", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String receiverUniqueIdentifier,
        @WebParam(name = "receiverPhone", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String receiverPhone,
        @WebParam(name = "receiverEmail", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String receiverEmail,
        @WebParam(name = "serviceOID", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String serviceOID,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "SendElectronicDocument", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/SendElectronicDocument")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/SendElectronicDocument", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/SendElectronicDocumentResponse")
    @RequestWrapper(localName = "SendElectronicDocument", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.SendElectronicDocument")
    @ResponseWrapper(localName = "SendElectronicDocumentResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.SendElectronicDocumentResponse")
    @WebResult(name = "SendElectronicDocumentResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public java.lang.Integer sendElectronicDocument(
        @WebParam(name = "subject", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String subject,
        @WebParam(name = "docBytes", targetNamespace = "https://edelivery.egov.bg/services/integration")
        byte[] docBytes,
        @WebParam(name = "docNameWithExtension", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String docNameWithExtension,
        @WebParam(name = "docRegNumber", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String docRegNumber,
        @WebParam(name = "receiverType", targetNamespace = "https://edelivery.egov.bg/services/integration")
        indexbg.pdoi.wsclient.edelivery.EProfileType receiverType,
        @WebParam(name = "receiverUniqueIdentifier", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String receiverUniqueIdentifier,
        @WebParam(name = "receiverPhone", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String receiverPhone,
        @WebParam(name = "receiverEmail", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String receiverEmail,
        @WebParam(name = "serviceOID", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String serviceOID,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetSentDocumentContent", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentContent")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentContent", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentContentResponse")
    @RequestWrapper(localName = "GetSentDocumentContent", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentDocumentContent")
    @ResponseWrapper(localName = "GetSentDocumentContentResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentDocumentContentResponse")
    @WebResult(name = "GetSentDocumentContentResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.DcDocument getSentDocumentContent(
        @WebParam(name = "documentId", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Integer documentId,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetReceivedMessagesListPaged", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessagesListPaged")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessagesListPaged", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessagesListPagedResponse")
    @RequestWrapper(localName = "GetReceivedMessagesListPaged", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetReceivedMessagesListPaged")
    @ResponseWrapper(localName = "GetReceivedMessagesListPagedResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetReceivedMessagesListPagedResponse")
    @WebResult(name = "GetReceivedMessagesListPagedResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.DcPartialListOfDcMessageHR29GRRX getReceivedMessagesListPaged(
        @WebParam(name = "onlyNew", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Boolean onlyNew,
        @WebParam(name = "pageNumber", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Integer pageSize,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetReceivedMessageContent", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessageContent")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessageContent", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetReceivedMessageContentResponse")
    @RequestWrapper(localName = "GetReceivedMessageContent", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetReceivedMessageContent")
    @ResponseWrapper(localName = "GetReceivedMessageContentResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetReceivedMessageContentResponse")
    @WebResult(name = "GetReceivedMessageContentResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.DcMessageDetails getReceivedMessageContent(
        @WebParam(name = "messageId", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Integer messageId,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetSentDocumentStatusByRegNum", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentStatusByRegNum")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentStatusByRegNum", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentStatusByRegNumResponse")
    @RequestWrapper(localName = "GetSentDocumentStatusByRegNum", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentDocumentStatusByRegNum")
    @ResponseWrapper(localName = "GetSentDocumentStatusByRegNumResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentDocumentStatusByRegNumResponse")
    @WebResult(name = "GetSentDocumentStatusByRegNumResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.DcMessageDetails getSentDocumentStatusByRegNum(
        @WebParam(name = "documentRegistrationNumber", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String documentRegistrationNumber,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetSentDocumentsContent", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentsContent")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentsContent", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentsContentResponse")
    @RequestWrapper(localName = "GetSentDocumentsContent", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentDocumentsContent")
    @ResponseWrapper(localName = "GetSentDocumentsContentResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentDocumentsContentResponse")
    @WebResult(name = "GetSentDocumentsContentResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.ArrayOfDcDocument getSentDocumentsContent(
        @WebParam(name = "messageId", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Integer messageId,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetSentMessagesListPaged", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessagesListPaged")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessagesListPaged", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentMessagesListPagedResponse")
    @RequestWrapper(localName = "GetSentMessagesListPaged", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentMessagesListPaged")
    @ResponseWrapper(localName = "GetSentMessagesListPagedResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentMessagesListPagedResponse")
    @WebResult(name = "GetSentMessagesListPagedResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.DcPartialListOfDcMessageHR29GRRX getSentMessagesListPaged(
        @WebParam(name = "pageNumber", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.Integer pageSize,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );

    @WebMethod(operationName = "GetSentDocumentContentByRegNum", action = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentContentByRegNum")
    @Action(input = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentContentByRegNum", output = "https://edelivery.egov.bg/services/integration/IEDeliveryIntegrationService/GetSentDocumentContentByRegNumResponse")
    @RequestWrapper(localName = "GetSentDocumentContentByRegNum", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentDocumentContentByRegNum")
    @ResponseWrapper(localName = "GetSentDocumentContentByRegNumResponse", targetNamespace = "https://edelivery.egov.bg/services/integration", className = "indexbg.pdoi.wsclient.edelivery.GetSentDocumentContentByRegNumResponse")
    @WebResult(name = "GetSentDocumentContentByRegNumResult", targetNamespace = "https://edelivery.egov.bg/services/integration")
    public indexbg.pdoi.wsclient.edelivery.DcDocument getSentDocumentContentByRegNum(
        @WebParam(name = "documentRegistrationNumber", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String documentRegistrationNumber,
        @WebParam(name = "operatorEGN", targetNamespace = "https://edelivery.egov.bg/services/integration")
        java.lang.String operatorEGN
    );
}

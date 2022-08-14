
package ServiceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ServiceClient package. 
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

    private final static QName _AddNew_QNAME = new QName("http://services/", "addNew");
    private final static QName _AddNewResponse_QNAME = new QName("http://services/", "addNewResponse");
    private final static QName _Delete_QNAME = new QName("http://services/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://services/", "deleteResponse");
    private final static QName _FindAll_QNAME = new QName("http://services/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://services/", "findAllResponse");
    private final static QName _FindByRollNo_QNAME = new QName("http://services/", "findByRollNo");
    private final static QName _FindByRollNoResponse_QNAME = new QName("http://services/", "findByRollNoResponse");
    private final static QName _SinhVien_QNAME = new QName("http://services/", "sinhVien");
    private final static QName _Update_QNAME = new QName("http://services/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://services/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ServiceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNew }
     * 
     */
    public AddNew createAddNew() {
        return new AddNew();
    }

    /**
     * Create an instance of {@link AddNewResponse }
     * 
     */
    public AddNewResponse createAddNewResponse() {
        return new AddNewResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindByRollNo }
     * 
     */
    public FindByRollNo createFindByRollNo() {
        return new FindByRollNo();
    }

    /**
     * Create an instance of {@link FindByRollNoResponse }
     * 
     */
    public FindByRollNoResponse createFindByRollNoResponse() {
        return new FindByRollNoResponse();
    }

    /**
     * Create an instance of {@link SinhVien }
     * 
     */
    public SinhVien createSinhVien() {
        return new SinhVien();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNew }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNew }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "addNew")
    public JAXBElement<AddNew> createAddNew(AddNew value) {
        return new JAXBElement<AddNew>(_AddNew_QNAME, AddNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNewResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "addNewResponse")
    public JAXBElement<AddNewResponse> createAddNewResponse(AddNewResponse value) {
        return new JAXBElement<AddNewResponse>(_AddNewResponse_QNAME, AddNewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByRollNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByRollNo }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findByRollNo")
    public JAXBElement<FindByRollNo> createFindByRollNo(FindByRollNo value) {
        return new JAXBElement<FindByRollNo>(_FindByRollNo_QNAME, FindByRollNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByRollNoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByRollNoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "findByRollNoResponse")
    public JAXBElement<FindByRollNoResponse> createFindByRollNoResponse(FindByRollNoResponse value) {
        return new JAXBElement<FindByRollNoResponse>(_FindByRollNoResponse_QNAME, FindByRollNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SinhVien }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SinhVien }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "sinhVien")
    public JAXBElement<SinhVien> createSinhVien(SinhVien value) {
        return new JAXBElement<SinhVien>(_SinhVien_QNAME, SinhVien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}

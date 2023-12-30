
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Banque_Service", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retirer", targetNamespace = "http://Service/", className = "service.Retirer")
    @ResponseWrapper(localName = "retirerResponse", targetNamespace = "http://Service/", className = "service.RetirerResponse")
    @Action(input = "http://Service/Banque_Service/retirerRequest", output = "http://Service/Banque_Service/retirerResponse")
    public int retirer(
        @WebParam(name = "arg0", targetNamespace = "")
        Compte arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @return
     *     returns java.util.List<service.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://Service/", className = "service.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://Service/", className = "service.GetComptesResponse")
    @Action(input = "http://Service/Banque_Service/getComptesRequest", output = "http://Service/Banque_Service/getComptesResponse")
    public List<Compte> getComptes();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setHistorique", targetNamespace = "http://Service/", className = "service.SetHistorique")
    @ResponseWrapper(localName = "setHistoriqueResponse", targetNamespace = "http://Service/", className = "service.SetHistoriqueResponse")
    @Action(input = "http://Service/Banque_Service/setHistoriqueRequest", output = "http://Service/Banque_Service/setHistoriqueResponse")
    public int setHistorique(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveCompte", targetNamespace = "http://Service/", className = "service.SaveCompte")
    @ResponseWrapper(localName = "saveCompteResponse", targetNamespace = "http://Service/", className = "service.SaveCompteResponse")
    @Action(input = "http://Service/Banque_Service/saveCompteRequest", output = "http://Service/Banque_Service/saveCompteResponse")
    public Compte saveCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        Compte arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://Service/", className = "service.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://Service/", className = "service.GetCompteResponse")
    @Action(input = "http://Service/Banque_Service/getCompteRequest", output = "http://Service/Banque_Service/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verser", targetNamespace = "http://Service/", className = "service.Verser")
    @ResponseWrapper(localName = "verserResponse", targetNamespace = "http://Service/", className = "service.VerserResponse")
    @Action(input = "http://Service/Banque_Service/verserRequest", output = "http://Service/Banque_Service/verserResponse")
    public int verser(
        @WebParam(name = "arg0", targetNamespace = "")
        Compte arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Float arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<service.Historique>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHist", targetNamespace = "http://Service/", className = "service.GetHist")
    @ResponseWrapper(localName = "getHistResponse", targetNamespace = "http://Service/", className = "service.GetHistResponse")
    @Action(input = "http://Service/Banque_Service/getHistRequest", output = "http://Service/Banque_Service/getHistResponse")
    public List<Historique> getHist(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getActe", targetNamespace = "http://Service/", className = "service.GetActe")
    @ResponseWrapper(localName = "getActeResponse", targetNamespace = "http://Service/", className = "service.GetActeResponse")
    @Action(input = "http://Service/Banque_Service/getActeRequest", output = "http://Service/Banque_Service/getActeResponse")
    public String getActe(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "exist", targetNamespace = "http://Service/", className = "service.Exist")
    @ResponseWrapper(localName = "existResponse", targetNamespace = "http://Service/", className = "service.ExistResponse")
    @Action(input = "http://Service/Banque_Service/existRequest", output = "http://Service/Banque_Service/existResponse")
    public boolean exist(
        @WebParam(name = "arg0", targetNamespace = "")
        Compte arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "transfert", targetNamespace = "http://Service/", className = "service.Transfert")
    @ResponseWrapper(localName = "transfertResponse", targetNamespace = "http://Service/", className = "service.TransfertResponse")
    @Action(input = "http://Service/Banque_Service/transfertRequest", output = "http://Service/Banque_Service/transfertResponse")
    public int transfert(
        @WebParam(name = "arg0", targetNamespace = "")
        Compte arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Float arg1);

}
